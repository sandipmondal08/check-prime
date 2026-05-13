import java.util.*;
public class checkPrime {
  public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number :");
    int num = sc.nextInt();
    boolean ans = isPrime(num);
    if(ans == true){
      System.out.print("Prime Number");
    }else{
      System.out.print("Not a prime number");
    }
  }
    
}
