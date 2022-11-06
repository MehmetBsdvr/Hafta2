/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Klavyeden girilen iki notun ortalamasını veren program
1)Adım:Basla
2)Adım:not1=x
3)Adım:not2=y
4)Adım:ort=(x+y)/2
5)Adım:Eğer ort<70 ise 7'ci adıma git
6)Adım:ORTALAMANIZ:FF ALDINIZ
7)Adım:ORTALAMANIZ:AA ALDINIZ
8)Bitir
*/

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class DERS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Birinci Notunuzu giriniz");
        int x=input.nextInt();
        
        System.out.println("İkinci Notunuzu giriniz");
        int y=input.nextInt();
        
        int ort=(x+y)/2;
        System.out.println("ORTALAMANIZ: "+ort);
        
        if(x>=70){
            System.out.println("Notunuz: AA ");
        }
        else if(y<70){
            System.out.println("Notunuz: FF");
    }
    
    }}
