import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First prgram
        System.out.println("Hello , My name is keshav mehra");
        System.out.println("I am learninig java !");

        // variables : java is statically typed language so we have to declare data type for varibale 
        
        int a = 12; // here 12 is an integer so we have to java that we are assigining integer type value
        String Name  = "Keshav mehra"; // here keshav mehra is a string so we have to declare first 
        double cgpa = 8.0; // double stores floating point
        boolean raining = true; // boolean gives true or false

        System.out.println(a);
        System.out.println(Name);
        System.out.println(cgpa);
        System.out.println(raining);

        // operators in java are same as python  
        
        //Question 1 
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        //Question 2 
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.println("name : "+name);
        
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Age : "+age);

        System.out.print("Enter your Branch : ");
        String Branch = sc.next();
        System.out.println("Branch : "+Branch);

        //Question 3 find average of three numbers
        System.out.print("Enter number 1 : ");
        int n1 = sc.nextInt();

        System.out.print("Enter number 2 : ");
        int n2 = sc.nextInt();

        System.out.print("Enter number 3 : ");
        int n3 = sc.nextInt();

        int average = (n1 + n2 + n3)/3;

        System.out.println("Average of three number is "+average);

        // Question 4  check weather number is positive or negative
        System.out.print("Enter number to check : ");
        int number  = sc.nextInt();

        if(number<0){
            System.out.println("Number is negative .");
        }
        else{
            System.out.println("Number is Positive .");
        }
        sc.close();
    }
    
}
