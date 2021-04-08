//1080 uri


package basicjava;

import java.util.Scanner;

public class myFirstProgram {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int highest=0, position=0, n;
        for(int i=1; i<=100; i++){
            n = input.nextInt();
            if(highest > n){
                highest = highest;
                position = position;
            }
            else{
                highest = n;
                position = i;
            }
        }
        System.out.println(highest+"\n"+position);
        
    }
    
}
