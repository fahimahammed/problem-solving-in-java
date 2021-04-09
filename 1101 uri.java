

package basicjava;
//1101 uri
import java.util.Scanner;



/**
 *
 * @author Fahim Ahammed Firoz
 */
public class driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X, Y, sum=0;
        while(((X = input.nextInt())>0) && ((Y = input.nextInt()))>0){
            if(X<Y){
                for(X=X; X<=Y; X++){
                    sum += X;
                    System.out.print(X+" ");
                }
            }else{
                for(Y=Y; Y<=X; Y++){
                    sum += Y;
                    System.out.print(Y+" ");
                }
            }
            System.out.println("Sum="+sum);
            sum = 0;
        }
    }
}
