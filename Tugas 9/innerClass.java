/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Kamis, 07 Mei 2020
Waktu   : 17.50 WITA
*/
package tugas9;


public class innerClass {
    public class innerClass2{
        void belajar() { 
            String a = "Inner Class";
            System.out.println("Saya sedang belajar "+a); 
        }
    }
    public static void main(String[] args){
        innerClass inner = new innerClass();
        innerClass.innerClass2 inner2 = inner.new innerClass2();
        inner2.belajar();
    }
}
