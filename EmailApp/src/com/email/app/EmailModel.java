package com.email.app;

public class EmailModel {
	
	private String firstname;
	private String lastname;
	private String department;
	private String password;
	private String name;
	private int capacity;
	private String altemail;
	
	public String changePass;
	
	public String getChangePass() {
		return changePass;
	}
	public void setChangePass(String changePass) {
		this.changePass = changePass;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getAltemail() {
		return altemail;
	}
	public void setAltemail(String altemail) {
		this.altemail = altemail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((altemail == null) ? 0 : altemail.hashCode());
		result = prime * result + capacity;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailModel other = (EmailModel) obj;
		if (altemail == null) {
			if (other.altemail != null)
				return false;
		} else if (!altemail.equals(other.altemail))
			return false;
		if (capacity != other.capacity)
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Model [firstname=" + firstname + ", lastname=" + lastname + ", department=" + department + ", password="
				+ password + ", name=" + name + ", capacity=" + capacity + ", altemail=" + altemail + "]";
	}

	
	
}
