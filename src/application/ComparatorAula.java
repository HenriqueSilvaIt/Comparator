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
	
		// ArrowFunction Sintaxe
		/*Comparator<Product> comp = (p1, p2) ->{
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};*/
		
		/*Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
			}
		
		};*/
		
		p.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		
		
		/* p.sort(new MyComparator()); */
		
		for (Product o : p) { // aqui no for é sempre colocado o tipo de dado que contém
			// dentro da lista
			System.out.println(o);
		}
		
	
	}

}
