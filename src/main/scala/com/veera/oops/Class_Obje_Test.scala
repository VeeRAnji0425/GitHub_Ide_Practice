/*
package com.veera.oops

class Class_Obje_Test {

  //def add() {println("print this line")}

  /*def main(args: Array[String]): Unit = {

    //create a object with the class name.
    var obj = new Class_Obje_Test  //object has to be created.

    //Invoke add() method by using Obj.
    obj.add*/

    /*
     * here when we try to run this application, when you define main method also it won't run or it won't shows you run as scala application.
     * because In Java it works fine.but in SCALA Everything is started from the OBject.
     *
     * In any program language entry point is the MAIN method.
     * if we run scala application define with in scala object, call your class methods and run your scala object.
     */

    object Test1 extends Class_Obje_Test {

      def add() {println("print this line")}

      def main(args: Array[String]): Unit = {

        //create a object with the class name.
        var obj = new Class_Obje_Test  //object has to be created.

        //Invoke add() method by using Obj.
        obj.add()

    }


  }

}
*/
