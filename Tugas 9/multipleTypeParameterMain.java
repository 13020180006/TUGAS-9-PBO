/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Kamis, 07 Mei 2020
Waktu   : 13.50 WITA
*/
package tugas9;

public class multipleTypeParameterMain {
    public static void main(String[] args){
        multipleTypeParameter<String, String> mulType = new multipleTypeParameter<String, String>("Paramadina Mulya Majid","13020180006");
        mulType.cetak();
    }
}
