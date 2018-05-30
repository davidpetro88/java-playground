package academy.learnprogramming.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

	@SerializedName("street")
	@Expose
	String street;

	@SerializedName("city")
	@Expose
    String city;

    @SerializedName("state")
    @Expose
    String state;

    public Address(String street, String city, String state) {
    	this.street = street;
    	this.city = city;
    	this.state = state;
    }

    public String getStreet() {
    	return street;
    }

    public void setStreet(String street) {
    	this.street = street;
    }

    public String getCity() {
    	return city;
    }

    public void setCity(String city) {
    	this.city = city;
    }

     public String getState() {
    	return state;
    }

    public void setState(String state) {
    	this.state = state;
    }

}
