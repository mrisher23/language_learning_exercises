//Just like Java, everything should be a class, but in this case it's an object. The name of the file should
//match the name of the object/class
object HelloWorld {

  //In order to execute the file, it must contain a main function that looks like this definition.
  //The function name equals its implementation in Scala.
  def main(args: Array[String]) = {

      //Scala doesn't require referencing the System library or a semicolon at the end of the line
      println("Hello World")
  }
}
