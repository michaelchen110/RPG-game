main:
		javac -cp src/ -d bin/ src/rpg/JVMRpg.java

editor:
		javac -cp src/ -d bin/ src/rpg/MapEditor.java
		java -cp bin/ rpg/MapEditor

run:
		java -cp bin/ rpg/JVMRpg

demo:
		javac -cp src/ -d bin/ -encoding UTF-8 src/rpg/JVMRpg.java
		java -cp bin/ rpg/JVMRpg
start:
		javac -cp src/ -d bin/ -encoding UTF-8 src/rpg/Starting.java
		javac -cp src/ -d bin/ -encoding UTF-8 src/rpg/StartingDemo.java
		java -cp bin/ rpg/StartingDemo

