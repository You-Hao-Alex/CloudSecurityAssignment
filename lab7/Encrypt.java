package lab7;

import java.util.Scanner;

public class Encrypt {
	String key, P;
	int k,p;
	char[] gg = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public void Encryption(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter your key: ");
		key = reader.nextLine();
		System.out.println("Please enter your plaintext: ");
		P = reader.nextLine();
		k = key.length();
		p = P.length();
		int ans[] = new int[k];
		int keys[] = new int[k];
		for (int j=0; j<k;j++) {
			for (int i=0; i<26;i++) {
			if (key.charAt(j)==gg[i]) {
				ans[j]=i;
			}
				}
		}
		for (int i = 0; i<k;i++) {
			int Rank = 1;
			for (int j=0; j<k; j++) {
				if (ans[i] > ans[j]) {
					Rank = Rank+1;
				}
				keys[i] = Rank;
			}
		}
		
		char plain[] = new char[2*p];
		for (int i = 0; i<p;i++) {
			plain[2*i]=tran1(P.charAt(i));
			plain[2*i+1]=tran2(P.charAt(i));
		}
		
		int a = (2*p)/k;
		int b = (2*p)%k;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(plain[i*k+(keys[j])-1]);
			}
		}
		
		int tem[] = new int[b];
		if (b>0) {
			int j = 0;
			for (int i = 0;i<k;i++) {
				if (keys[i]<=b) {
					tem[j] = keys[i];
					j=j+1;
				}
			}
		}
		
		
		for (int j = 0; j < b; j++) {
			System.out.print(plain[a*k+(tem[j])-1]);
		}
		
		
	
		}
		
		private char tran1(char a) {
		if (a =='k' || a =='z' || a =='w' || a =='r' || a =='i' || a =='f') {
		return 'a';
		}
		else if (a =='9' || a =='b' || a =='6' || a =='c' || a =='l' || a =='5') {
			return 'd';
		}
		else if (a =='q' || a =='7' || a =='j' || a =='p' || a =='g' || a =='x') {
			return 'f';
		}
		else if (a =='e' || a =='v' || a =='y' || a =='3' || a =='a' || a =='n') {
			return 'g';
		}
		else if (a =='8' || a =='o' || a =='d' || a =='h' || a =='0' || a =='2') {
			return 'v';
		}
		else {
			return 'x';
		}
	}
		private char tran2(char b) {
				if (b =='k' || b =='9' || b =='q' || b =='e' || b =='8' || b =='u') {
				return 'a';
				}
				else if (b =='z' || b =='b' || b =='7' || b =='v' || b =='o' || b =='4') {
					return 'd';
				}
				else if (b =='w' || b =='6' || b =='j' || b =='y' || b =='d' || b =='1') {
					return 'f';
				}
				else if (b =='r' || b =='c' || b =='p' || b =='3' || b =='h' || b =='s') {
					return 'g';
				}
				else if (b =='i' || b =='l' || b =='g' || b =='a' || b =='0' || b =='t') {
					return 'v';
				}
				else {
					return 'x';
				}
	}
		public static void main(String[] args) {
			Encrypt newGame = new Encrypt();
			newGame.Encryption();	
	}
}
