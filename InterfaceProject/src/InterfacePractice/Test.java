package InterfacePractice;

public class Test {

	public static void main(String[] args) {
		Bank[] b=new Bank[10];
		Country[] c=new Country[10];
		
		b[0]=new Bank("Ahmad",1000);
		b[1]=new Bank("muhammad",2000);
		b[2]=new Bank("Alie",3000);
		b[3]=new Bank("Same",43000);
		
		
		
		c[0]= new Country("Gaza",1000);
		c[1]= new Country("yaman",130);
		c[2]= new Country("Egpet",12);
		c[3]= new Country("serya",14);
		
	   System.out.println(Data.averge(c));//We Use the Averge Function ;
	   System.out.println(Data.averge(b));
	   
	   
		Measurable g =Data.Max(c[0],c[1]);//We Use the Max Function ;
		Country cc = (Country)g;// we Make a downcusting for the Measurable ot Country;
		System.out.println(g.getMeasure());
		System.out.println(cc.getName());
		
		
		Data.Sort(c);// We Use the Sort Function ; 
		
		for(int i =0 ; i<c[0].getSize();i++) {
			System.out.println(c[i].toString());// We Use the toSTring Function ;
			}
		
			Data.Sort(b);// We Use The Sort Function ;
			
			for(int i=0 ; i<b[0].getSize();i++) {
				System.out.println(b[i].toString());// We Use the toString Function ;
			}
		
		
	
		

	}

}
