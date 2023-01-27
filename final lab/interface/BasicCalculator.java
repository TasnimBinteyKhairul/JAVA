 class BasicCalculator implements Calculation
{
double val1,val2;
BasicCalculator()
	{System.out.println("Inside Basic Calculator. ");}
	
BasicCalculator(double val1,double val2)
	{this.val1 = val1;this.val2=val2;}
	
public void setval1(double val1)
	{this.val1 = val1;}
	
public void setval2(double val2)
	{this.val2=val2;}
	
public double getval1()
	{return val1;}
	
public double getval2()
	{return val2;}
	
public double addition()
	{System.out.println("Addition = "+(getval1()+getval2()));
	return getval1()+getval2();}
	
public double Subtract()
	{System.out.println("Subtraction = "+(getval1()-getval2()));
	return getval1()-getval2();}
	
public double multiplication()
	{System.out.println("multiplication = "+(getval1()*getval2()));
	return getval1()*getval2();}
	
public double division()
	{System.out.println("division = "+(getval1()/getval2()));
	return getval1()/getval2();}
}