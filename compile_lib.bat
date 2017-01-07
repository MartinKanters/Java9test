SET java_home=C:\tools\Java\jdk1.9-ea-jigsaw

rmdir socialmediamentions\\target /S /Q
mkdir socialmediamentions\\target

%java_home%\bin\javac -d socialmediamentions/target socialmediamentions/src/module-info.java ^
    socialmediamentions/src/socialmediamentions/exposed/*.java ^
    socialmediamentions/src/socialmediamentions/facebook/*.java ^
    socialmediamentions/src/socialmediamentions/twitter/*.java