fun main() {

    //ways to declare variables in kotlin -var,val
     var a = 10  //declaration type 1
     var a_mock :Int  //declaration type 2
     a_mock = 12
     a= 25 //doesn't give error cz var is mutable

     val b = 20
     //b= 9  // gives error cz val cannot be mutated

     //taking userInput - in String
     print("What is your name?")
     val name = readLine()
     println("hey $name")
     //taking userInput - in Int
     print("Enter a number?")
     var num = readLine()!!.toInt()
     println("number $num")

     //program to find Maximum

     var x= 8
     var y = 20
     var z = 15
     println("x $x")
     println("y $y")
     println("z $z")



     var max = if(x>y){
          if(x>z){
              "$x"
          }else{
               "$z"
          }
     }
     else{
          if(y>z){
               "$y"
          }
          else{
               "$z"
          }
     }

     println("maximum value is $max")


     //declare array
     println("Print values in array")
     var arr = arrayOf('2','@',"chat",true)
     for (item in arr){
          println(item)
     }


     //switch case - type -1
     val weeknum = 6
     var weekDay = when(weeknum){
          1 -> "Mon"
          2 -> "Tue"
          3 -> "wed"
          4 -> "thur"
          5 -> "Fri"
          6 -> "sat"
          7 -> "sun"
          else -> "Error"
     }

     println("weekday is $weekDay")

     //switch case range - type 2
     var marks = 67

     var percentage = when(marks){
          in 1..40 -> print("Fail")
          in 41..60 -> print("second division")
          in 61..90 -> print("first division")
          in 90..100 -> print("success")
          else -> print("Error")
     }

}
