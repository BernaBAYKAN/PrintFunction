package com.bilgeadam.boost.java.course02.lesson007;

import java.util.Scanner;
//Berna BAYKAN
// Fanrenheit biriminden celcius birimine dönüştürme [C =(F - 32)*1.8]

public class FahrenheitoCelcius {

	public static void main(String[] args) {
		
		double C;
		double F;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Fahrenheit (F) giriniz:");
		F = scanner.nextInt(); 
		
		C = (F - 32) * 1.8;
		
		
		System.out.println("Celcius:" +" " + C);
				
	    scanner.close();

	}

}
