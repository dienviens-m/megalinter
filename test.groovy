// LintErrorExample.groovy

class Example {

    def name = 'Groovy Linter' // Prefer explicit type declaration

    static void main(args) {
        def unusedVar // Unused variable
        println "Hello, " + name // 'name' is non-static but used in static context

        if(true){
        println("Misaligned indentation") // Indentation issue
        }

        int result = add(5) // Wrong number of arguments
        println("Result is: " + result)
    }

    static int add(int a, int b) {
        return a + b
    }
}
