package com.chitta;

public class PersonService {

	public static Person savePerson(Person person) {
		
		
		Person p = new Person();
		p.setId(person.getId());
		p.setName(person.getName());
		
		return p;
	}

	/*
	 * public static Person getPerson(int id) { // TODO Auto-generated method stub
	 * return null; }
	 */

}
