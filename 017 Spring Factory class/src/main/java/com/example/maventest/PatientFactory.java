/**
 * 
 */
package com.example.maventest;


public class PatientFactory {
	public Patient createPatient(int id ,String name) {
		System.out.println("Using factory class to create Patient");
		return new Patient(id ,name );
	}

}
