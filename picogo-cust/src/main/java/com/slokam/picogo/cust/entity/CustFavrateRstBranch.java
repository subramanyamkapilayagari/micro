package com.slokam.picogo.cust.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class CustFavrateRstBranch implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  rstBranchCode;
   @ManyToOne() 
@JoinColumn(name="fkid19") 
   private Cust  customer;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public String getRstBranchCode() {
		return rstBranchCode;
	}
public void setRstBranchCode(String rstBranchCode) {
		this.rstBranchCode = rstBranchCode;
	}
public Cust getCustomer() {
		return customer;
	}
public void setCustomer(Cust customer) {
		this.customer = customer;
	}
}