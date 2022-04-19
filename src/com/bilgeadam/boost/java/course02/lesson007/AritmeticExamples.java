package com.bilgeadam.boost.java.course02.lesson007;

import java.util.Scanner;

public class AritmeticExamples {

	public static void main(String[] args) {
		
		int x;
		
		//Kullanıcıdan bilgi almak için Scanner yapısını kullandık.
		Scanner scanner = new Scanner(System.in); // import, ctrl+shift+o ettik, system.in klavye demek
		
		//Kullanıcının göreceği mesajı belirttim.
		System.out.println("Lütfen bir sayı giriniz:");
		
		// Kullanıcının girdiği sayıyı okuyabilmek için kullandığımız scanner'ı ve okuyacağı veri tipini belirtiyoruz.
		x = scanner.nextInt();
		
		x++;
		
        
		//Kullanıcıdan okuduğumuz veriyi x değişkenine atadık ve yazdırdık.
		System.out.println(x);
        
		
        scanner.close();
	}

}
