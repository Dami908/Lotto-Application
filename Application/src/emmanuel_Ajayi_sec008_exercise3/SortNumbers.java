package emmanuel_Ajayi_sec008_exercise3;
public class SortNumbers {
          public static void SortNumbers1(int...numbers) {
		  //Sorts the number using bubble sort
        	  for(int i=0;i<numbers.length;i++){
        	        for(int j=i+1;j<numbers.length;j++){
        	            if(numbers[i]<numbers[j]){
        	            int temp=numbers[i];
        	                numbers[i]=numbers[j];
        	                numbers[j]=temp;
        	            }
        	        }
        	        }
        	  //print out the sorted array
        	  System.out.print("Result of a Descending Array");
        	  for(int i=0;i<numbers.length;i++){
                  System.out.println(numbers[i]);
          }
	}
}
