package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.MyComparator;
import entities.Product;

public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		List<Product> p = new ArrayList<>();
		
		p.add(new Product("Tv", 900.00));
		p.add(new Product("Notebook", 1200.0));
		p.add(new Product("Tablet", 450.00));
		
		p.sort(new MyComparator());
		
		for (Product o : p) { // aqui no for é sempre colocado o tipo de dado que contém
			// dentro da lista
			System.out.println(o);
		}
		
	
	}

}
