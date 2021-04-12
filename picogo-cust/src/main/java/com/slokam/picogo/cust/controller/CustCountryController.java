package com.slokam.picogo.cust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picogo.cust.entity.CustCountry;
import com.slokam.picogo.cust.service.CustCountryService;

@RestController
@RequestMapping("CustCountry") 
public class CustCountryController {
	 @Autowired
	 private CustCountryService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<CustCountry>	 saveCustCountry(@RequestBody CustCountry obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<CustCountry>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<CustCountry>	 deleteCustCountry(@RequestBody CustCountry obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<CustCountry>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<CustCountry>> getAllCustCountry(){
		 List<CustCountry> list = service.getAll();
		 return new ResponseEntity<List<CustCountry>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<CustCountry> getByIdCustCountry(@PathVariable Integer id) {
		  CustCountry obj =  service.getById(id);
		  return new ResponseEntity<CustCountry>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<CustCountry>	 
	 deleteCustCountry(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<CustCountry>(HttpStatus.OK);
	 }
}

