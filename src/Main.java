//la classe main 

public class Main {
	
	public static void main(String[] args) {
		
		Racinisation r = new Racinisation();
		
		vectorisation v = new vectorisation();
		
		InterfaceVectorisation intervct = new InterfaceVectorisation();
		
		InterfaceRacinisaion inter= new InterfaceRacinisaion();
		
		Handler h = new Handler(r,v, inter,intervct);
		
		inter.setVisible(true);
		
	}
	
	
}
