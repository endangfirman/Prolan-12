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
public abstract class Hotel2 {
    private String nama;
    private String kode;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
    /*
    method abstrack
    */
    
    public abstract void Sewa();
    public abstract void cekin();
    public abstract void cekout();
    public abstract void  cancel();
    
    }