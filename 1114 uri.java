//1114 uri 

package basicjava;

import java.util.Scanner;



/**
 *
 * @author Fahim Ahammed Firoz
 */
public class driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass= 2002, givenPass;
        while( (givenPass = input.nextInt()) != pass ){
            System.out.println("Senha Invalida");
        }
        System.out.println("Acesso Permitido");
    }
}
