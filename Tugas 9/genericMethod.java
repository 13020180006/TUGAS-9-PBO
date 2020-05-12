/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Kamis, 07 Mei 2020
Waktu   : 14.01 WITA
*/
package tugas9;

public class genericMethod<T> {
    public static <T> void buat(T[] list){
        for(int i=0; i<5; i++){
            System.out.println(list[i]);
        }
    }
}
