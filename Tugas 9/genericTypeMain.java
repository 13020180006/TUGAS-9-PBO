/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Kamis, 07 Mei 2020
Waktu   : 13.36 WITA
*/
package tugas9;

public class genericTypeMain {
    public static void main(String[] args){
        genericType<String> genType = new genericType<>("Dina");
        genType.setNama("Paramadina Mulya Majid");
        System.out.println(genType.getNama());
    }
}
