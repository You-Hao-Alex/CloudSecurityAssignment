package lab6;

import java.util.Scanner;

public class Decrypt {
	String p, k;
	int a, b;
	char[] gg = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public void Decryption(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter your ciphertext: ");
		p = reader.nextLine();
		System.out.println("Please enter your keyword: ");
		k = reader.nextLine();
		a = p.length();
		b = k.length();
		int ans[] = new int[a];
		int keys[] = new int[b];
		for (int j=0; j<p.length();j++) {
			for (int i=0; i<26;i++) {
			if (p.charAt(j)==gg[i]) {
				ans[j]=i;
			}
				}
		}
		for (int j=0; j<k.length();j++) {
			for (int i=0; i<26;i++) {
			if (k.charAt(j)==gg[i]) {
				keys[j]=i;
			}
				}
		}
		for (int i=0;i<p.length();i++) {
			ans[i] = (ans[i] - keys[i%b]+26)%26;
		}
		for (int i=0;i<a;i++) {
			System.out.print(gg[ans[i]]);
		}
		}
		public static void main(String[] args) {
			Decrypt newGame = new Decrypt();
			newGame.Decryption();	
	}
}
