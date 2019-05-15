object First{  
 def factorial(n: Int): Int = { 
          
        var f = 1
        for(i <- 1 to n) 
        { 
            f = f * i; 
        } 
          
        return f 
    }    
 def main(args:Array[String]){  
        println ("Welcome to scala programming.\nScala stands for 'scalable language' and is a combination of object-oriented programming and functional programming.\nIt is highly scalable and so is the 'scala'.\nHere is a sample scala program to find factorial of a number which is integrated with jenkins.")
println("Factorial of 5 is: "+factorial(5))  
    }  
}  
