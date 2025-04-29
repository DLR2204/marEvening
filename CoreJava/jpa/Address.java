package jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	private int hno;
	
	private String col;
	
	private int pincode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
}
