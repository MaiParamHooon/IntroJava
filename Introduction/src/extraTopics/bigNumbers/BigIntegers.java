package extraTopics.bigNumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
//		BigInteger bigInteger = new BigInteger("1234343434434345803500000");
		BigInteger bigInteger = new  BigInteger("2");
		BigInteger bigInteger1 = BigInteger .valueOf(43532235325L);
		BigInteger bigInteger2 = BigInteger.TEN;
//		System.out.println(bigInteger2);
		bigInteger.add(new BigInteger("55"));
//		System.out.println(bigInteger);
		BigInteger result = bigInteger.multiply(new BigInteger("2"));
		System.out.println(result);
		
		BigInteger x = bigInteger.mod(new BigInteger("2"));
		System.out.println(x);
		
		BigInteger y = bigInteger.modInverse(new BigInteger("1"));
		System.out.println(y);
		
		BigInteger z = bigInteger.add(bigInteger2);
		System.out.println(z);
		
		int i=2;
		String j = Integer.toString(i);
		BigInteger m = new BigInteger(j);
		System.out.println(m);
	}

}
