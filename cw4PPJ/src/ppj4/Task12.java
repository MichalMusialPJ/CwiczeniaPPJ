package ppj4;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if(x>0&&y>0){
            System.out.println(x-y);

        } else if (x<0&&y<0) {
            System.out.println(x+y);
        }else{
            System.out.println("teog nie mialem robic xd");
        }

    }
}
