/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel3;

import hotel2.Hotel2;

/**
 *
 * @author Iscariot
 */
public class Tamu extends Hotel2 {
    public Tamu(String nama,String kode){
        setNama(nama);
        setKode(kode);
        
        System.out.println("Nama :" +getNama());
        System.out.println("Kode :" +getKode());
        
    }

    public Tamu() {
    }

    @Override
    public void Sewa() {
        System.out.println("Kamar berhasil di sewa");
    }

    @Override
    public void cekin() {
        System.out.println("Cekin berhasil");
    }

    @Override
    public void cekout() {
        System.out.println("Terima kasih ");
    }

    @Override
    public void cancel() {
        System.out.println("pembatalan sewa akan dilakukan");    }
    
}
