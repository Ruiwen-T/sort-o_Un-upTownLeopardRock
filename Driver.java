import java.util.ArrayList;

public class Driver{
	public static void main(String[] args){
		ArrayList<Comparable> test1 = Sorts.populate(50, 0, 50 );
		
		System.out.println("Testing bubbleSort:");
		
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
