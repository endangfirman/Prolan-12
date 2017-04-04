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
public class Tamu extends Hotel {
	//overring method
        @Override
	public void booking(){
		System.out.println("Kamar berhasil di sewa");
                super.booking();
	}
	public void fasilitas(){
		System.out.println("Deluxe,Suit,Club,dan Superior");
	}
        @Override
	public void Cekout(){
		System.out.println("Cek out kamar");
                super.Cekout();
	}
}
