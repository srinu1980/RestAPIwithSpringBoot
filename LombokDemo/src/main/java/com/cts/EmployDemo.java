package com.cts;

import lombok.Data;

@Data
class Employ
{
	
	private int id;
	private String ename;
	private String job;
	
	
	
}
public class EmployDemo {

	public static void main(String[] args) {

		Employ emp=new Employ();
		
		emp.setId(111);
		emp.setEname("Syam");
		emp.setJob("Programmer");
		
		
	}

}
