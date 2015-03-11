cls
SET DIR_FOR_CLASSES="./src"
SET CLASSES="./src;./libs/LizardAndAlligator_Code_Supplied.jar;"

dir /s /B *.java > sources.txt
javac -classpath %CLASSES% -d %DIR_FOR_CLASSES% @sources.txt
del sources.txt
pause