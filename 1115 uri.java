//1115 uri

package basicjava;

import java.util.Scanner;



/**
 *
 * @author Fahim Ahammed Firoz
 */
public class driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        while( (x = input.nextInt()) != 0 && (y=input.nextInt()) != 0 ){
            if(x>0 && y>0){
                System.out.println("primeiro");
            }
            else if(x>0 && y<0){
                System.out.println("quarto");
            }else if(x<0 && y<0){
                System.out.println("terceiro");
            }else if(x<0 && y>0){
                System.out.println("segundo");
            }
        }
    }
}
