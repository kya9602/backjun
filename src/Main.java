import java.util.Scanner;
import java.lang.Math;

public class Main {
        public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in);
            int T = stdIn.nextInt();
            int a =0;
            int b =0;
            int com = 0;

            for(int i=0;i<T;i++){
                a = stdIn.nextInt();
                b = stdIn.nextInt();
                int data = 1;

                for(int j=0;j<b;j++){
                    data *= (a%10);
                    data %= 10;
                }

                if(data == 0){
                    System.out.println(10);
                }
                else if(com < 10){
                    System.out.println(data);
                }

            }


        }
    }