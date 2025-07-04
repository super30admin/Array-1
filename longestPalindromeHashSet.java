// Time Complexity : O(n)
// Space Complexity : O(1) - since there will be contant number of characters 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
    //Use a Hashset to keep track of all already visited characters
    //while traversing the string s, if we encounter a character that already exists in set then we remove this element from the set and increase the count by 2 (because we found a pair of current char in set)
    //we the current character does not exist in hashset then we add it to the set
    //After the iteration completes, if the set is not empty then we can use just one element from the set to create our palindrome so we increase the count by 1 and return else if the set is empty then we return the count as it is.
        
// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        
        //Initialize set and count variable
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                count += 2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }

        if(set.size() > 0){
            count += 1;
        }

        return count;
    }
}