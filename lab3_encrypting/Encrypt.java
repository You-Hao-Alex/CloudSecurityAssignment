package lab3_encrypting;

import java.util.Scanner;

public class Encrypt {
	String a;
	int b;
	char[] gg = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public void Encryption(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a sentence (without space): ");
		a = reader.nextLine();
		System.out.println("Please enter a key: ");
		b = reader.nextInt();
		for (int j=0; j<a.length();j++) {
			for (int i=0; i<26;i++) {
			if (a.charAt(j)==gg[i]) {
				System.out.print(gg[(i+b)%26]);
			}
			}
		}
		}
	}