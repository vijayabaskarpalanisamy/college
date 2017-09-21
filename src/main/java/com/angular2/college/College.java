package com.angular2.college;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	
	@Column
	private String name; 
	
	@Column
	private String phoneno; 
	
	@Column
	private String department; 
	
	@Column
	private String city;

	@Column
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setCollege(String  phoneno) {
		this.phoneno=phoneno;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city= city;
	} 
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email= email;
	} 
	
	
	
}