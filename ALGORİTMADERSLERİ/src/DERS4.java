/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Klavyeden girilen bir sayının pozitifmi negatifmi veya sıfırmı yazdıran program yazınız
1)Adım:Basla
2)Adım:Klavyeden bir n sayısı gir
3)Adım:Eğer n>0 ise adıma git
4)Adım:Eğer n<0 ise adıma git
5)Adım:Eğer n=0 ise adıma git
6)Adım:Pozitif yazdır 
7)Adım:Negatif yazdır
8)Adım:Sıfır yazdır
9)Adım:Ekrana yazdır
10)Adım:Bitir
*/

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class DERS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Lütfen sayıyı giriniz");
        int n=input.nextInt();
        
        
        if(n>0){
            System.out.println(" Pozitif ");
        
        }    
        else if(n<0){
            System.out.println(" Negatif ");
        }
        else if(n==0){
            System.out.println(" Sıfır "); 
        }
    
    }  
}
