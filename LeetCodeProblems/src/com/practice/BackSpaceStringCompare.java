/**
 * 
 */
package com.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashut
 *
 */
/*
 * //844. Backspace String Compare
 * Given two strings s and t, return true if
 * they are equal when both are typed into empty text editors. '#' means a
 * backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "ab#c", t = "ad#c" Output: true Explanation: Both s and t become
 * "ac". Example 2:
 * 
 * Input: s = "ab##", t = "c#d#" Output: true Explanation: Both s and t become
 * "". Example 3:
 * 
 * Input: s = "a#c", t = "b" Output: false Explanation: s becomes "c" while t
 * becomes "b".
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length, t.length <= 200 s and t only contain lowercase letters and '#'
 * characters.
 */
public class BackSpaceStringCompare {

	//Solution 1
	 public boolean backspaceCompare(String s, String t) {
	        
	        if(null==s && null==t )
	            return true;
	        if((null==s && null!=t) || (null!=s && null==t))
	            return false;
	        s=removeBkspc(s);
	        t=removeBkspc(t);
	        return s.equals(t);
	            
	    }
	    
	    public String removeBkspc(String s){
	        int ind=-1;
	        while(s.indexOf("#")!=-1){
	            ind=s.indexOf("#");
	            if(ind==s.length())
	                s=s.substring(0,ind-1);
	            else if(ind<2)
	                s=s.substring(ind+1);
	            else
	               s=s.substring(0,ind-1)+s.substring(ind+1);
	        }
	        return s;
	    }
}
