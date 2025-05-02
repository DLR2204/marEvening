package com;

import org.springframework.stereotype.Component;

@Component("add")
public class Address {
	
	private int hno;
	
	private String col;
	
	private int pincode;
	
	private String state;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int hno, String col, int pincode, String state) {
		super();
		this.hno = hno;
		this.col = col;
		this.pincode = pincode;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", col=" + col + ", pincode=" + pincode + ", state=" + state + "]";
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getCol() {
		return col;
	}

	public void setCol(String col) {
		this.col = col;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

}
