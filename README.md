# sort-o_Un-upTownLeopardRock: Lea Kwok, Raven (Ruiwen) Tang

## Bubble Sort
### Best Case:
Already sorted ArrayList (in this case, least to greatest) ... because no swaps will be made during any of the n-1 passes, where n is the number of elements in the ArrayList.
### Worst Case:
Reverse-sorted ArrayList (in this case, greatest to least) ... because every comparison will result in a swap, since every element is greater than its right neighbor.

## Selection Sort
### Best Case:
N/A There isn't a "best" case because all cases take the same amount of time. There aren't any comparisons that can be skipped when looking for the index of the maximum element. Also, there is always a swap performed at the end of a pass.
### Worst Case:
N/A There isn't a "worst" case because all cases take the same amount of time. There aren't any comparisons that can be skipped when looking for the index of the maximum element. Also, there is always a swap performed at the end of a pass.


## Insertion Sort
### Best Case:
Already sorted ArrayList (in this case, least to greatest) ... because every element that is added to the sorted portion from the unsorted portion is already greater than the previously sorted elements and thus doesn't have to be "walked" anywhere.
### Worst Case:
Reverse-sorted ArrayList (in this case, greatest to least) ... because every element has to be "walked" to the leftmost index when it's added to the sorted portion.
