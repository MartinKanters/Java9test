#Compiling

library:

    javac -d socialmediamentions/target socialmediamentions/src/module-info.java ^
        socialmediamentions/src/socialmediamentions/exposed/*.java ^
        socialmediamentions/src/socialmediamentions/facebook/*.java ^
        socialmediamentions/src/socialmediamentions/twitter/*.java

application:

    javac\bin\javac --module-path socialmediamentions/target -d application/target application/src/module-info.java ^
        application/src/app/*.java

#Running

application:
    
    java --module-path socialmediamentions/target;application/target -m app/app.Application