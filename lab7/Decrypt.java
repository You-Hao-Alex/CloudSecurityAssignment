package lab7;

import java.util.Scanner;

public class Decrypt {
	String key, P;
	int k,p;
	char[] gg = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public void Decryption(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter your key: ");
		key = reader.nextLine();
		System.out.println("Please enter your ciphertext: ");
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
		int a = p/k;
		int b = p%k;
		int tem[] = new int[b];
		
		char cipher[] = new char[p];
		for(int l=0;l<a;l++) {
		for(int i=0;i<k;i++) {
			for (int j=0;j<k;j++) {
			if(keys[j]==i+1) {
				cipher[l*k+i] = P.charAt(l*k+j);
			}
			}
			}
		}
		if (b>0) {
			int j = 0;
			for (int i = 0;i<k;i++) {
				if (keys[i]<=b) {
					tem[j] = keys[i];
					j=j+1;
				}
			}
			for(int i=0;i<b;i++) {
				for (int m=0;m<b;m++) {
				if(tem[m]==i+1) {
					cipher[a*k+i] = P.charAt(a*k+m);
				}
				}
				}
		}
		for (int i = 0;i<(p/2);i++) {
			System.out.print(tran(cipher[2*i],cipher[2*i+1]));			
		}
		}
		
		private char tran(char c, char d) {
		if (c=='a') {
			if(d=='a') {
				return 'k';
			}
			else if(d=='d') {
				return 'z';
			}
			else if(d=='f') {
				return 'w';
			}
			else if(d=='g') {
				return 'r';
			}
			else if(d=='v') {
				return 'i';
			}
			else {
				return 'f';
			}
		}
		else if (c=='d') {
			if(d=='a') {
				return '9';
			}
			else if(d=='d') {
				return 'b';
			}
			else if(d=='f') {
				return '6';
			}
			else if(d=='g') {
				return 'c';
			}
			else if(d=='v') {
				return 'l';
			}
			else {
				return '5';
			}
		}
		else if (c=='f') {
			if(d=='a') {
				return 'q';
			}
			else if(d=='d') {
				return '7';
			}
			else if(d=='f') {
				return 'j';
			}
			else if(d=='g') {
				return 'p';
			}
			else if(d=='v') {
				return 'g';
			}
			else {
				return 'x';
			}
		}
		else if (c=='g') {
			if(d=='a') {
				return 'e';
			}
			else if(d=='d') {
				return 'v';
			}
			else if(d=='f') {
				return 'y';
			}
			else if(d=='g') {
				return '3';
			}
			else if(d=='v') {
				return 'a';
			}
			else {
				return 'n';
			}
		}
		else if (c=='v') {
			if(d=='a') {
				return '8';
			}
			else if(d=='d') {
				return 'o';
			}
			else if(d=='f') {
				return 'd';
			}
			else if(d=='g') {
				return 'h';
			}
			else if(d=='v') {
				return '0';
			}
			else {
				return '2';
			}
		}
		else {
			if(d=='a') {
				return 'u';
			}
			else if(d=='d') {
				return '4';
			}
			else if(d=='f') {
				return '1';
			}
			else if(d=='g') {
				return 's';
			}
			else if(d=='v') {
				return 't';
			}
			else {
				return 'm';
			}
		}
	}

		public static void main(String[] args) {
			Decrypt newGame = new Decrypt();
			newGame.Decryption();	
	}
}
