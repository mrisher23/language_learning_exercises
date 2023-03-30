## Logging
Logging is an important aspect of a mature programming product. As early developers we typically just write
print statements that go to standard output. This crowds up the standard output channel with things
that shouldn't be there in a final product. Additionally, it is difficult to find and disable
all of these statements when it's time to finish things up. This takes additional dev time
and more dev time when they needed added back into the code for the next phase of the project.

A good logging framework allows us to put these print statements everywhere in the code that we
would want, but quickly disable some or all of them as needed. Additionally, we should be able
to quickly change *where* the logging statements go. Maybe we want it to go to standard out, but 
more likely we want it to go to a file; maybe even a database in a rare case.

The logging frameworks below accomplish goal #1 by having different levels of logging
which disable progressively as we turn down the verbosity.
 - Off
 - Fatal
 - Error
 - Warning
 - Info
 - Debug
 - Trace
 - All

Different frameworks have slightly different names; some may have a few more or a few less, but
they'll all have similar hierarchical levels.

The second aspect of controlling which messages get output and which don't, comes from configuration
that allows us to control which packages print at which levels and to what destination.
It is not uncommon to turn off logging messages for code that we don't control from external libraries.
This is where using good package naming practices comes in handy.

### Log4j
Apache's Log4j was probably the first major framework for logging within Java. It is still very
popular within Java projects, though a recent CVE-2021-44832 vulnerability has given everyone using
the framework a headache.

Log4j can be configured with a properties file or XML file located in the root directory
of the jar file. In order to put stuff there we have placed it within the `src/main/resources` 
directory. Log4j has a default configuration file if we do not provide one. It is always
a good idea to provide a root logger (see configuration) which will be used if no specific
configuration is found.


### Java Logging
Java finally got into the logging game in version 1.4. While it isn't very common
to see the built-in libraries being used for logging, they are perfectly capable for
filling most of the logging needs of a project.


### SLF4j
The SLF4j project was developed as an abstraction on top of a number of logging frameworks.
You would just configure SLF4j within your project and it would translate that to any other logging 
frameworks used within your project.


### Packaging
In this project we are using a FAT or SHADED jar file. That is a singular jar file which
contains our code and the contents of all our dependencies. This is convenient for distributing
a single file that we can run. However, it is not good practice when deploying code in a 
more complex environment. We cannot upgrade specific libraries without rebuilding the whole
jar file.


### Running
