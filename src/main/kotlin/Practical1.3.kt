fun main(args:Array<String>)
{
    println ("Student Enrollment Number : ")
    val enro:String = readLine()!!.toString()
    println ("Student Name : ")
    val nm:String = readLine()!!.toString()
    println ("Student Branch : ")
    val branch:String = readLine()!!.toString()
    println ("Student Class : ")
    val clas:String = readLine()!!.toString()
    println ("Student Batch : ")
    val bat:String = readLine()!!.toString()
    println ("Student College Name : ")
    val clgnm:String = readLine()!!.toString()
    println ("Student University Name : ")
    val uninm:String = readLine()!!.toString()
    println ("Student Age : ")
    val age = readLine()!!.toInt()

    println("********************")
    println("Students Data:")
    println ("ENROLLMENT NO. = $enro")
    println ("NAME = $nm")
    println ("AGE = $age")
    println ("BRANCH = $branch")
    println("Class= $clas")
    println ("BATCH = $bat")
    println ("COLLEGE NAME = $clgnm")
    println ("UNIVERSITY NAME = $uninm")

}