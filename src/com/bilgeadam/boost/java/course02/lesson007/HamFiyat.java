package com.bilgeadam.boost.java.course02.lesson007;

import java.util.Scanner;

public class HamFiyat {
    //Berna BAYKAN
	//Bir ürünün satış fiyatının içinde %18 KDV ve %15 kar olduğunu biliyoruz. Ürünün ham fiyatı nedir?
	// satış fiyatı = endprice   KDV'siz fiyat = priceWithoutVAT hamfiyat = rawPrice  
	
	public static void main(String[] args) {
		
		double endPrice ;
		double priceWithoutVAT ;
		double rawPrice ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Satış Fiyatı(endprice) giriniz:");
		endPrice = scanner.nextInt(); 
		
	
        priceWithoutVAT =  ( (endPrice *100) / ( 100 + 18 ) );
        		
        rawPrice = ( ( priceWithoutVAT * 100 ) / ( 100 + 15 ) );
        
        System.out.println("Ham fiyat"+ " " + rawPrice);
        
        scanner.close(); 
	}

}
