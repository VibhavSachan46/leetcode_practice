// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //testcases        
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //input string
            String st = sc.next();
            
            //calling powerSet() function
            ArrayList<String> ans = new LexSort().powerSet(st);
            
            //sorting the result of the powerSet() function
            Collections.sort(ans);
    
            //printing the result
            for(String s: ans)
                System.out.print(s + " ");
            System.out.println();    
        }
    }
}


 // } Driver Code Ends
//User function Template for Java


class LexSort
{
    //Function to return the lexicographically sorted power-set of the string.
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        ArrayList<String> ans= new ArrayList<>();
        sub(s , "" , ans);
        return ans;
    }
    
    static void sub(String s , String res , ArrayList<String> ans )
    {
        if(s.isEmpty())
        {
            ans.add(res);
            return;
        }
        char ch = s.charAt(0);
        sub(s.substring(1) , res + ch , ans);
        sub(s.substring(1) , res , ans);
    }
}


 

// { Driver Code Starts.

                                // } Driver Code Ends