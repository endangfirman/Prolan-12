/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

/**
 *
 * @author labkom7
 */
public class Hotel {
	public String 	 nama,JenisKelamin;
               byte      umur;
		   
		public static void main (String[] args) {
		Kasir Ksr = new Kasir();
		System.out.println(Ksr.nama);
        Ksr.Booking("Ruang melati");
        Ksr.Booking("Ruang melati"," vaviliun");
	}
        
}
    
