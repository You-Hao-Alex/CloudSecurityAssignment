package lab3_decrypting;

import java.util.Scanner;

public class Decrypt {
	String a;
	int b;
	char[] gg = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public void Decryption(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the ciphertext (without space): ");
		a = reader.nextLine();
		System.out.println("Please enter a key: ");
		b = reader.nextInt();
		for (int j=0; j<a.length();j++) {
			for (int i=0; i<26;i++) {
			if (a.charAt(j)==gg[i]) {
				System.out.print(gg[(i-b+26)%26]);
			}
			}
		}
		}
	}