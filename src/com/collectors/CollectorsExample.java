package com.collectors;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.List;  
import java.util.ArrayList;  
class Product {
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}

public class CollectorsExample {

    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<Product>();  
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        Double sumPrices =   
                productsList.stream().collect(Collectors.summingDouble(x->x.price));
        System.out.println("Sum of prices : "+sumPrices);

        int sumId =
                productsList.stream().mapToInt(x -> x.id).sum();
        System.out.println("Sum of id's : "+sumId);

        Set<Float> productPriceList =
                productsList.stream()
                        .map(x->x.price)
                        .collect(Collectors.toSet());
        System.out.println("Product Price List : "+productPriceList);

        Double average = productsList.stream()
                .collect(Collectors.averagingDouble(p->p.price));
        System.out.println("Average price is : "+average);

        Long noOfElements = productsList.stream()
                .collect(Collectors.counting());
        System.out.println("Total elements : "+noOfElements);
    }  
} 