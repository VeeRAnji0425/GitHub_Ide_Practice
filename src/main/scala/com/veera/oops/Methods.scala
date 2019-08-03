package com.veera.oops

object Methods {

  def main(args: Array[String]): Unit = {

    /*
     * here i am created two methods with def keyword. if we need to execute this methods we need to call seperately.
     */
    //creating methods

    def abc(){ println(" hello ")} //here method with empty arguments.

    def xyz(b:String) = { println(b)}  //method with one argument it returns string.


    //call the above methods.
    abc()
    xyz("vvv")







  }
}
