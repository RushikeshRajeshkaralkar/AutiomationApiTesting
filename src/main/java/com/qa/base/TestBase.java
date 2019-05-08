package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;

public class TestBase {
	
	  public static Properties pro;
	    
	     public TestBase() {
			// TODO Auto-generated constructor stub
	    	 
	    	 
	    	 
	    	 try {
	    		 pro=new Properties();
	    		 FileInputStream file=new FileInputStream("C:\\Users\\Rushikesh\\Desktop\\SeleniumAutomation\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
	    		 pro.load(file);
	    		 
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	     

}
