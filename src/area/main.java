package area;

import java.util.Locale;
import java.util.Scanner;

import entities.rectangle;


public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		rectangle retangulo = new rectangle();
		
		System.out.print("escolha a largura do retangulo: ");
		retangulo.width = sc.nextDouble();
		System.out.print("escolha a altura do retangulo: ");
		retangulo.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETRO = %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
	
		
		sc.close();


	    }
	}


