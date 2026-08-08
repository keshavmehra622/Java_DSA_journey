import java.util.*;
public class conditions {
    public static void main(String[] args) {
      Scanner sc =  new Scanner(System.in);

      // Conditions : if , if-else , if-else-if 

      //voting eligibility
      System.out.print("Enter your age : ");
      int age = sc.nextInt();

      if(age >= 18){
        System.out.println("Eligible for voting");
      }
      else{
        System.out.println("Not eligible for voting");
      }

      // Grade analyzer
      System.out.print("Enter your marks : ");
      int marks = sc.nextInt();

      if(marks >= 90){
        System.out.println("Grade A");
      }
      else if(marks >= 70){
        System.out.println("Grade B");
      }
      else if(marks >= 60){
        System.out.println("Grade C");
      }
      else if(marks >= 50){
        System.out.println("Grade D");
      }
      else if(marks >= 33){
        System.out.println("Grade E");
      }
      else{
        System.out.println("Fail");
      }
      sc.close();
    }
    
}
