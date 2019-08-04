package com.veera.oops

object Test1 {

  def add() {
    println("print this line in Object level")
}

  def main(args: Array[String]): Unit = {

    //create a object with the class name.
    var obj = new Class_Obje_Test //object has to be created.

    //Invoke add() method by using Obj.
    obj.add1()
   // println("here it prints with print method:" + add)
    add
  //  obj.add1()
  }

  class Class_Obje_Test {

    def add1() {
      println("print this line CLass levelss")
    }
  }

}
