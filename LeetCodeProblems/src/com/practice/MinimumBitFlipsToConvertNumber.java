package com.practice;
/*


2220. Minimum Bit Flips to Convert Number
Solved
Easy

Topics
Companies

Hint
A bit flip of a number x is choosing a bit in the binary representation of x and flipping it from either 0 to 1 or 1 to 0.

For example, for x = 7, the binary representation is 111 and we may choose any bit (including any leading zeros not shown) and flip it. We can flip the first bit from the right to get 110, flip the second bit from the right to get 101, flip the fifth bit from the right (a leading zero) to get 10111, etc.
Given two integers start and goal, return the minimum number of bit flips to convert start to goal.



Example 1:

Input: start = 10, goal = 7
Output: 3
Explanation: The binary representation of 10 and 7 are 1010 and 0111 respectively. We can convert 10 to 7 in 3 steps:
- Flip the first bit from the right: 1010 -> 1011.
- Flip the third bit from the right: 1011 -> 1111.
- Flip the fourth bit from the right: 1111 -> 0111.
It can be shown we cannot convert 10 to 7 in less than 3 steps. Hence, we return 3.
Example 2:

Input: start = 3, goal = 4
Output: 3
Explanation: The binary representation of 3 and 4 are 011 and 100 respectively. We can convert 3 to 4 in 3 steps:
- Flip the first bit from the right: 011 -> 010.
- Flip the second bit from the right: 010 -> 000.
- Flip the third bit from the right: 000 -> 100.
It can be shown we cannot convert 3 to 4 in less than 3 steps. Hence, we return 3.


Constraints:

0 <= start, goal <= 109
 */
public class MinimumBitFlipsToConvertNumber {
    public int minBitFlips(int start, int goal) {
        if(start==goal)
            return 0;
        int ans=0;
        while(start>0 || goal>0){
            if(start%2!=goal%2){
                ans++;
            }
            start = start/2;
            goal=goal/2;
        }
        return ans+(start>goal?clo(start):clo(goal));
        
        // String firstNum = Integer.toBinaryString(start);
        // String secondNum = Integer.toBinaryString(goal);
        // int diff=0;
        // if(firstNum.length()>secondNum.length()){
        //     diff = firstNum.length() - secondNum.length();
        //     return findMin(firstNum,secondNum,diff);
        // } else{
        //     diff = secondNum.length() - firstNum.length();
        //     return findMin(secondNum,firstNum,diff);
        // }
    }
    
    private int clo(int num){
        int ans=0;
        while(num>0){
            if(num%2==1){
                ans++;
            }
            num=num/2;
        }
        return num;
    }
    // private int findMin(String s1, String s2, int diff){
    //     int ans=diff;
    //     for(int i =0;i<diff;i++){
    //        if(s1.charAt(i) =='0')
    //            ans--;
    //     }
    //     for(int i=0;i<s2.length();i++){
    //          if (s1.charAt(i+diff) != s2.charAt(i)) {
    //             ans++;
    //          }
    //     }
    //     return ans;
    // }
    
}
