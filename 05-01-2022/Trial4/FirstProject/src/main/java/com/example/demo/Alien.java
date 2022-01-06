package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// this is a simple pojo

@Component // it is used to tell spring boot that this is a class whose objects i want
// without this yoi will get "NoSuchBeanDefinitionException"
// when you do this..in spring contrainer an object of Alien will be made
// now this is a spring bean
@Scope(value = "prototype")
// this is used when you want to create the object when you require this
// when @component was used the object of Alien will be created automatically
// ie. even if you dont create an object of Alien (Alien a = context.getBean(Alien.class);)
// "....object created" mentioned in the constructor will be printed
// so if you put @Scope, this wont happen
// only when you give "Alien a = context.getBean(Alien.class);", the object will be created
public class Alien {
	private int aid;
	private String aname;
	@Autowired // autowired will search for Laptop in spring container
	@Qualifier("lap1")
	private Laptop laptop;
	
	public Alien() {
		super();
		System.out.println("..object created");
	}

	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	private String tech;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void show() {
		System.out.println("in show");
		laptop.compile(); 
	}

}
