package org.knoesis.text.mining;

import java.io.IOException;

import edu.stanford.nlp.ie.AbstractSequenceClassifier;
import edu.stanford.nlp.ie.crf.CRFClassifier;
import edu.stanford.nlp.ling.CoreLabel;

public class NERtagging {

	public static void main(String[] args) throws Throwable  {
    	String sample = "Southeast Asia requires 3,750 new aircraft worth $550 billion in 20 years from 2015, a senior Boeing executive told a press conference ahead of the Singapore Airshow that starts on Tuesday";
    	doNER(sample);
    }
	
	public static void doNER(String sample) throws Throwable, ClassNotFoundException, IOException
    {
    	
		String serializedClassifier = "classifiers/english.all.3class.distsim.crf.ser.gz";
    	
		//class for sequence classification 
		AbstractSequenceClassifier<CoreLabel> classifier = CRFClassifier.getClassifier(serializedClassifier);
		
		//split the string with special characters 
		String[] example = sample.split("[ \t\n,\\.\"!?$~()\\[\\]\\{\\}:;/\\\\<>=%*]");
		for (String str : example) {
			System.out.println(classifier.classifyToString(str));
		}
    }
}
