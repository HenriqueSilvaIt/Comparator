package entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// O príncipio aqui é igual no comparable
		// deve retornar uma número inteiro que deve ser positivo caso primeiro seja maior que segundo
		// tem que ser zero se os 2 forem iguais
		// ou tem que  negativo se o primeiro for menor que o segundo
		return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
			
	}

}
