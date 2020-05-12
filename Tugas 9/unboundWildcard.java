/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Kamis, 07 Mei 2020
Waktu   : 14.27 WITA
*/
package tugas9;

import java.util.Arrays;
import java.util.List;

public class unboundWildcard {
    public static void printList(List<?> list){
        for(Object elem : list){
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        List<Integer> li = Arrays.asList(130,2018,6);
        List<String> ls = Arrays.asList("Paramadina", "Mulya", "Majid");
        printList(li);
        printList(ls);
    }
}
