package academy.learnprogramming.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import academy.learnprogramming.models.Address;

import java.util.List;
import java.util.ArrayList;

public class Person {

	@SerializedName("id")
	@Expose
	String id;

	@SerializedName("name")
	@Expose
    String name;

    @SerializedName("age")
    @Expose
    int age;

    @SerializedName("addresses")
    @Expose
    List<Address> addresses;

    public Person(String id, String name, Integer age) {
    	this.id = id;
    	this.name = name;
    	this.age = age;
        addresses = new ArrayList<>();
    }

    public String getID() {
    	return id;
    }

    public void setID(String id) {
    	this.id = id;
    }

    public String geName() {
    	return name;
    }

    public void setName(String name) {
    	this.name = name;
    }

     public int getAge() {
    	return age;
    }

    public void setAge(Integer age) {
    	this.age = age;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

}
