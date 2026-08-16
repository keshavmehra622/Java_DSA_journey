public class stringBasics {
    public static void main(String[] args) {
        
        // string -  sequence of character , numbers and symbolsused to represent text . Strings are immutable

        String name = "keshav";

        // String accessing
        System.out.println(name.charAt(0));

        // string length
        System.out.println(name.length());

        // string traversal
        String word = "Android";
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }

        // string comparison
        if(name.equals(word)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        // String methods
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.substring(0,3));
        System.out.println(name.contains("av"));



    }
}
