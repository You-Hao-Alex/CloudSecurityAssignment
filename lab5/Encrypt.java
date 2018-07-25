package lab5;

import java.util.Scanner;

public class Encrypt {
	int p1,p2;
	int k1,k2,k3,k4;
	
	public void Encryption(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter p1: ");
		p1 = reader.nextInt();
		System.out.println("Please enter p2: ");
		p2 = reader.nextInt();
		System.out.println("Please enter k1: ");
		k1 = reader.nextInt();
		System.out.println("Please enter k2: ");
		k2 = reader.nextInt();
		System.out.println("Please enter k3: ");
		k3 = reader.nextInt();
		System.out.println("Please enter k4: ");
		k4 = reader.nextInt();
		
		System.out.print((p1*k1+p2*k3)%26);
		System.out.print("  ");
		System.out.print((p1*k2+p2*k4)%26);
		}
	
		public static void main(String[] args) {
			Encrypt newGame = new Encrypt();
			newGame.Encryption();	
	}
}
