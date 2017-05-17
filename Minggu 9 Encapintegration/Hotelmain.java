/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel2;

/**
 *
 * @author Iscariot
 */
import java.util.Scanner;
public class Hotelmain {
    public static void main(String args[]){
       String nama;
       String kode;
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Masukan nama :");
       nama = input.next();
       
       System.out.println("Masukan Kode :");
       kode = input.next();
       
       Hotel2 hotel = new Tamu();
       hotel.setNama(nama);
       System.out.println(hotel.getNama());
       hotel.setKode(kode);
       System.out.println(hotel.getKode());
       hotel.Sewa();
       hotel.cekin();
       hotel.cekout();
    
    }
    
}
