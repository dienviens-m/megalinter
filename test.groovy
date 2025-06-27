import java.util.*     // Unused import to test linter

class HelloWorld {

def sayHello(name){
    if(name == null){
        println("Hello, Stranger!")
    } else{
            println("Hello, " + name ) } // inconsistent spacing and braces
}

def calculateSum(a, b){
return a + b } // bad formatting

def methodWithLongLine(){
    println("This is a very long line that is meant to exceed the typical 100 characters limit which most linters usually complain about in code reviews.")
}

def unusedMethod(){
    def x = 5
}

}

def hello = new HelloWorld()
hello.sayHello("Groovy")
hello.calculateSum(10, 20)
