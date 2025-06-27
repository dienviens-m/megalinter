class SimpleMath {

    // Method to calculate the square of a number
    int square(int number) {
        return number * number
    }

    // Method to greet the user
    String greet(String name) {
        return "Hello, ${name}!"
    }
}

// Create an instance and call the methods
SimpleMath math = new SimpleMath()

String greeting = math.greet("Groovy User")
int result = math.square(7)

// The variables `greeting` and `result` now hold values, but nothing is printed
