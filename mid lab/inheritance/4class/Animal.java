 class Animal
{
	private String Type;
	Animal()
	{
		System.out.println("Object Created for employee .");
	}
	Animal(String t)
	{
		Type=t;
	}
	public void setType(String t)
	{
		Type=t;
	}
	public String getType()
	{
		return Type;
	}
}