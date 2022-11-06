/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Klavyeden girilen bir sayının faktöriyelilini hesaplayan program
1) Adım:Basla
2) Adım:Klavyeden bir N sayısı gir
3) Adım:sayaç=1,sonuç=1
4) Adım:sonuç=sayaç*sonuç
5) Adım:s=s+1
6) Adım:Eğer sayaç<=N is 4'adıma dön
7) Adım:Ekrana yazdır
9) Adım:Bitir
*/

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class ÖDEV5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Lütfen sayıyı giriniz");
        int n=input.nextInt();
        
        int sayaç=1;
        int sonuç=1;
         while(sayaç<=n){
             sonuç=sayaç*sonuç;
             sayaç=sayaç+1;
         }
       System.out.println("Faktöriyel: "+sonuç);
    }
    
}
