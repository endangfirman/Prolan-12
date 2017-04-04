/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Iscariot
 */
public class MainKamar {
	public static void main(String [] args) 
        {
		Hotel type = new Hotel();
		Kamar kamarTwin = new Kamar();
		type.booking();
		kamarTwin.booking();
	}
}