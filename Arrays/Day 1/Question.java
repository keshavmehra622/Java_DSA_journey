public class Question {
    public static void main(String[] args) {
        
        // Question 1 - print all elements of an array
        int numbers[] = {34,65,302,56,8};
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
        // Question 2 - find sum of all elements
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum+=numbers[i];
        }
        System.out.println("Sum of all element is "+sum);

        // Question 3 - find average 
        int average = sum/numbers.length;
        System.out.println("the average of all element is "+average);

        // Question 4 - find largest 
        int largest = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest ){
                largest = numbers[i];
            }
        }
        System.out.println("the largest element is "+largest);

        // Question 5 - find the smallest
        int smallest = 0;
        for(int i = 0; i < numbers.length; i++){
            smallest = numbers[i];
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }System.out.println("the smallest element is "+smallest);

        // Question 6 - count even number
        int evenCount = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                evenCount+=1;
            }
        }System.out.println("there are "+evenCount+" even number");

        // Question 7 - count odd numbers
        int oddCount = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0){
                oddCount+=1;
            }
        }System.out.println("there are "+oddCount+" odd numbers");

        // Question 8 - search the target number
        int arr[] = {10,20,30,40,50};
        int target = 30;
        for(int i = 0; i < numbers.length; i++){
            if(arr[i] == target){
                System.out.println("the target element is found at index "+i);
            }
        }
    }
}
