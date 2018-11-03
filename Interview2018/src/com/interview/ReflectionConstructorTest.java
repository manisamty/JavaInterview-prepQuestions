package com.interview;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Reflect{
	private Reflect(){
		System.out.println("Rflect cons :");
	}
}


public class ReflectionConstructorTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

Constructor constructor = Reflect.class.getConstructor(Reflect.class);

Reflect myObject = (Reflect)
        constructor.newInstance("constructor-arg1");
	System.out.println(myObject);
	}

}
