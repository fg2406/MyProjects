package arrays;

import java.util.Arrays;

public class C01 {

	public static void main(String[] args) {
	
		//bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6
		
		int []arr= {1,2,-3,4,-5,-6};
		
		for (int i : arr) {
			i*=-1;
			System.out.print(i+" ");
		}
		
		
		
		
		System.out.println(Arrays.toString(degistir(arr)));
		
		}
	         //method ile cozumu
			public static int[] degistir(int arr[]) {
				for (int i = 0; i < arr.length; i++) {
					arr[i]*=-1;
				
				
				}
				return arr;
				
			}
}
