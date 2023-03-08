package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TRUST_DONOR_DETAILS")
public class model {
	@Id
	private long phone_number;
	private String name;
	private int age;
	private int AMOUNT;
	
	
	 public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(int aMOUNT) {
		AMOUNT = aMOUNT;
	}
	/**
	 * @param phone_number
	 * @param name
	 * @param age
	 * @param aMOUNT
	 */
	public model(long phone_number, String name, int age, int aMOUNT) {
		super();
		this.phone_number = phone_number;
		this.name = name;
		this.age = age;
		AMOUNT = aMOUNT;
		
	}
	public model() {
	 
 }
	public String toString() {
		return "phone_number="+phone_number+"name="+name+"age="+age+"aMOUNT="+AMOUNT;
	}
	

	
}
