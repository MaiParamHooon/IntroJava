package interviewQuestions;

public class KadensAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {-1,4,-2,-4,-1,3,5,-6};
		int n = a.length;
		
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;
		
		for(int i=0; i<n; i++) {
			curSum +=a[i];
			
			if(curSum>maxSum) {
				maxSum = curSum;
			}
			
			if(curSum<0) {
				curSum = 0;
			}
		}
		System.out.println(maxSum);
	}
	
}
