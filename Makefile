main:
		javac -cp src/ -d bin/ -encoding UTF-8 src/TalkBoardDemo.java
		javac -cp src/ -d bin/ src/JVMRpg.java

editor:
		javac -cp src/ -d bin/ src/MapEditor.java
		java -cp bin/ MapEditor

run:
		java -cp bin/ JVMRpg

demo:
		java -cp bin/ TalkBoardDemo

