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
* Online demo:  http://nlp.stanford.edu:8080/parser/
* Download link: http://nlp.stanford.edu/software/stanford-postagger-2015-12-09.zip
* Sample Tutorial: http://new.galalaly.me//2011/05/tagging-text-with-stanford-pos-tagger-in-java-applications/

Stanford Named Entity Recognizer

* Home page: http://nlp.stanford.edu/software/CRF-NER.html
* Online Demo: http://nlp.stanford.edu:8080/ner/
* Download link: http://nlp.stanford.edu/software/stanford-ner-2015-12-09.zip


Sample Text :

* Barack Hussein Obama II is an American politician serving as the 44th President of the United States, the first African American to hold the office.  Born in Honolulu, Hawaii, Obama is a graduate of Columbia University and Harvard Law School, where he served as president of the Harvard Law Review. 

* Ohio is a midwestern state stretching from Appalachian Country in the south to Lake Erie in the north. On the shores of the aforementioned Great Lake is its city of Cleveland, site of the Cleveland Museum of Art and its renowned collection of masterpieces. Cleveland is also home to the Rock and Roll Hall of Fame and Museum, and expansive Cuyahoga National Park.

