//la classe main 

public class Main {
	public static void main(String[] args) {
		
		Racinisation r = new Racinisation();
		
		InterfaceVectorisation v = new InterfaceVectorisation();
		
		InterfaceRacinisaion inter= new InterfaceRacinisaion();
		
		Handler h = new Handler(r, inter,v);
		
		inter.setVisible(true);
		
	}
	
	
}
