package com.upcasting.downcasting;

import java.util.ArrayList;

class Base {

	public void k() {

		System.out.println("j");
	}
}

class Sub extends Base {
	public void k() {

		System.out.println("k");
	}
}

public class RefernceTypecatArrayListTest {

	public static void main(String[] args) {
		ArrayList<Base> j = new ArrayList<Base>();
		j.add(new Base());
		j.add(new Sub());
/*Sub s=new Sub();
 s.k();
//System.out.println(s.k());
*/		ArrayList<?> m = new ArrayList<Sub>();
		ArrayList<?> m1=m;
		ArrayList<Base> j1 =  (ArrayList<Base>)m;
		//j1.add(s);
		
	
	}

}
