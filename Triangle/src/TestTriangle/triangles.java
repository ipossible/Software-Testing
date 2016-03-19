package TestTriangle;


public class triangles {

	
	public static String triangleshape(int a,int b, int c){
		
		if(a == b && a == c && b == c){
			return "equilateral";
		}
		else if(a == b || a == c || b == c){
			return "isosceles";
		}
		else{
			return "scalene";
		}
		
		
		}
	
}
