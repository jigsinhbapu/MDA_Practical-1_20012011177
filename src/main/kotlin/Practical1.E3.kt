open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }

}
fun main(){
    var s1=Student("Jigarsinh","Vihol",20,20012011177,"CE","A","AB2")
    var s2=Student("Nikhar","Sendhav",20,200120111456,"CE","A","AB2")
    var s3=Student("Prince","Verma",21,20012011141,"CE","C","AB8")
    var s4=Student("Ansian","Ansari",19,2001201101,"It","B","AB5")
    var s5=Student("Abhay","Patel",20,20012011107,"AI","A","AB4")

}

