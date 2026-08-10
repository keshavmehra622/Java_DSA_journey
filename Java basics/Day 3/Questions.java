import java.util.*;
public class Questions {
     
    // Question 1 - Check odd/even
    static String is_evenOdd(int n){
        if(n % 2 == 0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }

    // Question 2 - Find the maximum of two numbers
    static String max(int a, int b){
        if(a > b){
            return "a is greater";
        }
        else if(a < b ){
            return "b is greater";
        }
        else{
            return "Both are equal";
        }
    }

    // Question 3 - Find max of three numbers
    static String maximum(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            return "a is greater";
        }
        else if(num2 > num1 && num2 > num3){
            return "b is greater";
        }
        else{
            return "all are equal";
        }
    }

    // Question 4 - calculate factorial
    static int factorial_n(int n2){
        int factorial = 1;
        for(int i = 1; i <= n2; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    // Question 5 - calculate sum from to n
    static int sum_n(int n1){
        int sum = 0;
        for(int i = 1; i <= n1; i++){
            sum+=i;
        }
        return sum;
    }

    //Question 6 - count digits in number
    static int countDigits(int number){
        int count = 0;
        while(number > 0){
            number = number / 10 ;
            count+=1;
        }
        return count;
    }

    // challenge question
    static int reverseNumber(int number_1){
        int reversednumber = 0;
        while(number_1 > 0){
           int digit = number_1 % 10;
           reversednumber = reversednumber * 10 + digit;
           number_1 = number_1 / 10;
        }
        return reversednumber;
    }
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // callin odd even method
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        String result = is_evenOdd(n);
        System.out.println(result);

        // calling maximum of two method
        System.out.print("Enter number 1 = ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 = ");
        int b = sc.nextInt();
        String max = max(a, b);
        System.out.println(max);

        // calling max of three numbers
        System.out.print("Enter number 1 = ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 = ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3 = ");
        int num3 = sc.nextInt();
        String maximum = maximum(num1, num2, num3);
        System.out.println(maximum);

        // calling factorial function
        System.out.print("Enter number = ");
        int n2 = sc.nextInt();
        int factorial = factorial_n(n2);
        System.out.println(factorial);

        // Calling sum from 1 to n
        System.out.print("Enter number = ");
        int n1 = sc.nextInt();
        int sum = sum_n(n1);
        System.out.println(sum);

        // Calling count digits in number 
        System.out.print("Enter number more than 1 digit = ");
        int number = sc.nextInt();
        int count = countDigits(number);
        System.out.println(count);

        // Calling reversed number function
        System.out.print("Enter number more than one digit = ");
        int number_1 = sc.nextInt();
        int reversedNumber = reverseNumber(number_1);
        System.out.println(reversedNumber);

        sc.close();
    }

}
