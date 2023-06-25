
public class ShapeOver {
	int result_square_peri,result_rect_peri,result_tri_peri;
	double result_par_peri;
	void perimeter(int square_side)
	{
		result_square_peri=4*square_side;
		System.out.println("Perimeter of Square "+result_square_peri);
	}
	void perimeter(int r_lenght,int r_breadth)
	{
		result_rect_peri=2*(r_lenght+r_breadth);
		System.out.println("Perimeter of Rectangele "+result_rect_peri);
		
	}
	void perimeter(int tri_side1,int tri_side2,int tri_side3)
	{
		result_tri_peri=tri_side1+tri_side2+tri_side3;
		System.out.println("Perimeter of Triangle "+result_tri_peri);
	}
	void perimeter(double par_side1,double par_side2)
	{
		result_par_peri=2*(par_side1+par_side2);;
		System.out.println("Perimeter of Parallelogram "+result_par_peri);
	
	}

	public static void main(String[] args) {
		ShapeOver s1=new ShapeOver();
		s1.perimeter(2);
		s1.perimeter(4,7,3);
		s1.perimeter(4,6);
		s1.perimeter(4.33, 3.33);
		
		
	}

}