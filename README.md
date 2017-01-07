#Compiling

library:

    javac -d socialmediamentions/target socialmediamentions/src/exposed/*.java socialmediamentions/src/facebook/*.java socialmediamentions/src/twitter/*.java

application:

    javac -cp socialmediamentions/target -d application/target application/src/app/*.java

#Running

application:
    
    java -cp socialmediamentions/target;application/target app.Application