## Project Organization
A typical java project contains two "mandatory" directories in the root
folder of the project. The `src` directory contains all of the source
code files used in the project. The `target` directory contains the
compiled files (covered later).

Within those directories we create a hierarchical folder structure to
organize our code files. The naming convention for these directories is
to utilize your domain name to provide a unique naming structure. That
means the root directory will probably be `com`, `org`, `net`, etc.

The second directory would be your domain name, the third would be any
subdomain name being used, and finally the project name. Within that final
directory, you are free to organize the code any way that feels logical.

It is not a requirement that we use a domain name for the directory structure.
It is just a name and the convention is a means to avoid name collisions between
different products. The default java libraries simply use `java` instead
of `com.sun.java`. Some other popular products do not follow the convention
more for legacy reasons than anything else.


## Code Structure Changes
Because we are organizing our code within directories, we need to include
a `package` statement at the start of each java file which describes its
location within the folder structure. The `src` directory is ignored as part
of the directory structure of the code. Instead of using a forward slash
to separate the directory names, the package statement uses period name
delimiters.

Not all directory names work as valid Java package names. Package names *should*
be all lowercase and avoid symbols. It is also convention that package names
should be a single word. While the names can include numbers, it cannot begin
with one.


## Compilation
Because we have organized the project into a complex 
folder structure we can no longer just run `javac *.java`.
Since there are no external dependencies, it is still relatively
easy by just running `javac -d target src/**/*.java`. This
will place the compiled .class files into the `target` directory.
If using JDK 9+, javac will automatically create that directory;
otherwise you will need to create it before running the command.

## Running
Once we have all the classes compiled, we'll want to package them into a
jar file. JAR is an abbreviation for Java ARchive, which is simply a zip
file of the directory with an optional metadata file.

To create the jar, run `jar cvf <jarname> -C target/ .`. This will take all
of the contents of the target directory and create a jar file from it.

Now we can run the code with `java -cp <jarname> com.github.mrisher23.organization.runner.RunMe`.

As you can see, this can quickly get out of hand for larger projects, so in the next lesson
we will use tools that help us manage the source code and compilation process.