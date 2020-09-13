package interviewQuestions;

import java.util.*;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		int a[] = {2,3,1,5,7,1,2,5,4,3};
		int ans[]=solution.maxSlidingWindow(a, 3);
		for(int x: ans) {
			System.out.println(x + " ");
		}
	}
	
	static class Solution{
		public int[] maxSlidingWindow(int [] a, int k) {
			
			int n = a.length;
			
			Deque<Integer> dq = new LinkedList<>();
			int ans[] = new int[n-k+1];
			
			
			int i = 0;
			
			for(; i<k; i++) {
				while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
			}
		
				for(; i<n; i++) {
				ans[i-k] = a[dq.peekFirst()];
		
					while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
							dq.removeFirst();
						}
					while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
							dq.removeLast();
						}
					dq.addLast(i);
				}
				ans[i-k] = a[dq.peekFirst()];
				return ans;
			}
	}

}
