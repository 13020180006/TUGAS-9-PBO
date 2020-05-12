/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Kamis, 07 Mei 2020
Waktu   : 14.27 WITA
*/
package tugas9;

import java.util.ArrayList;
import java.util.List;

public class boundWildcard {
    public static double sum(List<? extends Number> list){
	double sum = 0;
	for(Number n : list){
            sum += n.doubleValue();
	}
    	return sum;
    }
    
    public static void main(String[] args) {
	List<Integer> a = new ArrayList<>();
	a.add(130); 
        a.add(2018); 
        a.add(6);
	double sum = sum(a);
	System.out.println("Hasil Jumlah = "+sum);
    }

    
}
