package com.interview;

//Java code for serialization and deserialization 
//of a Java object
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Demo implements java.io.Serializable
{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public int id;
 public String name;

 // Default constructor
 public Demo(int id, String name)
 {
     this.id = id;
     this.name = name;
 }

}

public class SerliazableExam
{
 public static void main(String[] args)
 {   
     Demo object = new Demo(1, "Manisa");
     String filename = "file.ser";
      
     // Serialization 
     try
     {   
         //Saving of object in a file
         FileOutputStream file = new FileOutputStream(filename);
         ObjectOutputStream out = new ObjectOutputStream(file);
          
         // Method for serialization of object
         out.writeObject(object);
          
         out.close();
         file.close();
          
         System.out.println("Object has been serialized");

     }
      
     catch(IOException ex)
     {
         System.out.println("IOException is caught");
     }


     Demo object1 = null;

     // Deserialization
     try
     {   
         // Reading the object from a file
         FileInputStream file = new FileInputStream(filename);
         ObjectInputStream in = new ObjectInputStream(file);
          
         // Method for deserialization of object
         object1 = (Demo)in.readObject();
          
         in.close();
         file.close();
          
         System.out.println("Object has been deserialized ");
         System.out.println("id = " + object1.id);
         System.out.println("name = " + object1.name);
     }
      
     catch(IOException ex)
     {
         System.out.println("IOException is caught");
     }
      
     catch(ClassNotFoundException ex)
     {
         System.out.println("ClassNotFoundException is caught");
     }

 }
}