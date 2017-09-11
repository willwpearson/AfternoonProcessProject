package process.model;

public class PlayDohSnake
{
	//Declaration Section
	//Data Member Section
	private int size;
	
	public PlayDohSnake()
	{
		this.size = 5;
		
	}
	public PlayDohSnake(int size)
	{
		this.size = size;
	}
	
	public String toString()
	{
		String description = "I am a snek, my size is " + size;
		return description;
	}
}
