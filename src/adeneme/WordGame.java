package adeneme;

import java.util.Scanner;
/*
 * nahtar kelime "kalemtraş" (kullanıcıya gösterilmeyecek)
tahmin kelimesi "masraf" 
doğru tahmin edilen harfler = 1 
doğru yerdeki harf = 1 / a /
doğru tahmin edilip yanlış yerde olan harfler = 3 / mar /
anahtar kelime "kalemtraş" (kullanıcıya gösterilmeyecek)
tahmin kelimesi "salon" 
doğru tahmin edilen harfler = 2
doğru yerdeki harf = 2 / al /
doğru tahmin edilip yanlış yerde olan harfler = 0
anahtar kelime "kalemtraş" (kullanıcıya gösterilmeyecek)
tahmin kelimesi "elmastraş" 
doğru tahmin edilen harfler = 5
doğru yerdeki harf = 5 / traş /
doğru tahmin edilip yanlış yerde olan harfler = 4 / elma /
 */
public class WordGame {

	public static void main(String[] args) {
		
		String s = "kalemtraş";
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a name...");
		String s1 = scan.next();
		String contains ="";
		String exact="";
		
		
		for (int i=0; i<s.length(); i++) {
			for (int j=0; j<s1.length(); j++) {
				
				if (s.contains(s1.charAt(j)+"")) {
					if ( s.charAt(i)==s1.charAt(j) && i==j) {
						exact = exact + s1.charAt(j);
					} 
					
					if (!contains.contains(s1.charAt(j)+""))
							contains = contains + s1.charAt(j);
					
				}
			}
		}
		
		if (s.equals(exact)) {
			System.out.println("You win the word is..." + exact);
		} else {
		System.out.println("contains....." + contains.length() + " letter and they are..." + contains );
		System.out.println("exact......" + exact.length()+ " letter and they are..." + exact);
		
		for (int i=0; i<contains.length(); i++) {
			s1 = s1.replace(contains.charAt(i)+"", "");
		}
		
		if (s1.length()==0) {
			System.out.println("wrong......=" + s1.length());	
		}else {
		System.out.println("wrong......=" + s1.length()+ " letter and they are...=" + s1);
		
		}
	}

	}
	}
