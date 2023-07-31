import java.util.*;
public class loops {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            if (i%2==0){
                System.out.println(i);
            }

        } 
///////////////////////////////////////////////////////input driven program from user

      Scanner sc = new Scanner(System.in);
      int input;
      do {
        int marks= sc.nextInt();
        if (marks >= 90 && marks <=100){
            System.out.println("This is Good");
        }else if(marks >=60 && marks <= 89){
            System.out.println("This is also good");
        }else if(marks >=0 && marks <=59){
            System.out.println("This is also good as well");
        }else{
            System.out.println("Invalid number");
        } 
        System.out.println("want to continue (yes(1) or (no(0)");
        input = sc.nextInt();
      }  while (input==1);
      ///////////////////////////////////////////////////////////////
      //NUMBER IS PRIME OR NOT ////
      //////////////////////////////
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      boolean isPrime = true;
      for( int i = 2; i<=n/2; i++){
        if(n % i == 0) {
            isPrime = false;
            break;
        }
    }

    if(isPrime) {
        if(n == 1) {
            System.out.println("This is neither prime not composite");
        } else  {
            System.out.println("This is a prime number");
        }
    }else{
        System.out.println("This is not a prime number");
    }
    }
}






