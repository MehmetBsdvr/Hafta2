/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
public class DERS7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // DÖNGÜLERLE CÖZÜM
        // Fibonacci
        // 1 1 2 3 5 8 13
        // a b c
        //   a b c
        //     a b c
        int a = 1;
        int b = 1;
        int c ;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<10;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
    }
    
}}
