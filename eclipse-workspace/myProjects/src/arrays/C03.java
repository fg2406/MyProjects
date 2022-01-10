package arrays;

public class C03 {

	public static void main(String[] args) {
		

		/*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */
	
		int arr[]= {1,2,3,4,5,6,7};
		int top=0;
	   
	    
	    for (int i = 0; i < arr.length; i++) {
			top+=arr[i];
		    
	   }
	
	    double ort=top/arr.length; 
	    
	 for (int i = 0; i < arr.length; i++) {
		    if (arr[i]>ort) {
		    	System.out.println("ort buyuk sayilari :"+arr[i]);		
		}
	
	    
	 
	 
	 }
	
	}

}
