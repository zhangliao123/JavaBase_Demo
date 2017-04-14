package JavaBase_Circle;

import com.sun.corba.se.impl.interceptors.PICurrent;

public class Circle {

	public double myArea = 0;
	//private int myRadius;
	private final double PI = 3.1415926;
	
	public void AreaCal(double d){
		//this.myRadius =myRadius;
		myArea =(double) (PI * d * d);
		
	}
}
