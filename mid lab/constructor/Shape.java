 import java.lang.*;

class Shape
{

 double h,l, w;

void setHeight(double height)
{
h=height;
}

void setLength(double length)
{
l=length;
}

void setWidth(double width)
{
w=width;
}

double getHeight()
{
	return h;
}

double getLength()

{
	return l;
}

double getWidth()
{
return w;
}

void areaRec()

{
	
	System.out.println("Rectangle area: "+getLength()*getWidth());
}

void volRec()
{
	
	System.out.println("Rectangle volume: "+getHeight()*getLength()*getWidth());
}


}
void areaSquare()
{	
	System.out.println("Rectangle area: "+getHeight()*getHeight());
}

void volSquare()
{	
	System.out.println("Square volume: "+getHeight()*getLength()*getWidth());
}

}