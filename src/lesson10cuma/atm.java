package lesson10cuma;
//atm gibiçalışan bir program.

//Kullanıcı adı: "user"
//Kullanıcı şifresi: "123"
//Kullanıcı 3 kere yanlış giriş yaparsa karta bloke koy.
//Her yanlış girişte kalan hakkını göster.
// Doğru girişte menüye gelsin.
//1-para yatırma
//2-para çekme
//3-Bakiye sorgulama 
//4-çıkış yapma

//ilk bakiye 1500 tl olsun. Bakiyeden fazla tutarda para çekme talebi olursa, 
//Yetersiz Bakiyr uyarısı.Her işlemden sonra ne yapıldığınıda gösteren bir 
//bilgilendirme yazısı
import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		String kullaniciAdi = "berna" ;
		String sifre = "1234" ;
        String kullaniciAdiGirilen;
        String sifreGirilen;
        String menu;

		double bakiye = 1500;
		double paraCekme; 
	
		for( int i = 2; i>=0 ; i-- ) { // 3 kere hatalı girince bloke olması için
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Kullanıcı adınızı griniz:");
			kullaniciAdiGirilen = scanner.nextLine();
		    System.out.println("Şifrenizi giriniz:");
			sifreGirilen = scanner.nextLine();
			
			if (!(kullaniciAdi.equals(kullaniciAdiGirilen)) && !(sifre.equals(sifreGirilen))) {
				System.out.println("!!Hatalı Giriş!!");
				System.out.println("Kalan hakkınız:" + i );
				if(i == 0) {
					System.out.println("KART BLOKE");
					break;
				}
			}else{
				do {
					System.out.println("---MENÜ---");
					System.out.println("1-PARA YATIRMA");
					System.out.println("2-PARA ÇEKME");
					System.out.println("3-BAKİYE SORGULAMA");
					System.out.println("4-ÇIKIŞ");
	
					menu = scanner.nextLine();
					
					switch (menu) {
					case "1":
						
						Scanner scan1 = new Scanner(System.in);
						System.out.println("Lütfen Yatırmak istediğiniz para tutarını giriniz:");
						Double paraYatirma = scan1.nextDouble();
						bakiye = bakiye + paraYatirma ;
						System.out.println("Yeni Bakiyeniz = " + bakiye);
						break;
					case "2":
						
						Scanner input = new Scanner(System.in);
						System.out.println("Lütfen Çekmek istediğiniz para tutarını giriniz:");
						paraCekme = input.nextDouble();

						if ( paraCekme > bakiye ) {
							System.out.println("!!Yetersiz Bakiye!!");
						}else {
							bakiye = bakiye - paraCekme ;
							System.out.println("Yeni Bakiyeniz = " + bakiye);
						}
						break;
					case "3":
						System.out.println("Güncel Bakiye" + bakiye);
						break;
					case "4":
						System.out.println("Başarıyla Çıkış yapıldı.");
						return;
					default:
						System.out.println("HATALI TUŞLAMA");
						break;
					}
		        }while(true);
			}
	
		}
	}
}
