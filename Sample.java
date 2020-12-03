Q1) Product of array except self
// Time Complexity :  O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We go from right to keep the right product into the output array and then use this while traversing
// from left to compute product value for each index.

Q2) Diagonal Traverse
// Time Complexity :  O(MN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We start with 2 direction variable one for up and one for down
// then change directions only when you hit boundary accordingly.


Q3) Spiral Matrix
// Time Complexity :  O(MN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We go through 4 for loops and 4 variables each indiacating boundary
// of traversal and once we traverse one circle we reduce or increment boundary
// variables accordingly. keep track that u check boudary condition once inside while 
// loop for it work for all cases.

