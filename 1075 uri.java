// 1075 uri
package basicjava;

import java.util.Scanner;

public class myFirstProgram {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        for(int i=2; i<10000; i=i+n){
            System.out.println(i);
        }
    }
    
}
