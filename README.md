# TextProcessing
Applying some basic Natural Language Processing techniques e.g.: Parts of speech tagging ,  Named entity Recognizer and Stemming

Prerequisites : Eclipse (or) Netbeans IDE , Java 1.8+ version required. 
If you are using < java 1.8 please update the java version. 
http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html


* We have organized the project as below,
  * src/
    * classifiers/
    * text-mining/
    * taggers/
  
This project was setup to perform, first, the parts-of-speech tagging using the Standford NLP parser(POStagging.java). 
For example, the following entities are tagged as follows:
* Asia_NNP 
* aircraft_NN 
* worth_JJ 
* $550_CD 
* Singapore_NNP

The abbreviations of the tags e.g. NNP,NN,JJ,CP,NNP are in the following file. https://github.com/pavan541/TextProcessing/blob/master/TextMining/POSTags.txt


Second , Named entity Recognizer 
For example, the following entities are tagged as follows(NERtagging.java):
* Asia/LOCATION
* Boeing/ORGANIZATION
* Singapore/LOCATION

At last,  Stemming (Stemming.java)
For example, the followings strings are stemmed as follows:
* require -> requir
* years -> year
* boeing -> boe
* executive -> execut

Stanford Log-linear Part-Of-Speech Tagger

* Home page: http://nlp.stanford.edu/software/tagger.html
* Download link: http://nlp.stanford.edu/software/stanford-postagger-2015-12-09.zip
* Sample Tutorial: http://new.galalaly.me//2011/05/tagging-text-with-stanford-pos-tagger-in-java-applications/

Stanford Named Entity Recognizer

* Home page: http://nlp.stanford.edu/software/CRF-NER.html
* Online Demo: http://nlp.stanford.edu:8080/ner/
* Download link: http://nlp.stanford.edu/software/stanford-ner-2015-12-09.zip
