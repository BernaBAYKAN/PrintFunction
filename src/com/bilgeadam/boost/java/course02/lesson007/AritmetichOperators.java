package com.bilgeadam.boost.java.course02.lesson007;

public class AritmetichOperators {
 public static void main(String[] args) {
	 
	 double x = 2;
	 double y = 7;
	 
	 double sum;
	 double diff, multi,mod;
	 double div;
	 
	 sum = x + y;
	 diff = x-y;
	 multi = x* y;
	 div = x/y;
	 mod = x%y;
	 
//	 System.out.println(sum + " "+diff );
//	 System.out.println(diff);
//	 System.out.println(multi);
//	 System.out.println(div);
//	 System.out.println(mod);
	 System.out.println(x++);
	 System.out.println(x);
	 System.out.println(x--);
	 
	 //x += 5;
	 //x = x+5;
	 
	 double c = x -= 5;
	 x/=5;
	 x*=5;
	 x%=5;
	 
	 System.out.println(c);
}
}
