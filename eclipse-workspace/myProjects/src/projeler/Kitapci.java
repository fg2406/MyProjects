package projeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapci {

    static int count=1000;
	static List <String> kitapAdi=new ArrayList<>();
	static List <String> yazarAdi=new ArrayList<>();
	static List <Double> fiyati=new ArrayList<>();
	static List <Integer> kitapNo=new ArrayList<>();
	

	public static void main(String[] args) {
		
		
		/*  ====================PAZAR PROJEMIZ============================== 
		 * bir kitapci icin program yazalim 
		 * kitap no 1000'den baslayacak sirali no olsun
		 * program baslayinca menu isminde bir method calissin 
		 * 1-kitap ekle 
		 * 2-numara ile kitap goruntule 
		 * 3-bilgi ile kitap goruntule 
		 * 4-numara ile kitap sil 
		 * 5-tum kitaplar listele 
		 * 6-cikis
		 ************************************
		 * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
		   yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer olmali yani bir list'te tutmamiz gerek 
		   2-kitap numarasi 1000'den baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
		    count=1000; 
		   menu isminde bir method olusturmaliyim,
		   3-kitap ekle diye bir method olusturmliyim,bu method farkli bir classda
		   4-kullanicidn kitap adi yazar adi ve fiyat bilgileri istenmeli
		 */
		
		
		System.out.println(        "        ********************SANAL KİTABEVİNE HOŞGELDİNİZ********************       "   );
		
		System.out.println("                 **********İŞLEMLERİNİZ ARTIK ÇOK KOLAY!************             ");
		
		System.out.println("    //// MENÜ ////                         ");
		
		
		menu();
		

	}

	@SuppressWarnings("resource")
	private static void menu() {
		
		Scanner scan=new Scanner(System.in);
		int secim=0;
		
		System.out.println("\nLütfen yapmak istediginiz işlemi seçiniz. Ardından enter tuşuna basınız.\n");
			
		System.out.println( "1-)KİTAP EKLE\n2-)NUMARA İLE KİTAP GÖRÜNTÜLE\n3-)KİTAP BİLGİSİ İLE KİTAP GÖRÜNTÜLE\n4-)NUMARA İLE KİTAP SİL\n5-)TÜM KİTAPLARI LİSTELE\n6-)ÇIKIŞ");
		   
		secim=scan.nextInt();
		
		switch (secim) {
		case 1: 
			System.out.println("\nKitap Ekleme Sekmesine Hoşgeldiniz.Lütfen Yönergeleri izleyiniz.");
			kitapekle();
		
			break;

		case 2:
			
			numarakitapgörüntüle();
			
			break;	
			
		case 3:
			
			bilgikitapgörüntüle();
			
			break;
			
		case 4:
			
			kitapsil();
			
			break;
		
		case 5:
			
			kitaplarilistele();
			
			break;
		
		case 6:
			System.out.println("\n\t\t\t********************ÇIKIŞ İŞLEMİNİZ BAŞARI İLE GERÇEKLEŞTİRİLMİŞTİR. TEŞEKKÜR EDER, İYİ GÜNLER DİLERİZ********************");
			
			break;
			
		default:
			
			do {
				System.out.println("YANLIŞ BİR GİRİŞ YAPTINIZ.LÜTFEN TEKRAR DENEYİNİZ.\n1-)KİTAP EKLE\n2-)NUMARA İLE KİTAP GÖRÜNTÜLE\n3-)KİTAP BİLGİSİ İLE KİTAP GÖRÜNTÜLE\n4-)NUMARA İLE KİTAP SİL\n5-)TÜM KİTAPLARI LİSTELE\n6-)ÇIKIŞ");
			    secim=scan.nextInt();
			} while (secim<1 || secim>6);
			
		}
		
	
	}

	private static void kitapekle() {
		

		
		int karar=0;
		String kitap="";
		String yazar="";
	    double ücret=0;
		int toplamEklenen=0;
	    
		
		do {
		  
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Lütfen eklemek istediginiz kitabın adını giriniz : ");
			kitap=scan.nextLine().toUpperCase();
			
			System.out.println("Lütfen kitabın yazarını giriniz : ");
			yazar=scan.nextLine().toUpperCase();
			
			System.out.println("Lütfen kitabın fiyatını giriniz : ");
			ücret=scan.nextDouble();
			
			
			kitapAdi.add(kitap);
			yazarAdi.add(yazar);
			fiyati.add(ücret);
		    kitapNo.add(count);
			
		    System.out.println("\nEklenen Kitap Bilgileri : "+"\n\nKitap No:"+kitapNo.get(toplamEklenen)  +"    "+"\nKitap Adı:"+kitap+"    "+"\nKitap Yazarı:"+yazar+"    "+"\nKitap Ücret:"+ücret+"$\n");
		    
		    count++;
			
			System.out.println("\nKitap eklemeye devam etmek için 1\nİşlemi sonlandırıp menüye dönmek için 2'yi tuşlayınız.\n");
			karar=scan.nextInt();
		
			toplamEklenen++;
			
			
		} while (karar==1);
		
		
		
		
		  System.out.println("Kitap ekleme işlemi başarı ile gerçekleştirildi.Teşekkürler.\n");	
		
		  menu();

	}	

	@SuppressWarnings("resource")
	private static void kitaplarilistele() {
		
		System.out.println("**********KİTAP LİSTESİ**************\n");
		Scanner scan=new Scanner(System.in);
	
		if (kitapNo.size()>0) {
			
			System.out.println(" KİTAP NO        KİTAP ADI        KİTABIN YAZARI        KİTABIN FİYATI " );
			for (int i = 0; i < kitapNo.size(); i++) {
				
				//System.out.println(" KİTAP NO        KİTAP ADI        KİTABIN YAZARI        KİTABIN FİYATI " );
				System.out.println(kitapNo.get(i) + "        "  +  kitapAdi.get(i) + "        " + yazarAdi.get(i) + "         " + fiyati.get(i) );
				
			}
				
			System.out.println("\nMenüye dönmek için 1\nÇıkış yapmak için 2 tuşlayın.");
			int karar=scan.nextInt();
			
			switch (karar) {
			case 1:
				menu();
				break;
			case 2:
				System.out.println("\n********************ÇIKIŞ İŞLEMİNİZ BAŞARI İLE GERÇEKLEŞTİRİLMİŞTİR. TEŞEKKÜR EDER, İYİ GÜNLER DİLERİZ********************");
				break;
			default:
				
				do {
					System.out.println("\nYANLIŞ BİR GİRİŞ YAPTINIZ.LÜTFEN TEKRAR DENEYİNİZ.\nMenüye dönmek için 1\\nÇıkış yapmak için 2 tuşlayın.\n");
				    karar=scan.nextInt();
				} while (karar<1 || karar>2);
				
				break;
			}
			
		} 
		
		
		if (kitapNo.size()<=0) {
			System.out.println("\nHenüz eklenmiş bir kitap bulunmamaktadır. \n\n\n");
			
			System.out.println("\nMenüye dönmek için 1\nÇıkış yapmak için 2 tuşlayın.\n");
			int karar2=scan.nextInt();
			
			switch (karar2) {
			case 1:
				menu();
				break;
			case 2:
				System.out.println("\n********************ÇIKIŞ İŞLEMİNİZ BAŞARI İLE GERÇEKLEŞTİRİLMİŞTİR. TEŞEKKÜR EDER, İYİ GÜNLER DİLERİZ********************");
				break;
			default:
				
				do {
					System.out.println("\nYANLIŞ BİR GİRİŞ YAPTINIZ.LÜTFEN TEKRAR DENEYİNİZ.\nMenüye dönmek için 1\\nÇıkış yapmak için 2 tuşlayın.\n");
				    karar2=scan.nextInt();
				} while (karar2<1 || karar2>2);
				
				break;
			}
			
		}
		
		
	
		
	}

	private static void kitapsil() {
		
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);

		int no=0;
	    int karar=0;
		@SuppressWarnings("unused")
		int toplamSilinen=0;
	    int index=0;
		
	    if (kitapNo.size()<=0) {
			System.out.println("\nHenüz eklenmiş bir kitap bulunmamaktadır. \n\n\n");
			
			System.out.println("\nMenüye dönmek için 1\nÇıkış yapmak için 2 tuşlayın.\n");
			int karar3=scan.nextInt();
			
			switch (karar3) {
			case 1:
				menu();
				break;
			case 2:
				System.out.println("\n********************ÇIKIŞ İŞLEMİNİZ BAŞARI İLE GERÇEKLEŞTİRİLMİŞTİR. TEŞEKKÜR EDER, İYİ GÜNLER DİLERİZ********************");
				break;
			default:
				
				do {
					System.out.println("\nYANLIŞ BİR GİRİŞ YAPTINIZ.LÜTFEN TEKRAR DENEYİNİZ.\nMenüye dönmek için 1\\nÇıkış yapmak için 2 tuşlayın.\n");
				    karar3=scan.nextInt();
				} while (karar3<1 || karar3>2);
				
				break;
			}
			
		}
		
	    
	    if (kitapNo.size()>0) {
	    
		do {
		  
		
			
			System.out.println("Lütfen silmek istediginiz kitabın nosunu giriniz : ");
			no=scan.nextInt();
			
			index=kitapNo.indexOf(no);
			
			// System.out.println(index);
			
			 System.out.println("\nSilinen Kitap Bilgileri : "+"\n\nKitap No:"+kitapNo.get(index)  +"    "+"\nKitap Adı:"+kitapAdi.get(kitapNo.get(index))
			  +"    "+"\nKitap Yazarı:"+yazarAdi.get(kitapNo.get(index))+"    "+"\nKitap Ücret:"+fiyati.get(kitapNo.get(index))+"\n");
		
		
			kitapNo.remove(index);
			yazarAdi.remove(index);
			kitapAdi.remove(index);
			fiyati.remove(index);

			System.out.println("\nKitap silmeye devam etmek için 1\nİşlemi sonlandırmak için 2'yi tuşlayınız.\n");
			karar=scan.nextInt();
		
			toplamSilinen++;
			
			
		} while (karar==1);
		
		
		
		
		  System.out.println("\nKitap silme işlemi başarı ile gerçekleştirildi. Teşekkürler. ");	
		
		  menu();
	    }
	
		
	}

	private static void bilgikitapgörüntüle() {
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		 
		 String kitapismi="";
         @SuppressWarnings("unused")
		String yazarismi="";
         
         int karar5=0;
         @SuppressWarnings("unused")
		int toplamGörüntülenen=0;
		 int index5=0;
		
		
		if (kitapNo.size()<=0) {
			System.out.println("\nHenüz eklenmiş bir kitap bulunmamaktadır. \n\n\n");
			
			System.out.println("\nMenüye dönmek için 1\nÇıkış yapmak için 2 tuşlayın.");
			int karar4=scan.nextInt();
			
			switch (karar4) {
			case 1:
				menu();
				break;
			case 2:
				System.out.println("\n********************ÇIKIŞ İŞLEMİNİZ BAŞARI İLE GERÇEKLEŞTİRİLMİŞTİR. TEŞEKKÜR EDER, İYİ GÜNLER DİLERİZ********************");
				break;
			default:
				
				do {
					System.out.println("\nYANLIŞ BİR GİRİŞ YAPTINIZ.LÜTFEN TEKRAR DENEYİNİZ.\nMenüye dönmek için 1\\nÇıkış yapmak için 2 tuşlayın.\n");
				    karar4=scan.nextInt();
				} while (karar4<1 || karar4>2);
				
				break;
			}
			
		}
		
		
		 if (kitapNo.size()>0) {
		
		
		

				do {
					  
					
					System.out.println("Lütfen görüntülemek istediginiz kitabın adını giriniz : ");
					
					kitapismi=scan.nextLine().toUpperCase();
					
					index5=kitapAdi.indexOf(kitapismi);
					
					
					System.out.println(index5);
					
				System.out.println("\nGörüntülenen Kitap Bilgileri: "+"\n\nKitap No: "+kitapNo.get(index5)  +"    "+"\nKitap Adı: "+kitapAdi.get(index5)
				  +"    "+"\nKitap Yazarı: "+yazarAdi.get(index5)+"    "+"\nKitap Ücret: "+fiyati.get(index5)+"\n");
				
		

					System.out.println("\nBaşka kitap görüntülemek için 1\nİşlemi sonlandırıp menüye dönmek için 2'yi tuşlayınız. ");
					karar5=scan.nextInt();
				
					toplamGörüntülenen++;
					
					
				} while (karar5==1);
				
				
				
				
				  System.out.println("\nKitap görüntüleme işlemi başarı ile gerçekleştirildi. Menüye yönlendiriliyorsunuz.\n ");	
				
				  menu();
		
		
		
		
		 }
	}

	private static void numarakitapgörüntüle() {
		
          @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
          int index2=0;
          int no2=0;
          int karar7=0;
          @SuppressWarnings("unused")
		int toplamGörüntülenen=0;
		
		
		if (kitapNo.size()<=0) {
			System.out.println("Henüz eklenmiş bir kitap bulunmamaktadır. \n\n\n");
			
			System.out.println("\nMenüye dönmek için 1\nÇıkış yapmak için 2 tuşlayın.");
			int karar6=scan.nextInt();
			
			switch (karar6) {
			case 1:
				menu();
				break;
			case 2:
				System.out.println("\n********************ÇIKIŞ İŞLEMİNİZ BAŞARI İLE GERÇEKLEŞTİRİLMİŞTİR. TEŞEKKÜR EDER, İYİ GÜNLER DİLERİZ********************");
				break;
			default:
				
				do {
					System.out.println("\nYANLIŞ BİR GİRİŞ YAPTINIZ.LÜTFEN TEKRAR DENEYİNİZ.\nMenüye dönmek için 1\\nÇıkış yapmak için 2 tuşlayın.\n");
				    karar6=scan.nextInt();
				} while (karar6<1 || karar6>2);
				
				break;
			}
			
		}
		
		
		
		 if (kitapNo.size()>0) {
		
		
		
				do {
					  
					
					
					System.out.println("Lütfen görüntülemek istediginiz kitabın nosunu giriniz : ");
					no2=scan.nextInt();
					
					index2=kitapNo.indexOf(no2);
					
					// System.out.println(index2);
					
					 System.out.println("\nGörüntülenen Kitap Bilgileri: "+"\n\nKitap No: "+kitapNo.get(index2)  +"    "+"\nKitap Adı: "+kitapAdi.get(index2)
					  +"    "+"\nKitap Yazarı: "+yazarAdi.get(index2)+"    "+"\nKitap Ücret: "+fiyati.get(index2)+"\n");
				
		

					System.out.println("\nBaşka kitap görüntülemek için 1\nİşlemi sonlandırıp menüye dönmek için 2'yi tuşlayınız. ");
					karar7=scan.nextInt();
				
					toplamGörüntülenen++;
					
					
				} while (karar7==1);
				
				
				
				
				  System.out.println("\nKitap görüntüleme işlemi başarı ile gerçekleştirildi. Teşekkürler.\n ");	
				
				  menu();
		
	
		
		 }
		
	}


		
		
		
	}
