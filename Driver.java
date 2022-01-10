import java.util.ArrayList;

public class Driver{
	public static void main(String[] args){
		ArrayList<Comparable> test1 = new ArrayList<Comparable>();
		
		for(int i = 0; i < 10; i++){
			test1.add(i);
		}
		
		System.out.println("Testing bubbleSort:");
		System.out.println("Array before sorting: " );
		System.out.println(test1);
			
		Sorts.bubbleSortV(test1);
			
		System.out.println("Array after sorting: ");
		System.out.println(test1);
		
		
		for(int i = 0; i < 20; i++){
			System.out.println("Array before sorting: " );
			System.out.println(test1);
			
			Sorts.bubbleSortV(test1);
			
			System.out.println("Array after sorting: ");
			System.out.println(test1);
			
			Sorts.shuffle(test1);
			
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Testing selectionSort:");
		
		for(int i = 0; i < 20; i++){
			System.out.println("Array before sorting: " );
			System.out.println(test1);
			
			Sorts.selectionSortV(test1);
			
			System.out.println("Array after sorting: ");
			System.out.println(test1);
			
			Sorts.shuffle(test1);
			
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Testing insertionSort:");
		
		for(int i = 0; i < 20; i++){
			System.out.println("Array before sorting: " );
			System.out.println(test1);
			
			Sorts.insertionSortV(test1);
			
			System.out.println("Array after sorting: ");
			System.out.println(test1);
			
			Sorts.shuffle(test1);
			
		}
		
		
	}
}
