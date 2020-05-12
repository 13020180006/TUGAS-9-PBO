/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Jumat, 08 Mei 2020
Waktu   : 14.43 WITA
*/
package tugas9;

class anonymousClass {
    int bil = 6;
    void method(){
        System.out.println("bil = "+bil);
    }
}

class belajar{
    public static void main(String[] args){
        anonymousClass obj = new anonymousClass(){
            @Override
            void method(){
                bil++;
                System.out.println("bil = "+bil);
            }
        };
        obj.method();
    }
}
