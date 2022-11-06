/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
public class DERS8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DİZGİLERLE CÖZÜM
        // Fibonacci
        int fib []=new int[10];
        fib [0]=1;
        fib [1]=1;
        for(int i=0;i<8;i++){
            fib[i+2]=fib[i+1]+fib[i];
        }
    }
    
}
