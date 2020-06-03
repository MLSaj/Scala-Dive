object FibScala {

  def main(args: Array[String]): Unit = {
    var a = 0
    var b = 0
    var c = 1
    for(a <-1 to 8){
      println(f"Value of fib is ${b+c}")
      var temp = b
      b = c
      c = temp + c

    }
  }


}
