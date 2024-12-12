package com.sat.test.hbm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "R")
public class RegularEmployee extends Employee{
	private double salary;
	private double bonus;
	
	
	public RegularEmployee() {
		super();
	}
	public RegularEmployee(int empId, String empName, String empDOB, String empDOJ) {
		super(empId, empName, empDOB, empDOJ);
	}
	
	
	public RegularEmployee(double salary, double bonus) {
		super();
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
}
