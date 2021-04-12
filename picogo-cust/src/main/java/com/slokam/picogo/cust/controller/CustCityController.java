package com.slokam.picogo.cust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picogo.cust.entity.CustCity;
import com.slokam.picogo.cust.service.CustCityService;

@RestController
@RequestMapping("CustCity") 
public class CustCityController {
	 @Autowired
	 private CustCityService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<CustCity>	 saveCustCity(@RequestBody CustCity obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<CustCity>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<CustCity>	 deleteCustCity(@RequestBody CustCity obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<CustCity>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<CustCity>> getAllCustCity(){
		 List<CustCity> list = service.getAll();
		 return new ResponseEntity<List<CustCity>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<CustCity> getByIdCustCity(@PathVariable Integer id) {
		  CustCity obj =  service.getById(id);
		  return new ResponseEntity<CustCity>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<CustCity>	 
	 deleteCustCity(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<CustCity>(HttpStatus.OK);
	 }
}

