package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV",900.00));
		list.add(new Product("Phone",1100.00));
		list.add(new Product("Watch", 250.00));
		
		//Comparator implemented through lambda expression -- much less verbose
		//This is an anonymous function (or arrow function)
		Comparator<Product> comp = (p1,p2)-> { //syntax: (parameters) ->(arrow) { implementation};
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());	
			
		};
		
		list.sort(comp);

		//Print products ordered by name
		for(Product p:list) {
			System.out.println(p);
		}
	}

}
