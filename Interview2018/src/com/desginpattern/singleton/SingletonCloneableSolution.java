package com.desginpattern.singleton;
// JAVA code to explain cloning 
// issue with singleton
class SuperClass1 implements Cloneable
{
  int i = 10;
 
  @Override
  protected Object clone() throws CloneNotSupportedException 
  {
    return super.clone();
  }
}
 
// Singleton class
class Singleton1 extends SuperClass1
{
  // public instance initialized when loading the class
  public static Singleton1 instance = new Singleton1();
 
  private Singleton1() 
  {
    // private constructor
  }
  public Object clone() throws CloneNotSupportedException 
  {
	  throw new CloneNotSupportedException();
  }
}
 
public class SingletonCloneableSolution
{
  public static void main(String[] args) throws CloneNotSupportedException 
  {
    Singleton1 instance1 = Singleton1.instance;
    Singleton1 instance2 = (Singleton1) instance1.clone();
    System.out.println("instance1 hashCode:- "
                           + instance1.hashCode());
    System.out.println("instance2 hashCode:- "
                           + instance2.hashCode()); 
  }
}
