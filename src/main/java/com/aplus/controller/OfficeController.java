package com.aplus.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aplus.model.HowOften;
import com.aplus.model.OfficeScheduler;
import com.aplus.model.OfficeTypeClean;
import com.aplus.model.SquareFeet;
import com.aplus.repository.OfficeRepository;

@CrossOrigin
@RestController
public class OfficeController {
	
	@Autowired
	private OfficeRepository officeRepository;

	
	
	@RequestMapping(value="/submitSchedulerDetails",
	         consumes=MediaType.APPLICATION_JSON_VALUE,
	         method=RequestMethod.POST)
	private void submitSchedulerDetails(@RequestBody OfficeScheduler officeScheduler) {
		System.out.println("SAVING Office Scheduler");
		this.officeRepository.save(officeScheduler);
	}
	
	@RequestMapping(value="/findByEmail", 
			produces=MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.GET)
	private ResponseEntity<Optional<OfficeScheduler>> findByEmail(String email) {
		Optional<OfficeScheduler> officeScheduler = this.officeRepository.findByEmail(email);
		return new ResponseEntity<Optional<OfficeScheduler>>(officeScheduler, HttpStatus.OK);
	}
	
	@RequestMapping(value="/aggregatePrice", 
			produces=MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	@ResponseBody
	private ResponseEntity<Optional<OfficeScheduler>> returnAggregatePrice(@RequestBody OfficeScheduler os) {
		System.out.println("AGGREGATING PRICE");
		//double aggregatePrice = os.getOfficeTypeClean.getPrice() + squareFeet.getPrice();	
		System.out.println(os.getOfficeTypeClean()+ "***");
//		double aggregatePrice = os.getOfficeTypeClean().getPrice() + os.getSquareFeet().getPrice() + os.getAddTip();
		double aggregatePrice = os.getSquareFeet().getPrice();
		//Optional<OfficeScheduler> os = null;
		if(os.getHowOften() == HowOften.WEEKLY) {
			aggregatePrice = 0.8 * aggregatePrice;
		} else if(os.getHowOften() == HowOften.TWO_WEEKS) {
			aggregatePrice = 0.825 * aggregatePrice;
		} else if(os.getHowOften() == HowOften.FOUR_WEEKS) {
			aggregatePrice = 0.85 * aggregatePrice;
		} else if(os.getHowOften() == HowOften.SIX_WEEKS) {
			aggregatePrice = 0.9 * aggregatePrice;
		} else if(os.getHowOften() == HowOften.EIGHT_WEEKS) {
			aggregatePrice = 0.925 * aggregatePrice;
		} else if(os.getHowOften() == HowOften.EVERY_QUARTER) {
		aggregatePrice = 0.95 * aggregatePrice;
		} 
		
		
		os.setAggregatePrice(aggregatePrice);
//		System.out.println("AGG PRICE= " + aggregatePrice + " office type = " + os.getOfficeTypeClean() + " sq ft = " + os.getSquareFeet());
		System.out.println("AGG PRICE= " + aggregatePrice + " sq ft = " + os.getSquareFeet());
		officeRepository.save(os);
		
		Optional<OfficeScheduler> osFromDB = officeRepository.findByEmail(os.getEmail());
		
		return new ResponseEntity<Optional<OfficeScheduler>>(osFromDB, HttpStatus.OK);
	}
	
	
	
	/* Might no longer need this mapping */
	@RequestMapping(value="/login", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	private ResponseEntity<Optional<OfficeScheduler>> login(@RequestBody OfficeScheduler officeScheduler) {
		Optional<OfficeScheduler> schedulerFromDB = this.officeRepository.findByEmail(officeScheduler.getEmail());
		if(schedulerFromDB.isPresent()) {
			if(schedulerFromDB.get().getPassword().equals(officeScheduler.getPassword())) {
				return new ResponseEntity<>(schedulerFromDB, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
			}
		} else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}
	
	
	@RequestMapping(value="/listOfOfficeSchedulers", 
	produces=MediaType.APPLICATION_JSON_VALUE,
	method = RequestMethod.GET)
	private ResponseEntity<List<OfficeScheduler>> listOfOficeSchedulers() {
       List<OfficeScheduler> officeSchedulers = this.officeRepository.findAll();
      
       return new ResponseEntity<List<OfficeScheduler>>(officeSchedulers, HttpStatus.OK);
		
	}
	
	
}
