import java.util.*;
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1 - print every cahracter
        System.out.print("Enter a string : ");
        String string = sc.next();
        for(int i = 0; i < string.length(); i++){
            System.out.println(string.charAt(i));
        }

        // Question 2 - count characters
        System.out.print("Enter a string : ");
        String name = sc.next();
        int count = 0;
        for(int i = 0; i < name.length(); i++){
            count+=1;
        }
        System.out.println("there are "+count+" characters in string ");

        // Question 3 - count vowels 
        System.out.print("Enter a string : ");
        String s = sc.next();
        int count_vowel = 0; 
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count_vowel += 1;
            }
        }
        System.out.println("vowel count : "+ count_vowel);
       

        // Question 4 - count cosonants
        System.out.print("Enter a string : ");
        String s1 = sc.next();
        int count_consonants = 0;
        for(int i = 0; i < s1.length(); i++){
            char chr = s1.charAt(i);
            if(Character.isLetter(chr) && !(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u')){
                count_consonants+=1;

            }
        }
        System.out.println("consonants count : "+count_consonants);

        // Question 5 - count spaces
        System.out.print("Enter the String : ");
        sc.nextLine();
        String s2 = sc.nextLine();
        int count_spaces = 0;
        for(int i = 0; i < s2.length(); i++){
            if(s2.charAt(i) == ' '){
                count_spaces+=1;
            }
        }
        System.out.println("spaces count : "+count_spaces);

        String str = "rana";
        str = "bana";
        System.out.println(str);

        
        sc.close();
       
        
    }
}
