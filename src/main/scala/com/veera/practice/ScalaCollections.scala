package com.veera.practice

// Source from DevInside youtube

object ScalaCollections {

  def main(args: Array[String]): Unit = {

    println("Hi this is scala collections from DevInsdide you")

    println("***** SETS *****")

    /*
     * A Set is a collection of Distinct Objects.
     * it means, how many objects you have, it takes only one object length or size.
     * Laws:- No Duplicates, No Order
     *
     */

    val sets = collection.mutable.Set(1,2,3)
    println(sets)
   //sets.add("hello")
    sets.add(25)
    println(sets)

  }

}
