package has;

public class tv extends device{

	String name;
	int chno;
	int volume;
	device d;
public tv(String s, int i, int j,device d) {
		// TODO Auto-generated constructor stub
	this.name=s;
	this.chno=i;
	this.volume=j;
	this.d=d;
	
}

public void chplus()
{
	this.chno++;
	
}

public void chminus()
{
	this.chno--;
	
}


public void volplus()
{
	this.volume++;
	
}

public void volminus()
{
	this.volume--;
	
}
}
