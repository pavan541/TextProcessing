package org.knoesis.text.mining;
import java.io.FileNotFoundException;
//import java.awt.List;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//import javax.annotation.PostConstruct;

//import edu.stanford.nlp.ie.AbstractSequenceClassifier;
//import edu.stanford.nlp.ie.crf.CRFClassifier;
//import edu.stanford.nlp.io.IOUtils;
//import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
 

//import edu.stanford.nlp.ie.AbstractSequenceClassifier;
//import edu.stanford.nlp.ie.crf.*;
//import edu.stanford.nlp.io.IOUtils;
//import edu.stanford.nlp.ling.CoreLabel;
//import edu.stanford.nlp.ling.CoreAnnotations;
//import edu.stanford.nlp.sequences.DocumentReaderAndWriter;
//import edu.stanford.nlp.util.Triple;

public class POStagging {
    public static void main(String[] args) throws Throwable  {
    	String sample = "Southeast Asia requires 3,750 new aircraft worth $550 billion in 20 years from 2015, a senior Boeing executive told a press conference ahead of the Singapore Airshow that starts on Tuesday";
    	//Method 
    	doPOSTagging(sample);
    }
    
    public static void doPOSTagging(String sample) throws IOException,
    ClassNotFoundException
    {
    	 //Class to run,train, and test the parts of speech tagger.
    	 MaxentTagger tagger = new MaxentTagger("taggers/english-bidirectional-distsim.tagger");
  
		 // The tagged string
		 String tagged = tagger.tagString(sample);
  
		 // Output the result
		 System.out.println(tagged);
		 
		 //Other way to tag the string
		 String taggedString = tagger.tagTokenizedString(sample);
		
		 System.out.println(taggedString);
		
     }
  
}