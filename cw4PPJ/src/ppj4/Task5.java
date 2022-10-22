package ppj4;


import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("poka liczbe");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x%4==0 && x%100 !=0 || x%400==0){
            System.out.println("jest to rok przestepny");

        }else{

            System.out.println("nie jest to rok przestepny ;)");
        }
    }
}
