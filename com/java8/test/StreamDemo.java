package com.java8.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {


        List<Product> products = Arrays.asList(new Product(1,"A",150.25),
                new Product(2,"B",45.56),
                new Product(3,"C",120.55),
                new Product(4,null,152.25));

        products.stream().filter(e->e.getPrice()>50).forEach(System.out::println);

        Predicate<Product> p1 = e -> e.getPrice()>130;
        Predicate<Product> p2 = e -> e.getName().equalsIgnoreCase("D");

        products.stream().filter(p1.and(p2)).forEach(System.out::println);
System.out.println("-1--------");
        List<String> names = new ArrayList<>();
                products.stream().map(e -> e.getName()).forEach(names::add);
                names.stream().forEach(System.out::print);
        System.out.println("--2-------");
        List<String> names1= products.stream().filter(e -> e.getName().equalsIgnoreCase("B")).map(e->e.getName()).collect(Collectors.toList());
        names1.stream().forEach(System.out::print);



    }
}

class Product {

    private int id;
    private String name;
    private double price;

    public Product(){

    }
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "["+this.id+","+this.name+","+this.price+"]";
    }
}
