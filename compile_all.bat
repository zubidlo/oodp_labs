cls
SET DIR_FOR_CLASSES="./src"
SET CLASSES="./src;"

dir /s /B *.java > sources.txt
javac -classpath %CLASSES% -d %DIR_FOR_CLASSES% @sources.txt
del sources.txt
pause