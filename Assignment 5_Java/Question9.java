
//Question9

import java.util.*;
import java.io.*; 
import java.util.*; 
  
 
public class Question9
{ 
    static final int MAX_CHAR = 26; 
  
    static void printCommon(String s1, String s2) 
    { 
        
        int[] a1 = new int[MAX_CHAR]; 
        int[] a2 = new int[MAX_CHAR]; 
  
        int length1 = s1.length(); 
        int length2 = s2.length(); 
  
        for (int i = 0 ; i < length1 ; i++) 
           a1[s1.charAt(i) - 'a'] += 1; 
  
        for (int i = 0 ; i < length2 ; i++) 
           a2[s2.charAt(i) - 'a'] += 1; 
  
        
        for (int i = 0 ; i < MAX_CHAR ; i++) 
        { 
            if (a1[i] != 0 && a2[i] != 0) 
            { 
                
                for (int j = 0 ; j < Math.min(a1[i], a2[i]) ; j++) 
                    System.out.print(((char)(i + 'a'))); 
            } 
        } 
    } 
  
    
    public static void main(String[] args) throws IOException 
    { 
        String s1 = "hello", s2 = "oneandall"; 
        printCommon(s1, s2); 
    } 
}
//OUTPUT
/*
ello
*/