/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Klavyeden girilen iki sayı toplamını yazdıran program yazınız
1)Adım:Basla
2)Adım:sayı1
3)Adım:sayı2
4)Adım:Eğer (sayı1+sayı2)
5)Adım:toplamı yazdır
6)Adım:Bitir
*/

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class DERS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sayı bir giriniz");
        int sayı1=input.nextInt();
        
        System.out.println("Sayı iki giriniz");
        int sayı2=input.nextInt();
        
        int toplam=sayı1+sayı2;
                System.out.println("Sayıların toplamı: "+toplam);
    }
    
}
