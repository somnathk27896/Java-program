package palandrom;
import java.util.Scanner;
public class Palandrom {
    public static void main(String[] args) 
    {
        
        
        int rem;
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int temp = no;
        while(temp>0)
        {
            rem = temp % 10;
            temp = temp/10;
            rev = rev*10+rem;
        }
        System.out.println(rev+"\n");
        if(no==rev)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
               System.out.println("Number is not Palindrome"); 
        }
    }
    
}
