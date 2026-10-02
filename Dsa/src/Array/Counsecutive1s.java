package Array;

public class Counsecutive1s {

	public static void main(String[] args) {
		
		int arr[] = {1,1,0,1,1,1 };
		
		int max=0;
		int current =0;
		
		for(int i : arr) {
			if(i==1) {
				current++;
			}else {
				if(current>max) {
					max=current;
				}
				current=0;
			}
		}
		
		if(current > max) {
		    max = current;
	}
		System.out.println(max);
 
}
}
