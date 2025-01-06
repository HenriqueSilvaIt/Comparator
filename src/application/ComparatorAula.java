package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import entities.Product;



public class ComparatorAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		List<Product> p = new ArrayList<>();
		
		p.add(new Product("Tv", 900.00));
		p.add(new Product("Notebook", 1200.0));
		p.add(new Product("Tablet", 450.00));
		
		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

	
	p.sort(comp);
		
		/* p.sort(new MyComparator()); */
		
		for (Product o : p) { // aqui no for é sempre colocado o tipo de dado que contém
			// dentro da lista
			System.out.println(o);
		}
		
	
	}

}
