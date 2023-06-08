import java.util.Scanner;

public class ReverseString {
    static String rev = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number here: ");
       /* String name =sc.next();
//String name ="kvki";
//String rev="";
int length=name.length();
for(int i=length-1;i>=0;i--){
rev=rev+name.charAt(i);
}
        System.out.println(rev);
if(rev.equals(name)){
    System.out.println("given String is  palindrome");
}else System.out.println("not a palindrome");
    }*/
       // int number = sc.nextInt();
     //   int length = number.length();
      //  for(int i=)
        int number = 12345; // The number to be reversed

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
    }
