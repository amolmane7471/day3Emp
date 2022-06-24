package javademo2;
import java.lang.Math;
public class LineCompUc3 {
	public static final double x1=2 ,y1=2, x2=4, y2=4;
	
	public static final double q1=1, r1=1 , q2=4 ,r2=4;
	public static void main(String[] args) {

		double length1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		double length2=Math.sqrt((q2-q1)*(q2-q1)+(r2-r1)*(r2-r1));
		System.out.println("length of line1:"+length1);
		System.out.println("length of line2:"+length2);
		if(length1==length2)
			System.out.println("two lines are equal");
		else if (length1>length2)
		System.out.println("Line1 is greater");
		else
			System.out.println("line1 is smaller ");
	}

}