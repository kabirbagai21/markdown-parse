test: MarkdownParse.class MarkdownParseTest2.class
	java -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest2

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

MarkdownParseTest2.class: MarkdownParseTest2.java
	javac -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest2.java
	
clean: 
	rm  *.class