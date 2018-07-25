package lab4_encrypting;

import java.util.Scanner;

public class Encrypt {
	String a;
	int k1, k2, b;
	char[] gg = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public void Encryption(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the sentence (without space): ");
		a = reader.nextLine();
		System.out.println("Please enter k1: ");
		k1 = reader.nextInt();
		System.out.println("Please enter k2: ");
		k2 = reader.nextInt();
		
		for (int j=0; j<a.length();j++) {
			for (int i=0; i<26;i++) {
			if (a.charAt(j)==gg[i]) {
				b = (k1*i+k2)%26;
				System.out.print(gg[b]);
			}
			}
		}
		}
	}