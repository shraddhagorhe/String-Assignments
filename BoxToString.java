package profound.string;

public class BoxToString {

		double width;
		double height;
		double depth;
				
		BoxToString(double w ,double h ,double d)
	{
		 width = w ;
		 height = h ;
		 depth = d;
	}

	public String toString()
	{
		return "Dimentions are " + width + " by " + depth + " by " +  height + ".";
	}
}

class toStringDemo{
	
	public static void main(String[] args) {
		
		BoxToString b= new BoxToString(10,15,20);
		String s = "BoxToString b :" + b ;
		
		System.out.println(b);
		System.out.println(s);

	}
}