/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Kamis, 07 Mei 2020
Waktu   : 13.45 WITA
*/
package tugas9;

public class multipleTypeParameter<T, D>{
    T nama;
    D stb;

multipleTypeParameter(T nama, D stb){
    this.nama = nama;
    this.stb = stb;
}
public void cetak(){
    System.out.println(nama);
    System.out.println(stb);
}
}
