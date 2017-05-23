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
public class Tamu implements Hotel,Lovehotel{

    @Override
    public void Nama(String nama) {
        System.out.println("nama");   
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

    @Override
    public void takefriendGF() {
        System.out.println("you da real MVP");    
    }

}
