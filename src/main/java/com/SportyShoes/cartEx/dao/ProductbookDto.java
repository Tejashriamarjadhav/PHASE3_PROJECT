package com.SportyShoes.cartEx.dao;

public class ProductbookDto {
	private String firstName;
	private String lastName;
	private String email;
	private String streetaddress;
	private String city;
	private String zipcode;
	private String phoneno;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreetaddress() {
		return streetaddress;
	}
	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Probookdao [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", streetaddress="
				+ streetaddress + ", city=" + city + ", zipcode=" + zipcode + ", phoneno=" + phoneno + "]";
	}
	
	
}