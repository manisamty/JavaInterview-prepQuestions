package com.interview;


//Method Overloading Example
public class PolymorphismExample {

/*	public void withdraw(String s){
	System.out.println("Withdraw 500 from SBI bank");
}

public void withdraw(){
	System.out.println("Withdraw 200 from ICICI bank");
}

public static void main(String[] args) {
	

PolymorphismExample  pm=new PolymorphismExample();
pm.withdraw("SBI");
}
}*/
	PolymorphismExample get(){return this;}
}

class B1 extends PolymorphismExample{
	PolymorphismExample get(){return this;}
void message(){System.out.println("welcome to covariant return type");}

public static void main(String args[]){
//new PolymorphismExample().get().message();
}
}


