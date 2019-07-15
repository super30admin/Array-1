public class ArrayProduct {
	
	public static int[] findProduct(int[] arr) {
		int n = arr.length;
		int[] answer = new int[n];
		int temp=1;
		
		//Product of left side
		for(int i=0;i<n;i++) {
			answer[i]=temp;
			temp*=arr[i];
		}
		temp=1;
		//Product of right side
		for(int i= n-1;i>=0;i--) {
			answer[i]*=temp;
			temp*=arr[i];
			
		};
		
		return answer;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4};
		int[] product = findProduct(arr);
		for(int x : product) {
			System.out.println(x);
		}
	}

}