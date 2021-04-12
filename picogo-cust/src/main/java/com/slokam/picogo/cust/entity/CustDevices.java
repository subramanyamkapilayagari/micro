package com.slokam.picogo.cust.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class CustDevices implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  deviceType;
   @ManyToOne() 
@JoinColumn(name="fkid24") 
   private Cust  customer;
  private String  deviceIpaddress;
  private String  browser;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public String getDeviceType() {
		return deviceType;
	}
public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
public Cust getCustomer() {
		return customer;
	}
public void setCustomer(Cust customer) {
		this.customer = customer;
	}
public String getDeviceIpaddress() {
		return deviceIpaddress;
	}
public void setDeviceIpaddress(String deviceIpaddress) {
		this.deviceIpaddress = deviceIpaddress;
	}
public String getBrowser() {
		return browser;
	}
public void setBrowser(String browser) {
		this.browser = browser;
	}
}