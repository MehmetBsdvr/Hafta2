/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Klavyeden girilen ögrençi ait vize ve final notlarının ortalama sına göre ekrana 
Geçti-Kaldı olgoritmasını ekrana yazdıran program 
NOT:VİZE %40 FİNALİNDE %60 GEÇME NOTU 45 DİR
1)Adım:Basla 
2)Adım:Vize=x
3)Adım:x=x*0.4
4)Adım:Final=y
5)Adım:y=y*0.6
6)Adım:ort=(x+y)/2
7)Adım:Eğer ort=>45 ise adıma git;
8)Adım:Dersden Kaldınız
9)Adım:Dersden Geçdiniz
10)Adım:Ekarana yazdır
11)Adım:Bitir
*/

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class DERS6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Lütfen vize Notu Giriniz");
        int v =input.nextInt();

        System.out.println("Lütfen final Notu Giriniz");
        int f =input.nextInt();
        
        int ort=(v%40+f%60);
        
        if(f>=45){
            System.out.println("Geçti: ");
        }
        else if(v<45){
            System.out.println("Kaldı: ");
        }
        System.out.println("Ortalama: "+ort);
        
        
        
    
    }}
