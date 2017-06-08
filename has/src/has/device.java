package has;

import java.util.ArrayList;

public class device {

int id;
String Power;
//private ArrayList <button> buttonindevice = new ArrayList<button>();
public device()
{
	
	
}



public device(int id2, String s) {
	this.id=id2;
	this.Power=s;
	
	// TODO Auto-generated constructor stub
}
public void poweron()
{
	this.Power="ON";
	
}

public void poweroff()
{
	this.Power="OFF";
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPower() {
	return Power;
}

public void setPower(String power) {
	Power = power;
}



	
}
