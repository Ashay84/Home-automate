package has;

public class ac extends device {
	
	protected String name;
	protected int temp;
	
	public void increasetemp()
	{
		this.temp=temp++;
		
	}
	
	public void decreasetemp()
	{
		this.temp=temp--;
		
	}
}
