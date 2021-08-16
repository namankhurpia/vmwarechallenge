package processors;

public class calculate {
	
	//global
	final  float PI = 3.14f;
	
	public String calculateforSqaure(int side)
	{
		if(side==0)
		{
			return "side is 0";
		}
		else
		{
			return (side*side)+"";
		}
	}
	
	public String calculateforCircle(int rad)
	{
		if(rad==0)
		{
			return "radius is 0";
		}
		else
		{
			double areaOfCircle = PI * Math.pow(rad,2);
			return areaOfCircle+"";
			
		}
	}
	
	public String reectangle(int len,int wid)
	{
		if(len==0 || wid ==0)
		{
			return "len or wid is 0";
		}
		else
		{
			return (len*wid)+"";
		}
	}
	
	

}
