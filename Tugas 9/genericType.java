/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Kamis, 07 Mei 2020
Waktu   : 13.30 WITA
*/
package tugas9;

public class genericType<T> {
    private T nama;
    
    public genericType(T nama){
        this.nama = nama;
    }
    
    public T getNama(){
        return nama;
    }
    
    public void setNama(T nama){
        this.nama = nama;
    }
}
