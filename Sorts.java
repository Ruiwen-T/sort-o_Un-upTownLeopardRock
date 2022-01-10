import java.util.ArrayList;

public class Sorts{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal from right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    int totPass = 0;
    int totComp = 0;
    int totSwap = 0;

    /* YOUR IMPLEMENTATION HERE */
    for(int i = 0; i < data.size() - 1; i++){
        int swaps = 0;
        for( int j = data.size()-1; j > i; j-- ) { 
            totComp += 1;
            if ( data.get(j).compareTo(data.get(j-1)) < 0 ){
                // swap the positions
                totSwap += 1;
                data.set( j, data.set( j-1, data.get(j) ) );
                swaps += 1;
            }
        }
        // System.out.println("Number of swaps in this pass: " + swaps);
        // if (swaps == 0){
            // return;
        // }
        totPass += 1;
    }
    System.out.println("The total amount of passes is " + totPass);
    System.out.println("The total amount of comparisons is " + totComp);
    System.out.println("The total amount of swaps is " + totSwap);


  }

    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
    {
        /* YOUR IMPLEMENTATION HERE */
        ArrayList inputCopy = new ArrayList<Comparable>();
        for( Comparable c : input){
            inputCopy.add(c);
        }

        bubbleSortV(inputCopy);

        return inputCopy;
    }
    
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
    // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    int totPass = 0;
    int totComp = 0;
    int totSwap = 0;

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    for( int pass = data.size()-1; pass > -1; pass--   ) {
      //System.out.println( "\nbegin pass " + (data.size()-pass) );//diag

        maxPos = pass;
      
      for( int j = pass; j > -1; j--  ) {
        totComp += 1;
        if(data.get(j).compareTo(data.get(maxPos)) > 0){
      		maxPos = j;
      	}
        
        //System.out.println( "maxPos: " + maxPos );//diag
        //System.out.println( data );//diag

      }
      totSwap += 1;
      data.set(pass, data.set( maxPos, data.get(pass) ) );
      //System.out.println( "after swap: " +  data );//diag
      totPass += 1;
    }

    System.out.println("The total amount of passes is " + totPass);
    System.out.println("The total amount of comparisons is " + totComp);
    System.out.println("The total amount of swaps is " + totSwap);

  }//end selectionSort

  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort
  
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void insertionSortV( ArrayList<Comparable> data )
  {

    int totPass = 0;
    int totComp = 0;
    int totSwap = 0;

    for( int partition = 1; partition < data.size() ; partition++) {
      //partition marks first item in unsorted region

      //System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      //System.out.println( data );

      //traverse sorted region from right to left
      for( int i = partition; i > 0; i-- ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        totComp += 1;
        if ( data.get(i-1).compareTo(data.get(i)) > 0 ) {

          //System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          totSwap += 1;
          data.set(i-1, data.set( i, data.get(i-1) ) );
        }
        else
          break;
      }
      totPass += 1;
    }

    System.out.println("The total amount of passes is " + totPass);
    System.out.println("The total amount of comparisons is " + totComp);
    System.out.println("The total amount of swaps is " + totSwap);

  }//end insertionSortV

  // ArrayList-returning insertionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable>
    insertionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    insertionSortV( data );

    //return working ArrayList
    return data;
  }//end insertionSort
}
