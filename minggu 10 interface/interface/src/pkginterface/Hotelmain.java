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
import java.util.Scanner;
public class Hotelmain {
    public static void main(String args[]){
       String nama;
       String id;
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Masukan nama :");
       nama = input.next();
       
       System.out.println("Masukan id :");
       id = input.next();
       
      Tamu noval = new Tamu();
      noval.Booking();
      noval.takefriendGF();
    }
}
