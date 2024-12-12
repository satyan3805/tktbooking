package com.sat.test.hbm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "C")
public class ContractEmployee extends Employee{
	private double contractDuration;
	private double hourlyPay;
	
	public ContractEmployee() {
		super();
	}
	public ContractEmployee(int empId, String empName, String empDOB, String empDOJ) {
		super(empId, empName, empDOB, empDOJ);
	}
	
	
	public ContractEmployee(double contractDuration, double hourlyPay) {
		super();
		this.contractDuration = contractDuration;
		this.hourlyPay = hourlyPay;
	}
	
	
	public double getContractDuration() {
		return contractDuration;
	}
	public void setContractDuration(double contractDuration) {
		this.contractDuration = contractDuration;
	}
	public double getHourlyPay() {
		return hourlyPay;
	}
	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	
}
