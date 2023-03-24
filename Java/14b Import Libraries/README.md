## Gradle
This project uses the Gradle programming language to manage the dependencies and build process.
Because Groovy is a programming language unto itself, we can make some very complex build processes
and pre or post processing tasks. In order to make the build process widely compatible, it
is common to use a gradle wrapper (gradlew) which eliminates incompatibilities via different
versions of gradle on the host machine. There is a `gradlew.bat` for Windows based machines and
`gradlew` for Linux based machines.

To list all of the possible Gradle commands you can run, you can just `./gradlew tasks`.

### IDEs
More complex programming projects benefit greatly from using an IDE, which is a supped up
text editor that knows about programming languages and can detect errors within your code
as you write it.

There are two big players in Java land IDEs: Eclipse and IntelliJ IDEA. IntelliJ is probably the
more advanced editor, and while it does have a free version the advanced features are only
available to their paid version. Eclipse is free and very capable editor though.


### Compilation
We can build the project by simply running `./gradlew build`.


### Packaging
We can build the jar of the project by simply running `./gradlew jar`.


### Running
This project is configured to run with gradle, though most of the time we just want to compile
and package our project. We can run it by executing `./gradlew run`.