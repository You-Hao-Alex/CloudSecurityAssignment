package lab4_decrypting;

import java.util.Scanner;

public class Decrypt {
	String a;
	int k1, k2, b, c=0;
	char[] gg = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public void Decryption(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the the ciphertext (without space): ");
		a = reader.nextLine();
		System.out.println("Please enter k1: ");
		k1 = reader.nextInt();
		System.out.println("Please enter k2: ");
		k2 = reader.nextInt();
		do {
			c=c+1;
		}
		while (((k1*c)%26)!=1);

		for (int j=0; j<a.length();j++) {
			for (int i=0; i<26;i++) {
			if (a.charAt(j)==gg[i]) {
				b=(c*(i-k2+26))%26;
				System.out.print(gg[b]);
			}
			}
		}
		}
	}