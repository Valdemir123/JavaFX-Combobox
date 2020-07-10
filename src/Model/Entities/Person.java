package Model.Entities;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	private String Name;
	private String Email;
	
	public Person() {
	}

	public Person(Integer id, String name, String email) {
		Id = id;
		Name = name;
		Email = email;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", Name=" + Name + ", Email=" + Email + "]";
	}
}
