package extraTopics.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BR {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		int n = Integer.parseInt(br.readLine());
		System.out.println(n);
	}

}
