/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Kamis, 07 Mei 2020
Waktu   : 17.23 WITA
*/
package tugas9;

public class stringClass {
    public void kata(){
        String hewan = "Kucing itu sedang tidur";
        int panjang = hewan.length();
        System.out.println("Panjang String dari kalimat diatas adalah : "+panjang+" karakter");
    }
    
    public static void main(String[] args){
        stringClass a = new stringClass();
        System.out.println("Kucing itu sedang tidur");
        a.kata();
    }
}
