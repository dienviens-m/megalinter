class Calculator {

    String greetUser(String name) {
        return "Hello, ${name}!"
    }

    int add(int a, int b) {
        return a + b
    }

    int subtract(int a, int b) {
        return a - b
    }

    int multiply(int a, int b) {
        return a * b
    }

    double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.")
        }
        return a / b
    }
}

// Run the code
def calc = new Calculator()

println calc.greetUser("Groovy Developer")
println "Add: ${calc.add(10, 5)}"
println "Subtract: ${calc.subtract(10, 5)}"
println "Multiply: ${calc.multiply(10, 5)}"
println "Divide: ${calc.di
