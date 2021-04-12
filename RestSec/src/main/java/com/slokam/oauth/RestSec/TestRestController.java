package com.slokam.oauth.RestSec;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	 @GetMapping("test")
	 public String test() {
		   System.out.println("Test Test ...");
		   return "DATATAATT";
	 }
	 @GetMapping("/user/me")
	    public Principal user(Principal principal) {
		
	        return principal;
	    }
	 @GetMapping("/user/roles")
	 public Collection<String> getRoles() {
		 Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>)SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		 
		 
		 return authorities.stream().map(
			     (a) -> {
		    	  return a.getAuthority();
		         }
				 ).collect(Collectors.toList());
		 
		
		
	 }
	
}

class GrantedAuthorityImpl implements GrantedAuthority {
	
	private String authority;
	
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.authority;
	}
	
	
}