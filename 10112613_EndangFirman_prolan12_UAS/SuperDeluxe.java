/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author Iscariot
 */
public class SuperDeluxe extends Room{

	public void set(int r,boolean w,boolean s)
	{
		rate=r;
		wifi=w;
		status=s;
	}

	public boolean getStatus()
	{
		return status;
	}
	
	public boolean getWifi()
	{
		return wifi;
	}
	
	

	public int getRate()
	{
		return rate;
	}

        @Override
	public void statuschange() {
		// TODO Auto-generated method stub
		if(status==true)
			status= false;
		else
			status=true;
		
	}
}

