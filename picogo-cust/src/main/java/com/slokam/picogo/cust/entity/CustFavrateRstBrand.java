package com.slokam.picogo.cust.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class CustFavrateRstBrand implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  rstBrandCode;
   @ManyToOne() 
@JoinColumn(name="fkid18") 
   private Cust  customer;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public String getRstBrandCode() {
		return rstBrandCode;
	}
public void setRstBrandCode(String rstBrandCode) {
		this.rstBrandCode = rstBrandCode;
	}
public Cust getCustomer() {
		return customer;
	}
public void setCustomer(Cust customer) {
		this.customer = customer;
	}
}