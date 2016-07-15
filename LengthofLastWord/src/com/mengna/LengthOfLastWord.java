package com.mengna;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthOfLastWord solution=new LengthOfLastWord();
		solution.lengthOfLastWord("");
	}

	    public int lengthOfLastWord(String s) {
	    	
	    		String [] strArray = s.split(" ");
	    		if(strArray.length==0)
	    			return 0;
	    		else {
	    			String lastword=strArray[strArray.length-1];
			    	return lastword.length();
				}
		    	
			
	    }
	
}
