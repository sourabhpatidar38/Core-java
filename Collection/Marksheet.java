package com.sourabhproject.collection;

/**
 * @author sourabh
 * Program for Comparable Interface
 */
public class Marksheet implements Comparable<Marksheet>{

	private String rollNo;
	private String fname;
	private String lname;
	private int phy;
	private int chem;
	private int maths;
	
		
	public Marksheet() {}


	public String getRollNo() {
		return rollNo;
	}


	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public int getPhy() {
		return phy;
	}


	public void setPhy(int phy) {
		this.phy = phy;
	}


	public int getChem() {
		return chem;
	}


	public void setChem(int chem) {
		this.chem = chem;
	}


	public int getMaths() {
		return maths;
	}


	public void setMaths(int maths) {
		this.maths = maths;
	}


	@Override
	public int compareTo(Marksheet o) {
		return rollNo.compareTo(o.rollNo);
	}
	
	
}
