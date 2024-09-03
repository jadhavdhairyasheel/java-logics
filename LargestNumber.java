
import java.util.Scanner;

public interface LargestNumber {
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);

System.out.println("enter a number ");
int a = sc.nextInt();

System.out.println("enter a number ");
int b = sc.nextInt();

System.out.println("enter a number ");
int c= sc.nextInt();

if(a>b && a>c){
    System.out.println("A is the largest number"+a);
}

else if (b>a &&b>c){
    System.out.println("b is the largest number"+b);

}
else{
    System.out.println("c is the largest number"+c);

}

    }
}
