package com.slokam.picogo.cust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picogo.cust.entity.CustAddressType;
import com.slokam.picogo.cust.service.CustAddressTypeService;

@RestController
@RequestMapping("CustAddressType") 
public class CustAddressTypeController {
	 @Autowired
	 private CustAddressTypeService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<CustAddressType>	 saveCustAddressType(@RequestBody CustAddressType obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<CustAddressType>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<CustAddressType>	 deleteCustAddressType(@RequestBody CustAddressType obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<CustAddressType>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<CustAddressType>> getAllCustAddressType(){
		 List<CustAddressType> list = service.getAll();
		 return new ResponseEntity<List<CustAddressType>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<CustAddressType> getByIdCustAddressType(@PathVariable Integer id) {
		  CustAddressType obj =  service.getById(id);
		  return new ResponseEntity<CustAddressType>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<CustAddressType>	 
	 deleteCustAddressType(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<CustAddressType>(HttpStatus.OK);
	 }
}

