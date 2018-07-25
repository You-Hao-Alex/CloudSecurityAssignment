package lab5;

import java.util.Scanner;

public class Decrypt {
	int c1,c2;
	int k1,k2,k3,k4,k;
	
	public void Decryption(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter c1: ");
		c1 = reader.nextInt();
		System.out.println("Please enter c2: ");
		c2 = reader.nextInt();
		System.out.println("Please enter k1: ");
		k1 = reader.nextInt();
		System.out.println("Please enter k2: ");
		k2 = reader.nextInt();
		System.out.println("Please enter k3: ");
		k3 = reader.nextInt();
		System.out.println("Please enter k4: ");
		k4 = reader.nextInt();
		
		
		k = k1;
		k1 = k4;
		k4 = k;
		do {
			k2 = k2 - 26;
		}
		while(k2>26);
		do {
			k3 = k3 - 26;
		}
		while(k3>26);
		
		k2 = 26 - k2;
		k3 = 26 - k3;
			
		
		System.out.print((c1*k1+c2*k3)%26);
		System.out.print("  ");
		System.out.print((c1*k2+c2*k4)%26);
		}
	
		public static void main(String[] args) {
			Decrypt newGame = new Decrypt();
			newGame.Decryption();	
	}
}