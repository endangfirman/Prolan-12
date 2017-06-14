/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel3;

/**
 *
 * @author Iscariot
 */
class RoomService<T>{
    private T nik;

    public RoomService(T nik) {

        this.nik = nik;

    }

    public void setNik(T nik) {
        this.nik = nik;
    }

    public T getNik() {
        return nik;
    }

    public void getType() {
        System.out.println("Tipe awalnya " + nik.getClass().getName());
    }
}