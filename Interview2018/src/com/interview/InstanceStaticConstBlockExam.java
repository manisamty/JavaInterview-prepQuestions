package com.interview;

class BlockTest{

	public BlockTest(){
	
	System.out.println(" default Cons  :");
	
}
	public BlockTest(int i){
		System.out.println("parameterized cons :");
	}
static{
	
	System.out.println("static block :");
}

{
	System.out.println("initalization block : ");
}
public void method1(){
	System.out.println("method :");
}
}

public class InstanceStaticConstBlockExam {
	
	public static void main(String[] args) {
		BlockTest b=new BlockTest();
		BlockTest b1=new BlockTest(9);
		
		
		b.method1();
	}
}