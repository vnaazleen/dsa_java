# Sorting

Arranging data in increasing or decreasing order

There are 2 types of sortings:
1. External Sorting

2. Internal Sorting

## External Sorting techniques
These techniques are used in olden days when RAM was not found. The techniques are:
 * Polyphase Merge Sorting
 * Oscillatory Sorting
 * K way Merge sort

## Internal Sorting techniques
These are modren techniques which makes use of RAM and very fast. There are lot of internal sorting techniques some of them are:
 * Bubble Sort
 * Selection sort
 * Insertion sort
 * Shell sort
 * Merge sort
 * Quick sort
 * Counting sort
 * Binary tree sort
 * Heap sort
 * Radix sort
 
 ## Table of Sorting Algorithms:

|    ALGORITHM   | Basic concept   | O  | Ω |
| :------------:  |:---------------:|:---:|:--:|
| Bubble sort    | Swap **adjacent pairs** of elements if they are out of order, effectively **bubbling** larger elements to the right and smaller to left| n^2 | n |
| Selection sort |Find the **smallest** element of the array and swap it with the **first** unsorted element in the array  | n^2  | n^2 |
| Insertion sort | Proceed once through the array from left-to-right, **shifting** elements as necessary to insert each element into its correct place|n^2 | n |
| Shell sort | sorting pairs of elements **far-apart** from eachother, then progressively reducing the gap b/n elements compared| n ^2 | nlogn|
| Merge sort     | Split the full array into sub arrays then **merge** those sub arrays back together in the correct order| nlogn | nlogn |
| Quick sort     | choose a **pivot**, partition the array based on pivot at last pivot is in sorted psoition then recursively apply thus to sub arrays|  O(n^2) | O(n*log n) |
