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
public class Kamar extends Hotel2{
    public Kamar(String nama, String kode){
        setNama(nama);
        setKode(kode);
        System.out.println("Nama :" +getNama());
        System.out.println("Kode :" +getKode());
    }
    

    @Override
    public void Sewa() {
         System.out.println("Kamar berhasil di sewa");
    }

    @Override
    public void cekin() {
        System.out.println("cek in berhasil");    
    }

    @Override
    public void cekout() {
        System.out.println("terima kasih");    
    }

    @Override
    public void cancel() {
        System.out.println("pembataln sewa akan dilakukan");    }
    
}
