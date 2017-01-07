SET java_home=C:\tools\Java\jdk1.9-ea-jigsaw

rmdir application\\target /S /Q
mkdir application\\target

%java_home%\bin\javac --module-path socialmediamentions/target -d application/target application/src/module-info.java ^
    application/src/app/*.java

%java_home%\bin\java --module-path socialmediamentions/target;application/target -m app/app.Application
