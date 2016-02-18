package org.knoesis.text.mining;

public class Stemming {
	 
	
	public static void main(String[] args)
	{
		String sample = "Southeast Asia requires 3,750 new aircraft worth $550 billion in 20 years from 2015, a senior Boeing executive told a press conference ahead of the Singapore Airshow that starts on Tuesday";
		String words[] = null;
		
		//split the string with special characters 
		words = sample.split("[ \t\n,\\.\"!?$~()\\[\\]\\{\\}:;/\\\\<>=%*]");
		for(String read : words)
		{
			read = read.toLowerCase();
			read = stemString(read);
			System.out.println(read);
		}
	}
	
	public static String stemString(String string) 
     {
        Stemmer stemmerObj = new Stemmer();
        for (int i = 0; i < string.length(); i++) {
            stemmerObj.add(string.charAt(i));
        }
        stemmerObj.stem();
        string = stemmerObj.toString();
        return string;
     }
	 

}
