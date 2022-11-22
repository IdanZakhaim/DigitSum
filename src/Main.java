import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scanner.nextInt();
        int sum=0;
        while (num>=10){
            sum = (num%10)+sum;
            num=num/10;
            if (num<10){
                sum=sum+num;
                System.out.println(sum);
            }
        }
        }
    }