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

    public static void main(String args[]) {
        String nama;
        String kode;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nama :");
        nama = input.next();

        System.out.println("Masukan Kode :");
        kode = input.next();

        RoomService<Integer> p = new RoomService<>(123454353);
        int y = p.getNik();
        System.out.println("Tipe yang digunakan Integer : " + y);

        System.out.println("");
        System.out.println("-----------");
        System.out.println("");

        RoomService<String> p2 = new RoomService<>("123455677");
        String z = p2.getNik();
        System.out.println("Tipe yang digunakan String : " + z);

        System.out.println("");
        System.out.println("##########################################");
        System.out.println("");

        /*
         CASE 2
         */
        RoomService p3 = new RoomService<>("213242422");
        String d = (String) p3.getNik();
        System.out.println("HARUS DICASTING : " + d);

    }

}
