import java.util.*;
public class Student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // STUDENT INFORMATION SYSTEM
        System.out.println("===========================");
        System.out.println("     Student infomation    ");
        System.out.println("===========================");

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        System.out.print("Enter your branch : ");
        String branch = sc.nextLine();
        sc.nextLine();

        System.out.print("Enter your mobile number : ");
        long mob_num = sc.nextLong();

        System.out.println("===========================");
        System.out.println("      Student Details      ");
        System.out.println("===========================");

        System.out.println("Student name     : "+name);
        System.out.println("Student age      : "+age);
        System.out.println("Branch           : "+branch);
        System.out.println("Student's number : "+mob_num);

        sc.close();
    }
}