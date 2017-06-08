package has;

public class tv extends device{

	String name;
	int chno;
	int volume;

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
