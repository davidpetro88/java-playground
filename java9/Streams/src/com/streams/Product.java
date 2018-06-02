package com.streams;

public class Product {
    private  Integer id;
    private String name;
    private Category category;
    private Company company;

    public Product() { }

    public Product(Integer id, String name, Category category, Company company) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.company = company;
    }

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", company=" + company +
                '}';
    }
}
