package com.slokam.picogo.cust.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class RatingOnCust implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  rstBranchCode;
   @ManyToOne() 
@JoinColumn(name="fkid23") 
   private Cust  customer;
  private Integer  rating;
  private String  note;
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
public Integer getRating() {
		return rating;
	}
public void setRating(Integer rating) {
		this.rating = rating;
	}
public String getNote() {
		return note;
	}
public void setNote(String note) {
		this.note = note;
	}
}