
### File Organization
If you create a Maven project on your own, you may notice that the folder structure is a little bit different:

    /
    |_src/
       |_main/
       |  |_java/
       |  |_resources/
       |_test/
          |_java/
          |_resources/

This organization allows for us to create a more complex project which uses automated
testing and data resource files (both covered later), and potatially languages other than
java. Sometimes that code can be compiled by the Java Virtual Machine, but does not need to be.

Because we aren't actively using many of these folders, they are not included when saving this example
to our git repository.