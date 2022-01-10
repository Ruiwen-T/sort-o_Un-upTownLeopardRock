# sort-o_Un-upTownLeopardRock: Lea Kwok, Raven (Ruiwen) Tang

## Bubble Sort
### Best Case:
Already sorted ArrayList (in this case, least to greatest) ... because no swaps will be made during any of the n-1 passes, where n is the number of elements in the ArrayList.
#### Runtime: O(n^2)
During the first pass, n-1 comparisons are made. During the second pass, n-2 comparisons are made. During the third pass, n-3 comparisons are made. During the kth pass, n-k comparisons are made. On the last ((n-1)th) pass, 1 comparison is made. A comparison takes O(1) time, so it's not necessary to multiply the number of comparisons by the time it takes to complete a comparison, since doing so would only contribute an insignificant coefficient. No swaps are made throughout this case.
(n-1) + (n-2) + (n-3) + ... + 1 = (n-1)n/2 = (n^2-n)/2 --> O(n^2)

### Worst Case:
Reverse-sorted ArrayList (in this case, greatest to least) ... because every comparison will result in a swap, since every element is greater than its right neighbor.
#### Runtime: O(n^2)
During the first pass, n-1 comparisons are made and n-1 swaps are made. During the second pass, n-2 comparisons are made and n-2 swaps are made. During the kth pass, n-k comparisons are made and n-k swaps are made. On the last ((n-1)th) pass, 1 comparison is made. A comparison takes O(1) time, and a swap takes O(1) time, so it's not necessary to consider how the time of comparisons or time of swaps contributes a coefficient to these terms.
(n-1) + (n-2) + (n-3) + ... + 1 = (n-1)n/2 = (n^2-n)/2 --> O(n^2)

## Selection Sort
### Best Case:
N/A There isn't a "best" case because all cases take the same amount of time. There aren't any comparisons that can be skipped when looking for the index of the maximum element. Also, there is always a swap performed at the end of a pass.
#### Runtime: O(n^2)
During the first pass, n-1 comparisons are made and 1 swap is made. During the second pass, n-2 comparisons are made and 1 swap is made. During the third pass, n-3 comparisons are made and 1 swap is made. On the last ((n-1)th) pass, 1 comparison is made and 1 swap is made. A comparison takes O(1) time, and a swap takes O(1) time, so it's not necessary to consider how the time of comparisons or time of swaps contributes a coefficient to these terms.
(n-1) + 1 + (n-2) + 1 + (n-3) + 1 + ... + 1 + 1 = n + (n-1) + (n-2) + ... + 2 = (n+2)(n-1)/2 --> O(n^2)
### Worst Case:
N/A There isn't a "worst" case because all cases take the same amount of time. There aren't any comparisons that can be skipped when looking for the index of the maximum element. Also, there is always a swap performed at the end of a pass.
#### Runtime: O(n^2)
During the first pass, n-1 comparisons are made and 1 swap is made. During the second pass, n-2 comparisons are made and 1 swap is made. During the third pass, n-3 comparisons are made and 1 swap is made. On the last ((n-1)th) pass, 1 comparison is made and 1 swap is made. A comparison takes O(1) time, and a swap takes O(1) time, so it's not necessary to consider how the time of comparisons or time of swaps contributes a coefficient to these terms.
(n-1) + 1 + (n-2) + 1 + (n-3) + 1 + ... + 1 + 1 = n + (n-1) + (n-2) + ... + 2 = (n+2)(n-1)/2 --> O(n^2)


## Insertion Sort
### Best Case:
Already sorted ArrayList (in this case, least to greatest) ... because every element that is added to the sorted portion from the unsorted portion is already greater than the previously sorted elements and thus doesn't have to be "walked" anywhere.
#### Runtime: O(n)
During the first pass, 1 comparison is made. During the second pass, 1 comparison is made. During the third pass, 1 comparison is made. During the kth pass, 1 comparison is made. During the last ((n-1)th) pass, 1 comparison is made. A comparison takes O(1) time, so it's not necessary to multiply the number of comparisons by the time it takes to complete a comparison, since doing so would only contribute an insignificant coefficient. No swaps are made throughout this case.
1 + 1 + 1 + ... + 1 = n-1 --> O(n)
### Worst Case:
Reverse-sorted ArrayList (in this case, greatest to least) ... because every element has to be "walked" to the leftmost index when it's added to the sorted portion.
#### Runtime: O(n^2)
During the first pass, n-1 comparisons are made and n-1 swaps are made. During the second pass, n-2 comparisons are made and n-2 swaps are made. During the third pass, n-3 comparisons are made and n-3 swaps are made. During the kth pass, n-k comparisons are made and n-k comparisons are made. During the last ((n-1)th) pass, 1 comparison is made and 1 swap is made. A comparison takes O(1) time, and a swap takes O(1) time, so it's not necessary to consider how the time of comparisons or time of swaps contributes a coefficient to these terms.
(n-1) + (n-2) + (n-3) + ... + 1 = (n-1+1)(n-1)/2 = n(n-1)/2 --> O(n^2)
