import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // loops = used for repetion of specific code block
        // for loop , while loop , do-while loop


        // for loop is used when number of interation is known
        for(int i = 1; i<=5; i++){
            System.out.print(i+" ");
        }



        // while loop is used when number of iteration in not known 
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        sc.close();
    }
    
}
