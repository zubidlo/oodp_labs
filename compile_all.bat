cls
md bin
SET DIR_FOR_CLASSES="./bin"
SET CLASSES="./bin;"

dir /s /B *.java > sources.txt
javac -classpath %CLASSES% -d %DIR_FOR_CLASSES% @sources.txt
del sources.txt
pause