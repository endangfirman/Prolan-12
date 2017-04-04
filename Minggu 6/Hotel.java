/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

/**
 *
 * @author jawolh
 */
public class Hotel {
        String type, nama;
        // Konstruktor 1
        public Hotel() {
        //tanpa parameter
}
        // Konstruktor 2
        public Hotel(String nama) {
        this.nama = nama ;
}
	public void booking(){
		System.out.println("Sewa Hotel");
	}
	public void Bayar(){
		System.out.println("Bayar Transaksi");
	}
	public void Cekout(){
		System.out.println("Cek out kamar");
	}
}

    
