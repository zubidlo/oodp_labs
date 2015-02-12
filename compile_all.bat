cls
md bin
SET DIR_FOR_CLASSES="./bin"
SET CLASSES="./bin;"

javac -classpath %CLASSES% -d %DIR_FOR_CLASSES% src/utilities/*.java
javac -classpath %CLASSES% -d %DIR_FOR_CLASSES% src/lab_1/*.java
javac -classpath %CLASSES% -d %DIR_FOR_CLASSES% src/lab_2/part_1/*.java
javac -classpath %CLASSES% -d %DIR_FOR_CLASSES% src/lab_2/part_2/*.java
javac -classpath %CLASSES% -d %DIR_FOR_CLASSES% src/lab_2/part_3/*.java
javac -classpath %CLASSES% -d %DIR_FOR_CLASSES% src/lab_2/part_4/*.java

pause