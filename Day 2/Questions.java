import java.util.*;
public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1 - check wether the number is positive , negative or Zero

        System.out.print("Enter the number to check : ");
        int number = sc.nextInt();

        if(number < 0){
            System.out.println("the number you entered is negative");
        }
        else if(number > 0){
            System.out.println("the number you entered is positive");
        }
        else{
            System.out.println("the number is Zero");
        }

        // Question 2 - even odd
        System.out.print("Enter number to check : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }


        // Question 3 - largest of two numbers
        System.out.print("Enter first number  : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        if(a > b){
            System.out.println("a is largest");
        }
        else if(b > a){
            System.out.println("b is largest");
        }
        else{
            System.out.println("Both are equal");
        }

        // Question 4 - largest of three numbers
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = sc.nextInt();
        
        if(num1 >= num2 && num1 >= num3){
            System.out.println("Number 1 is largest");
        }
        else if(num2 >= num1 && num2 >= num3){
            System.out.println("Number 2 is largest");
        }
        else{
            System.out.println("NUmber three is largest");
        }

        // Question 5 - print number from 1 to 10
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }

        // Question 6 - print number from 1 to 20
        for(int i = 1; i<=20; i++){
            System.out.println(i);
        }

        //Question 7 - printmultiplication table on number
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }

        //Question 8 - find sum from 1 to n
        System.out.print("Enter number : ");
        int x = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= x){
            sum+=i;
            i++;
        }
        System.out.println(sum);

        sc.close();
        
    }
    
}
