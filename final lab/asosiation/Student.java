class Student
{
	private String id;
	private String name;
	Article article;
	
	Student()
	{
		System.out.println("inside the class");
	}
	Student(String id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setArticle(Article article)
	{
		this.article=article;
	}
	public String getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Article getArticle()
	{
		return article;
	}
	void display()
	{
		System.out.println("ID="+id);
		System.out.println("NAME="+name);
		article.display();
	}
}