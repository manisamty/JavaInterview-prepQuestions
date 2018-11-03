package com.list.method.variable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Address {

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

class EmployeeList {

	private int eid;
	private List<Address> add;
	private String ename;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public List<Address> getAdd() {
		return add;
	}

	public void setAdd(List<Address> add) {
		this.add = add;
	}

}

public class List_variable_Test {
	public static void main(String[] args) {
		
		Address ad= new Address();
		ad.setCity("BBSR");
		
		Address ad1= new Address();
		ad1.setCity("Bangalore");
		
		
		List<Address> al1=new ArrayList<>();
		al1.add(ad);
		al1.add(ad1);
		
		
		EmployeeList empList = new EmployeeList();
		empList.setEid(10002);
		empList.setEname("Manisa");
		empList.setAdd(al1);
		
		EmployeeList empList1 = new EmployeeList();
		empList1.setEid(10001);
		empList1.setEname("Abinash");
		empList1.setAdd(al1);
		
		
	Iterator<Address> itr=al1.iterator();
	while(itr.hasNext()){
		System.out.println("Emp ID :"+empList1.getEid()+"  Address :"+itr.next().getCity()+ " Emp_Name : " + empList1.getEname());
		System.out.println("Emp ID :"+empList.getEid()+"  Address :"+itr.next().getCity()+ " Emp_Name : " + empList.getEname());
		
	}
		
		
		

		
		
		/*for(EmployeeList el:eml)
			System.out.println("Emp Id : " +el.getEid()+" Ename :"+el.getEname());
			for(Address adr:al1)
				System.out.println("Address : "+adr.getCity());*/
	
	}
	
}
