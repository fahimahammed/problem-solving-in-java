//1099 uri

package basicjava;

import java.util.Scanner;



/**
 *
 * @author Fahim Ahammed Firoz
 */
public class driver {
    public static void main(String[] args) {
        int N, X, Y, total_odd = 0, i, j, k;
        Scanner input= new Scanner(System.in);
        N = input.nextInt();
        for(j=1; j<=N; j++){
            X = input.nextInt();
            Y = input.nextInt();
            if(X<Y){
                for(i=X+1; i<=Y-1; i++){
                    if(i%2 != 0){
                        total_odd +=i;
                    }
                }
            }
            else{
                for(k=Y+1; k<=X-1; k++){
                    if(k%2 != 0){
                        total_odd +=k;
                    }
                }
            }
            System.out.println(total_odd);
            total_odd = 0;
        }
    }
}
