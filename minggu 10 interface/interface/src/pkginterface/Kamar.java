/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Iscariot
 */
public class Kamar implements Hotel {

    @Override
    public void Nama(String nama) {
        System.out.println("tamu");   
    }

    @Override
    public void Id(String id) {
        System.out.println("id");   
    }

    @Override
    public void Booking() {
        System.out.println("booking"); 
    }

    @Override
    public void Ceckin() {
        System.out.println("ceckin");  
    }

    @Override
    public void ceckout() {
        System.out.println("ceckout");   
    }
    
}
