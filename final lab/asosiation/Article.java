class Article
{
	private long Articlenumber;
	private String Articlename;
	private double salesprice;
	
	Article()
	{
		System.out.println("inside the class");
	}
	Article(long Articlenumber,String Articlename,double salesprice)
	{
	    this.Articlenumber=Articlenumber;
		this.Articlename=Articlename;
		this.salesprice=salesprice;
	}
	public void setNumber(long Articlenumber)
	{
		this.Articlenumber=Articlenumber;
	}
	public void setName(String Articlename)
	{
		this.Articlename=Articlename;
	}
	public void setSalesprice(double salesprice)
	{
		this.salesprice=salesprice;
	}
	public long getNumber()
	{
		return Articlenumber;
	}
	public String getName()
	{
		return Articlename;
	}
	public double getSalaryprice()
	{
		return salesprice;
	}
	void display()
	{
		System.out.println("Ariticle number="+Articlenumber);
	    System.out.println("Ariticle name="+Articlename);
		System.out.println("Salary price="+salesprice);
	}
}