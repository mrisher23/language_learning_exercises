## Javadoc
Java has a built-in tool for generating HTML based documentation for your project.
It can leverage specially formatted comments within the code to generate the documentation.


### Comments
The comments look similar to block comments, but while a block comment looks like `/* ... */`,
a Javadoc comment looks like `/** ... */`. Because these are basically just comments,
they provide documentation within our code as well as documents that we can share without
disclosing the source code itself. These comments are only valid when placed just above
a method, class or variable (not a method variable). 

### Formatting
We can apply special formatting to our comments with tables and lists by using HTML
tags within our comments. Because this content going into a HTML page, we have to be 
careful about using special characters for HTML.

### Tags
Javadoc uses some special tags towards the end of the Javadoc comment blocks that
add metadata about the classes, variables and methods that we comment. Check out
https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html#CHDJGIJB
for a list of tags available. Using tags is not required, but @throws, @returns, and
@param should always be provided when applicable.

### Inheritance
Inheritance is a topic that hasn't been covered yet in this project, but our documentation
is inherited between files just as the code is. If we want to provide updated documentation for
a child class it will override the documentation from the parent.

### Private
Because the documentation is intended to be shared with people outside of the project,
there is no need to provide Javadoc comments for private classes, methods or variables.

### Generating Documentation
In order to generate Javadoc website for this project, we just need to run `javadoc -d ./docs -sourcepath ./src/main/java com.github.mrisher23.documentation.animals`.
There are a lot more options that we can use to control what gets included or not and how
the resulting webpage appears. We can totally customize it to our own corporate colors and fonts.
Just don't get too crazy as Java developers expect it to look similar to the official Java documentation.