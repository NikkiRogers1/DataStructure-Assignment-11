# Journal
Phase 1-
The swap method will be useful in future phases because it allows elements in the array to exchange positions. Sorting algorithms use swapping to move values into the correct order until the array is sorted.

Phase 2- selection sort O(n^2)
No, the number of comparisons does not change because the array still goes through the for loop to search for the smallest value. Even if the array is already sorted, Selection Sort still checks the remaining values during each pass instead of skipping them. Because it continues going through the loop, the number of comparisons stays the same.

Phase 3- The Efficiency leap( merge sort O (n log n))-
Merge Sort needs an auxiliary array, so it uses more memory. Selection Sort sorts in place, so it requires less memory. When RAM is limited, Selection Sort may be a better choice because it doesn't require the additional array that Merge Sort needs.



 Phase 4-
  I tested Selection Sort and Merge Sort to see how they performed with different array sizes. When I tested both algorithms with 10,000 elements, Selection Sort took 23 milliseconds while Merge Sort took 3 milliseconds. I also tested Merge Sort with 1,000,000 elements, and it took 129 milliseconds to complete. I didn't test Selection Sort with 1,000,000 elements because its O(N²) time complexity would make that test extremely time-consuming. I also tested both sorting algorithms with an already sorted array, a reverse-sorted array, and an array containing all identical values. Both algorithms passed all three tests, and every validation returned true. I didn't encounter any significant bugs or unexpected behavior during these tests. The results showed what I expected from the time complexities of these algorithms. Selection Sort took longer than Merge Sort with the same 10,000 elements because Selection Sort has an O(N²) time complexity, while Merge Sort has an O(N log N) time complexity. I consistently measured the time by starting the timer right before the sorting method and stopping it immediately afterward, so the timing only measured the sorting process itself. AI feedback helped me throughout this assignment by helping me understand the algorithms, work through the different phases, and verify that my sorting methods were working correctly. It also helped me better understand the differences in time complexity and why Merge Sort was more efficient when working with larger arrays.