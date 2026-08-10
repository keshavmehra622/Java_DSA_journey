// methods - methods are nothing but they are function in other language
// these are used to make a block of code reusable it makes code maintainable and modlar

// Declaration of a method

public class methods{
    static void greet(String name){   //void function do not return any value it only prints the argument
        System.out.println("Hello " + name);
    }
    static int add(int a, int b){    // int function return integrt value
        return a + b;
    }
    static boolean isEven(int n){   // boolean function returns true/false
        return n % 2 == 0;

    }
    public static void main(String[] args) {
        greet("Keshav");

        int result = add(4, 5);
        System.out.println(result);

        System.out.println(isEven(4));
    }
}
