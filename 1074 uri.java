// 1074 uri (Fahim)

package basicjava;

import java.util.Scanner;

public class myFirstProgram {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int A[] = new int[10000];
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            A[i]=input.nextInt();
        }
        for(int i=0; i<n; i++){
            if(A[i]==0){
                System.out.println("NULL");
            }
            else if(A[i]%2==0){
                if(A[i]>0){
                    System.out.println("EVEN POSITIVE");
                }else{
                    System.out.println("EVEN NEGATIVE");
                } 
            }
            else{
                if(A[i]>0){
                    System.out.println("ODD POSITIVE");
                }else{
                    System.out.println("ODD NEGATIVE");
                } 
            }
            
        }
    }
    
}
