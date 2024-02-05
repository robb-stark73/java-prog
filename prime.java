import.java.util.Scanner;

public class primeNumber{

public static void main(String[] args){
scanner sc=new Scanner(System.in);
int number;

System.out.println("enter a number:");
number=sc.nextInt();
if(isPrime(number)){
System.out.println(number+ "is prime");
}
else{
System.out.println(number+ "is not prime");
}
}

public static boolean isPrime(int num){

if(num<=1){
return false;
}
for (int i=2;i<=num/2;i++){

if((num%i)==0)
return false
}
return true;
}
}






