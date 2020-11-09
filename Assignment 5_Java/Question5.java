//
class Question5 { 
    static void count(String str) 
    { 
        
        char[] ch = str.toCharArray(); 
        for (int i = 0; i < ch.length; i++) { 
  
           
            String s = ""; 
  
            
            while (i < ch.length && ch[i] != ' ') { 
  
               
                s = s + ch[i]; 
                i++; 
            } 
  
            if (s.length() > 0)  
                System.out.println(s + "->" + s.length());             
        } 
    } 
    public static void main(String[] args) 
    { 
        String str = "I am learning java"; 
        count(str); 
    } 
} 

//Output

/*I->1
am->2
learning->8
java->4
*/