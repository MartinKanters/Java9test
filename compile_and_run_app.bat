rmdir application\\target /S /Q
mkdir application\\target

javac -cp socialmediamentions/target -d application/target application/src/app/*.java
java -cp socialmediamentions/target;application/target app.Application
