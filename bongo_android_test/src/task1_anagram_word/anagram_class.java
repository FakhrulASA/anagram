package task1_anagram_word;

import java.util.Arrays;

public class anagram_class {
	public void anagram_strings(String word1, String word2)
    {
    	String w1,w2;
    	boolean LENGTH_SAME=true;
    	w1=word1.replace(" ", "");
    	w2=word2.replace(" ", "");
    	if(w1.length()==w2.length())
    	{   
    		//I could use utils.array then convert my string into char arrays
    		//Then sorting them and compare.
    		//I am going for hard code here
    		final char[] array1 = new char[w1.length()]; 
            for (int i=0; i<w1.length(); i++) { 
                array1[i] = w1.charAt(i); 
            } 
            
            final char[] array2 = new char[w2.length()]; 
            for (int i=0; i<w2.length(); i++) { 
                array2[i] = w2.charAt(i); 
            }
            for(char ch: array1) {
            	 System.out.print(ch);
            }

            System.out.print(" : ");
            for(char ch: array2) {
           	 System.out.print(ch);
           }
            Arrays.sort(array1);
            Arrays.sort(array2);
            
            if(Arrays.equals(array1, array2))
            {
            	System.out.println("\nWords are anagram");
            }
            else
            {
            	System.out.println("\nWords are not anagram");
            }
            
    	}
    	else
    	{
    		//length is not same
    		//Can be declared boolean here for further execution
    	}
    	
    	
    	
    }
}
