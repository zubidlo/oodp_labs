cls
md bin
SET DIR_FOR_CLASSES="./bin"
SET CLASSES="./bin;"

javac -classpath %CLASSES% -d %DIR_FOR_CLASSES% src/utilities/*.java
javac -classpath %CLASSES% -d %DIR_FOR_CLASSES% src/lab_1/*.java