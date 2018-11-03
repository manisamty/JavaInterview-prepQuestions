package com.interview;

class CloneableTest implements Cloneable{  
int id;  
String name;  
  
CloneableTest(int id,String name){  
this.id=id;  
this.name=name;  
}  
  
public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  
  
public static void main(String args[]){  
try{  
	CloneableTest s1=new CloneableTest(67,"Manisa");  
  
	CloneableTest s2=(CloneableTest)s1.clone();  
  
System.out.println(s1.id+" "+ s1.name);  
System.out.println(s2.id+" "+ s2.name);  
  
}catch(CloneNotSupportedException c){}  
  
}  
}  
