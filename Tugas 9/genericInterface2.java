/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Kamis, 07 Mei 2020
Waktu   : 15.34 WITA
*/
package tugas9;


public class genericInterface2 implements genericInterface<String>{
   String in1;
   int in2;
    
   public genericInterface2(String in1, int in2){
       this.in1 = in1;
       this.in2 = in2;
   }
   
    @Override
   public String execute(){
       return String.format("%s%d", in1,in2);
   }
    
}
