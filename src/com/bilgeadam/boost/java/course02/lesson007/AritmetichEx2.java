package com.bilgeadam.boost.java.course02.lesson007;

import java.util.Scanner;

public class AritmetichEx2 {
//  //kullanıcıdan alınan 2 sayının bölümü ve bölümden kalan değeri yazdır.
public static void main(String[] args) {
//		
//		double x;
//		double y;
//		
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("Lütfen bir x sayısı giriniz:");
//        x = scanner.nextInt();
//		
//		System.out.print("Lütfen bir y sayısı giriniz:");
//		y = scanner.nextInt();
//		
//		
//		System.out.println("Bölüm:"+(x/y));
//		System.out.println("Mod:"+(x%y));
//		
	
	//--------------------Üç tam sayı değişkeni tanımlayıp bunlarla yukarıda gösterilen işlemi yapıp çıktısını ekranda gösterin A*(B+C)
	
	
	int A,B,C,SONUC;  
	
	Scanner scanner = new Scanner(System.in); 
	
	System.out.print("Lütfen bir A sayısı giriniz:");
	A = scanner.nextInt(); 
	
	System.out.print("Lütfen bir B sayısı giriniz:");
	B = scanner.nextInt();
	
	System.out.print("Lütfen bir C sayısı giriniz:");
	C = scanner.nextInt();
	
	SONUC = A*(B+C);
	
	
	System.out.println(SONUC);
	
	scanner.close();

	}

}
