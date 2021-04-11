JC = javac
.SUFFIXES: .java .class
# AES.class:
# 	$(JC) ./src/AES.java

run:
	$(JC) ./src/AES.java
	java ./src/AES.java

clean:
	$(RM) ./src/*.class
