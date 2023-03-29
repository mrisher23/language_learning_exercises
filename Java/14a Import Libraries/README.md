## Maven
This project uses the Maven tool to organize and manage our external code dependencies. The
manner in which these dependencies are organized has become a de facto standard in the Java
community, though the Maven tool itself has become replaced somewhat by Gradle in project 14b.

Maven uses a file in the root of the project directory called `pom.xml`. The Maven tool needs to be installed 
on your machine before you can compile and run this project. The Maven tool will create a
hidden directory within your user profile called `.m2` where it will keep all of the files
that you download for your project(s). You'll need to download and install it before you
can run this project. https://maven.apache.org/

### IDEs
More complex programming projects benefit greatly from using an IDE, which is a supped up
text editor that knows about programming languages and can detect errors within your code
as you write it.

There are two big players in Java land IDEs: Eclipse and IntelliJ IDEA. IntelliJ is probably the
more advanced editor, and while it does have a free version the advanced features are only
available to their paid version. Eclipse is free and very capable editor though.


### Compilation
To compile the project from the command-line, you can run `mvn compile` or `mvn clean compile`


### Packaging
To package this project into a jar file you would run `mvn package`. This will take our source files
and create a jar file out of them. It will use the default naming convention for naming this file and
place it within the `target/` directory.

### Running
This maven project is configured to be runnable through Maven, though that is
not typical. In order to run the project through Maven we can run `mvn exec:java`. We can run all
of these together with `mvn clean package exec:java` to do a complete refresh of any code
changes we may have made.