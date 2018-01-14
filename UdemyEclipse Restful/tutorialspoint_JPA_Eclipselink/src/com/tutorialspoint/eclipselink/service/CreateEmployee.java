package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entit.Employee;

public class CreateEmployee {

	public static void main( String[ ] args )  
	 { 
	  EntityManagerFactory emfactory = Persistence. 
	    createEntityManagerFactory( "santhu" ); 
	  EntityManager entitymanager = emfactory. 
	    createEntityManager( ); 
	  entitymanager.getTransaction( ).begin( ); 
	   
	  Employee employee = new Employee( );  
	  employee.setEid( 1203 ); 
	  employee.setEname( "sudha" ); 
	  employee.setSalary( 40001 ); 
	  employee.setDeg( "Manager" ); 
	  entitymanager.persist( employee ); 

	entitymanager.getTransaction( ).commit( ); 
	   
	  entitymanager.close( ); 
	  emfactory.close( ); 
	 } 
	}
