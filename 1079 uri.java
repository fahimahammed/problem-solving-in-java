//1079 uri
package basicjava;

import java.util.Scanner;

public class myFirstProgram {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        double a, b, c, avg;
        for(int i=0; i<n; i++){
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();
            
            avg = ((a*2)+(b*3)+(c*5))/10;
            System.out.printf("%.1f\n",avg);
            
        }
    }
    
}
