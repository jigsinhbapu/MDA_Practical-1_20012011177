fun main(args:Array<String>)
{
    println("Enter any value: ")
    val s1:Int = readLine()!!.toInt()
    if(s1%2==0)
    {
        print("The number is Even....")
    }
    else
    {
        print("The number is Odd....")
    }
}