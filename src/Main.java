//la classe main 

public class Main {
	public static void main(String[] args) {
		
		Racinisation r = new Racinisation();
		
		InterfaceRacinisaion inter= new InterfaceRacinisaion();
		
		Handler h = new Handler(r, inter);
		
		inter.setVisible(true);
		
	}
	
	
}
