package entities;

public class rectangle {
	
	public String resultado;
	public double width;
	public double height;
	public double area;
	public double perimetro;
	public double diagonal;
	
	public double area(){
		
		return area = width * height;
		
	}
		
		public double perimetro(){
	        return 2 * (width + height);
				
	}
	
	
		public double diagonal() {
			return Math.sqrt(width * width + height * height);
	}


	}	

