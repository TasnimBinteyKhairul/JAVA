class FixedAccount extends Account
{
	private int tenureYear;
	 FixedAccount()
	{
		
		System.out.println("Empty constructor of FixedAccount");
	}
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear=tenureYear;
	}
	
	public int getTenureYear()
	{
		return tenureYear;
	}
}