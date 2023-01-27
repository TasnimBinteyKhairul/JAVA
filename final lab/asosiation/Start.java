class Start
{
	public static void main(String args[])
	{
		Student s1=new Student("12-77-90","Tasnim");
		Article a1=new Article(1223,"Bangladesh",290);
		s1.setArticle(a1);
		s1.display();
	}
}