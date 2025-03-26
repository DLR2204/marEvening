package intro;

public class VariablesEx3 {

	static String nationality ="American";// static g.v

	int aadhar;//instance g.v
	
	
	
	
	public String display() {
		return ("Nationality:-"+nationality+"\t"+"Aadhar:-"+aadhar);
	}

	public static void main(String[] args) {
		
		System.out.println(nationality);
		
		VariablesEx3 ramesh = new VariablesEx3();
		
		VariablesEx3 naresh = new VariablesEx3();
		
		VariablesEx3 suresh = new VariablesEx3();
		
		ramesh.aadhar = 100;suresh.aadhar=200;naresh.aadhar=300;
		
		ramesh.nationality="Indian";
		
		suresh.nationality="Russian";
		
		System.out.println("Ramesh:- "+ramesh.display());
		
		System.out.println("Surseh:- "+suresh.display());
		
		System.out.println("Naresh:- "+naresh.display());
		
		

	}

}
