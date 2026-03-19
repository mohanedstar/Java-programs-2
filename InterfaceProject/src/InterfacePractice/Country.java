package InterfacePractice;

public class Country implements Measurable {

	private String name ;
	private double area;
	private static int size;
	
	
	public Country(String name,double area) {
		this.name=name;
		this.area=area;
		size++;
	}
	public Country() {
		this("non",000);
		size++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public double getMeasure() {
		return getArea();
	}
	@Override
	public  int getSize() {
		
		return size;
	}
	public String toString() {
		String s ;
		s=("The Name Of The Country " +this.getName()+" The Area is "+this.getArea());
		return s;
	}
	
	

}
