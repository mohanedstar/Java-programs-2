package InterfacePractice;
public class Data {
	
	
	public static double averge(Measurable []objs) {
		int sum=0;
		if(objs[0].getSize()>0) 
		{
			
		for(int i=0 ; i<objs[0].getSize(); i++) {
			sum+=objs[i].getMeasure();}

		return (sum/objs[0].getSize());
		}
		else 
			return 0;
	
	}
	
	public static Measurable Max(Measurable x , Measurable y ) {
		if(x.getMeasure()>y.getMeasure()) return x;
		else return y;
	}
	
	public static Measurable[] Sort(Measurable[]M) {
		if(M[0].getSize()>0) {
		Measurable tump = M[0];
		for(int i=0; i<M[0].getSize();i++) {
			for(int j=0 ;j<M[0].getSize()-1;j++) {
				if(M[j].getMeasure()>M[j+1].getMeasure()) {
					tump=M[j];
					M[j]=M[j+1];
					M[j+1]=tump;
				}
			}
		}
		return M;
	}
		else return M;
}
}
