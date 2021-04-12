package com.slokam.picogo.cust.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class CustFavrateItem implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  itemCode;
   @ManyToOne() 
@JoinColumn(name="fkid17") 
   private Cust  customer;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public String getItemCode() {
		return itemCode;
	}
public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
public Cust getCustomer() {
		return customer;
	}
public void setCustomer(Cust customer) {
		this.customer = customer;
	}
}