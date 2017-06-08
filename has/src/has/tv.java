package has;

public class tv extends device{

	String name;
	int chno;
	int volume;

public tv(String s, int i, int j) {
		// TODO Auto-generated constructor stub
	this.name=s;
	this.chno=i;
	this.volume=j;
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
