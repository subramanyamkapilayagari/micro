package com.slokam.picogo.cust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.picogo.cust.entity.CustDevices;
import com.slokam.picogo.cust.service.CustDevicesService;

@RestController
@RequestMapping("CustDevices") 
public class CustDevicesController {
	 @Autowired
	 private CustDevicesService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<CustDevices>	 saveCustDevices(@RequestBody CustDevices obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<CustDevices>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<CustDevices>	 deleteCustDevices(@RequestBody CustDevices obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<CustDevices>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<CustDevices>> getAllCustDevices(){
		 List<CustDevices> list = service.getAll();
		 return new ResponseEntity<List<CustDevices>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<CustDevices> getByIdCustDevices(@PathVariable Integer id) {
		  CustDevices obj =  service.getById(id);
		  return new ResponseEntity<CustDevices>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/{id}") 
	 public ResponseEntity<CustDevices>	 
	 deleteCustDevices(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<CustDevices>(HttpStatus.OK);
	 }
}

