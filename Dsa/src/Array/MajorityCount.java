package Array;

public class MajorityCount {

	public static void main(String[] args) {
		 
		int arr[]= { 2,2,1,1,1,2,2};
		
		int majority = 0;
		
		for(int i : arr) {
			int count =0;
			for(int j : arr) {
				if(i==j) {
					count++;
				}
			}
			if(count>arr.length/2) {
				majority=i;
			}
		}
		
		System.out.println(majority);
		
		

	}

}
