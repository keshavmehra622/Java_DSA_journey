// Arrays - an arrary is a fixed sized data structure used to store multiple values of the same data type in contiguos locations

public class arrays{
    public static void main(String[] args) {
    //    int marks[] = {75,68,56,89}; 
       
    //    // indexing
    //    System.out.println(marks[1]);
    //    System.out.println(marks[0]);
    //    System.out.println(marks[3]);

    //    // updating elembts in array
    //    marks[1] = 34;
    //    System.out.println(marks[1]);

    //    // length of array 
    //    System.out.println(marks.length);

    //    // traversing array 
    //    int numbers[] = {45,65,98,90,65};
    //    for(int i = 0; i < numbers.length; i++){
    //     System.out.println(numbers[i]);
    //    }

       // finding largest
       int number[] = {32,43,56,43,67};
       int largest = 0;
       for(int i = 0; i < number.length; i++){
        if(number[i] > largest){
            largest = number[i];
        }
       }
       System.out.println(largest);

    }
}