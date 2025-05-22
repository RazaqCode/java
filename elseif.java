import java.util.*;
public class elseif{
    public static void main (String[]args){
       Scanner sc  = new Scanner (System.in);
       //int a = sc.nextInt(); 
        System.out.println("enter a number :"); 
       char operator = sc.next().charAt(0);

       switch (operator){
        case '1' :System.out.println("mon");
        break;

        case '2' :System.out.println("tue");
        break;

        case '3' :System.out.println("wed");
        break;

        case '4' :System.out.println("thu");
        break;

        default:System.out.println("good day");
       }


    }
} 