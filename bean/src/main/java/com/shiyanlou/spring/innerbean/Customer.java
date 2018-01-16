package com.shiyanlou.spring.innerbean;

public class Customer {

	private Person person;

	@Override
	public String toString() {
		return "Customer [person=" + person + "]";
	}

	public Customer(){}
	
	public Customer(Person person) {
		super();
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
