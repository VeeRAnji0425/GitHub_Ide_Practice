object StringSplit {

  println(" *** this program is reference of Infosys Lex Scala Constraints **")

  def main(args: Array[String]): Unit = {

    println("** problem:- Reversing each word in a single sentence **")

    println("** Programming in Scala it should become gnimmargorP ni alacS **")

    var str = "Programming in Scala"
    val strSplit = str.split(" ")

    var strRev = List[String]()

    for (word <- strSplit) {
      strRev = strRev:+(word.reverse)
    }

    //println(strRev.mkString(" "))
    println(strRev)
    println(strRev.mkString(""))

    var st="I saw Jen in Pizza Hut yesterday"
    st.replace("saw Jen","met Bob")
    println(st)
    println(st.take(5)+st.drop(5))

    val a = """An apple a day
  	keeps the doctor away"""
    println(a.split('\n').apply(0).charAt(0).toLower+1)

    val str1="United states of America"
    val str2=Array('A','m','e','r','i','c','a')
    println(str1.slice(7,13).endsWith("s"))
    println(str2.size.>=(7))

     val s1 = "Holmes"
     val s2 = "Hol" + "mes"
     val s3 = null
     s1 == s2
    // println(s3.toUpperCase)
    val firstName = "Chris"
    val lastName = null

    val x = if (firstName != null) {
      if (lastName != null) {
        firstName + " " + lastName
      } else {
        null
      }
    } else {
      null
    }

    println(x)




  }


}
