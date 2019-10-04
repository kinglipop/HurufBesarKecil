/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan27.hurufbesarkecil;
import java.util.*;
/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program untuk mengganti kalimat ke ukuran besar dan kecil
 */
public class PBO11K10118904Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine(); 
        String str1 = str.toUpperCase();
        String str2 = str.toLowerCase();
        
        System.out.println("====== Hasil Formating ======");
        System.out.println("Hasil Huruf Besar : " + str1);
        System.out.println("Hasil Huruf Kecil : " + str2);
    }
    
}
