package com.interview;

import java.io.*;
public class ReadFromFile2
{
  public static void main(String[] args)throws Exception
  {
  
	  FileReader fr =
		      new FileReader("E:\\test.txt");
		 
		    int i;
		    while ((i=fr.read()) != -1)
		      System.out.print((char) i);
		  }
		}
