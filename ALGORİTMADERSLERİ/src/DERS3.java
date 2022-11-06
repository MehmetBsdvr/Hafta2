/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Kenar uzumlukları verilen dikdört genin alanını veren program
1)Adım:Basla
2)Adım:A gir
3)Adım:Eğer A<0 ise 2'adıma dön
4)Adım:B gir
5)Adım:Eğer B<0 ise 4'adıma dön
6)Adım:Alan:A*B
7)Adım:Ekrana yazdır
8)Adım:Bitir
*/

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class DERS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Uzun Kenarı giriniz");
        int A=input.nextInt();
        if(A<0){
            System.out.println("Hesaplanamaz");
        }
        
        
        System.out.println("Kısa Kenarı giriniz");
        int B=input.nextInt();
        if(B<0){
            System.out.println("Hesaplanamaz");
        }
        int alan=A*B;
        System.out.println("Dikdört Genin alanı: "+alan);
    }
    
}
