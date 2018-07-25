package Assignment_SDES;


import java.util.*;

public class SDES_decrypt {
  public static void main(String[] args)
  {
    
    KeyGeneration KG = new KeyGeneration();
    Encryption enc  = new Encryption();
    Scanner sc = new Scanner(System.in);
    
	String pt ;
	String key;
	int[] ct = new int[8];
    
    try
    {
	System.out.print("Enter 8-bit Ciphertext : ");
	pt = sc.next();
	
	
	System.out.println(" \n ");
	
		
    System.out.print("Enter 10-bit Key : ");
    key = sc.next();
    
	
	System.out.println(" \n ");
	
	
	KG.GenerateKeys(key);

	
	ct = enc.encrypt( pt ,KG.getK2(),KG.getK1());
	
    }
    catch(InputMismatchException e)
    {
      System.out.println("-- Error Occured : Invalid Input ");
    }
    catch(Exception e)
    {
      System.out.println("-- Error Occured : "+e);
    }
    
  }
  
}