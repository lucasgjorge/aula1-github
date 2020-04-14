package exerciocio1;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    product product = new product();
	    
	    System.out.println("enter product data: ");
	    System.out.print("name: ");
	    product.name = sc.nextLine();
	    System.out.print("price: ");
	    product.price = sc.nextDouble();
	    System.out.print("quantity: ");
	    product.quantity = sc.nextInt();
	    
	    System.out.println(product);
	    
	    
	    
	    
	    
	    
	    
	    sc.close();
	    
	}

}
