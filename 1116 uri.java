//1116 uri

package basicjava;

import java.util.Scanner;



/**
 *
 * @author Fahim Ahammed Firoz
 */
public class driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, x, y, i;
        float result;
        N = input.nextInt();
        for(i=1; i<=N; i++){
            x = input.nextInt();
            y = input.nextInt();
            if(y == 0){
                System.out.println("divisao impossivel");
            }else{
                result = (float) x/y;
                System.out.printf("%.1f\n",result);
            }
        }
    }
}
