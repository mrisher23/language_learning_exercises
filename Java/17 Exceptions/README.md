## Exceptions
Exceptions in Java come in 3 different categories:
1. Errors - Typically fatal to the program. Some time may be given to clean up resources before exiting.
2. Runtime Exceptions - Unexpected activity that happens during execution, typically programmer errors; often fatal because they are unexpected and not handled.
3. Checked Exceptions - Known things that could happen and should be handled; rarely fatal but could block necessary actions to proceed.

All of these types extend from the java.lang.Throwable class; Errors extend from java.lang.Error; and runtime exceptions
extend from java.lang.RuntimeException. Checked exceptions extend from java.lang.Exception (except those under RuntimeException).

Checked exceptions MUST be either handled or passed along to calling code explicitly. This is a compile time check.
RuntimeExceptions may [or may not] be declared thrown, but they do not need to be handled explicitly.




### Execution
Running the program should produce the following output.
```
java.util.concurrent.ExecutionException: java.lang.NullPointerException
	at com.github.mrisher23.exceptions.Main.checkedException(Main.java:36)
	at com.github.mrisher23.exceptions.Main.main(Main.java:8)
Caused by: java.lang.NullPointerException
	at com.github.mrisher23.exceptions.Main.npe(Main.java:51)
	at com.github.mrisher23.exceptions.Main.checkedException(Main.java:34)
	... 1 more
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
	at com.github.mrisher23.exceptions.Main.arrayLengthExceeded(Main.java:46)
	at com.github.mrisher23.exceptions.Main.main(Main.java:26)
```
This output contains 2 different errors. The first exception (lines 1-7) is printed from
the try/catch block. As you can see, the output shows the execution stack that caused
the error and what file:line numbers were involved. This is very helpful when trying to
debug what caused an error. The first error was re-thrown so it contains a "caused by"
block in the stack trace.

The second exception is a runtime exception so it is never explicitly thrown in the code and
is never caught. The execution of the program is halted because it is not caught.