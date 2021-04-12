package com.slokam.picogo.cust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picogo.cust.entity.RatingOnCust;
import com.slokam.picogo.cust.service.RatingOnCustService;

@RestController
@RequestMapping("RatingOnCust") 
public class RatingOnCustController {
	 @Autowired
	 private RatingOnCustService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<RatingOnCust>	 saveRatingOnCust(@RequestBody RatingOnCust obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<RatingOnCust>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<RatingOnCust>	 deleteRatingOnCust(@RequestBody RatingOnCust obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<RatingOnCust>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<RatingOnCust>> getAllRatingOnCust(){
		 List<RatingOnCust> list = service.getAll();
		 return new ResponseEntity<List<RatingOnCust>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<RatingOnCust> getByIdRatingOnCust(@PathVariable Integer id) {
		  RatingOnCust obj =  service.getById(id);
		  return new ResponseEntity<RatingOnCust>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<RatingOnCust>	 
	 deleteRatingOnCust(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<RatingOnCust>(HttpStatus.OK);
	 }
}

