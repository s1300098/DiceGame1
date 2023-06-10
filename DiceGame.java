import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    DiceGame(){}
    public static void main(String[] args) {
        int i=1,sum=0,n;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        System.out.print("> ");
String name = sc.next();
System.out.println("Hello, "+name);
        System.out.println("Dice rolling...");
while(i<3){
    n = r.nextInt(5)+1;
    System.out.println("Die "+i+": "+n);
    i++;
    sum+=n;
}
System.out.println("Total value: "+sum);
    }
}
