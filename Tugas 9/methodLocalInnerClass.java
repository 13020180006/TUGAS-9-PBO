/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Jumat, 08 Mei 2020
Waktu   : 14.13 WITA
*/
package tugas9;

public class methodLocalInnerClass {
    void a(){
        class methodLocalIC{
            int bil = 6;
            void tampil(){
                System.out.println("bil = "+bil);
                bil*=2;
                System.out.println("Hasil Perkalian = "+bil);
            }
        }
        methodLocalIC objek = new methodLocalIC();
        objek.tampil();
    }
    public static void main(String[] args){
        methodLocalInnerClass obj = new methodLocalInnerClass();
        obj.a();
    }
}

