package extraTopics.bigNumbers;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d1 = 34.44;
		double d2 = 34.24;
		System.out.println(d1);
		System.out.println(d1-d2);
		
		BigDecimal d3 = new BigDecimal(d1);
		System.out.println(d3);
		BigDecimal d4 = new BigDecimal("34.24");
		System.out.println(d3.subtract(d4));
		
		BigDecimal d5 = new BigDecimal(5.45);
		
		System.out.println(d5.toString());
		System.out.println(d3.toString());
		System.out.println(d3.setScale(1,RoundingMode.HALF_DOWN));
		
		BigDecimal d7 = new BigDecimal("33.00");
		BigDecimal d8 = new BigDecimal("33.0");
		
		System.out.println(d7.equals(d8));
		System.out.println(d7.compareTo(d8));
		
	}

}
