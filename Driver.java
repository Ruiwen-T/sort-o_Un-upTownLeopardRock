import java.util.ArrayList;

public class Driver{
	public static void main(String[] args){
		//testing bubbleSort
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Testing bubbleSort:");
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			ArrayList<Comparable> test1 = new ArrayList<Comparable>();
			
			for(int i = 0; i < 100; i++){
				test1.add(i);
			}
		
			//ordered from least to greatest
			System.out.println("Testing bubbleSort with " + test1.size() + " elements from least to greatest:");
			System.out.println("Array before sorting: " );
			System.out.println(test1);
				
			Sorts.bubbleSortV(test1);
				
			System.out.println("Array after sorting: ");
			System.out.println(test1);
			
			ArrayList<Comparable> test2 = new ArrayList<Comparable>();
			
			for(int i = 99; i > -1; i--){
				test2.add(i);
			}
			
			//ordered from greatest to least
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Testing bubbleSort with " + test2.size() + " elements from greatest to least:");
			System.out.println("Array before sorting: " );
			System.out.println(test2);
				
			Sorts.bubbleSortV(test2);
				
			System.out.println("Array after sorting: ");
			System.out.println(test2);

			//random order
			for(int i = 0; i < 100; i++){
				Sorts.shuffle(test1);
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Testing bubbleSort with " + test1.size() + " elements in random order:");
				System.out.println("Array before sorting: " );
				System.out.println(test1);
				
				Sorts.bubbleSortV(test1);
				
				System.out.println("Array after sorting: ");
				System.out.println(test1);
			} 
		
		//testing selectionSort
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Testing selectionSort:");
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			test1 = new ArrayList<Comparable>();
			
			for(int i = 0; i < 100; i++){
				test1.add(i);
			}
			
			System.out.println("Testing selectionSort with " + test1.size() + " elements from least to greatest:");
			System.out.println("Array before sorting: " );
			System.out.println(test1);
				
			Sorts.selectionSortV(test1);
				
			System.out.println("Array after sorting: ");
			System.out.println(test1);
			
			test2 = new ArrayList<Comparable>();
			
			for(int i = 99; i > -1; i--){
				test2.add(i);
			}
			
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Testing selectionSort with " + test2.size() + " elements from greatest to least:");
			System.out.println("Array before sorting: " );
			System.out.println(test2);
				
			Sorts.selectionSortV(test2);
				
			System.out.println("Array after sorting: ");
			System.out.println(test2);

			for(int i = 0; i < 100; i++){
				Sorts.shuffle(test1);
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Testing selectionSort with " + test1.size() + " elements in random order:");
				System.out.println("Array before sorting: " );
				System.out.println(test1);
				
				Sorts.selectionSortV(test1);
				
				System.out.println("Array after sorting: ");
				System.out.println(test1);
			} 
		
		//testing insertionSort
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Testing insertionSort:");
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			test1 = new ArrayList<Comparable>();
			
			for(int i = 0; i < 100; i++){
				test1.add(i);
			}
			
			//ordered from least to greatest
			System.out.println("Testing insertionSort with " + test1.size() + " elements from least to greatest:");
			System.out.println("Array before sorting: " );
			System.out.println(test1);
				
			Sorts.insertionSortV(test1);
				
			System.out.println("Array after sorting: ");
			System.out.println(test1);
			
			test2 = new ArrayList<Comparable>();
			
			for(int i = 99; i > -1; i--){
				test2.add(i);
			}
			
			//ordered from greatest to least
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Testing insertionSort with " + test2.size() + " elements from greatest to least:");
			System.out.println("Array before sorting: " );
			System.out.println(test2);
				
			Sorts.insertionSortV(test2);
				
			System.out.println("Array after sorting: ");
			System.out.println(test2);

			//random order
			for(int i = 0; i < 100; i++){
				Sorts.shuffle(test1);
				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Testing insertionSort with " + test1.size() + " elements in random order:");
				System.out.println("Array before sorting: " );
				System.out.println(test1);
				
				Sorts.insertionSortV(test1);
				
				System.out.println("Array after sorting: ");
				System.out.println(test1);
			} 
		
		
	}
}
