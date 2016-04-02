import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.apache.commons.lang.UnhandledException;


 
//cette classe relie les donnée de l'interface et la classe Racnisation

public class Handler {
	
	
	Racinisation racinisation= new Racinisation();
	
	InterfaceRacinisaion interfaceRacin = new InterfaceRacinisaion();
	
	private ArrayList<String> MotRacin;

	
	public Handler(Racinisation racinisation , InterfaceRacinisaion interfaceRacin){
		
		this.racinisation= racinisation;
		
		this.interfaceRacin= interfaceRacin;
		
	    this.interfaceRacin.RacinInterfAddActionListener(new listnerPourInterface());
	}
	
	class listnerPourInterface implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)  {
			
			//l'action du boutton ajoubutton 
			if (e.getSource()==interfaceRacin.getAjoutRacinButton()) {
				
				String Racin =interfaceRacin.getTextRacin(); 
				
				//inserer dans la base
				racinisation.Ins(interfaceRacin.getTextMot());
				racinisation.insRacin(Racin);
				
				//inserer dans la liste
				MotRacin.add(Racin);
				
				interfaceRacin.getTextMott().setText("");
				interfaceRacin.getTextRacint().setText("");
				
				//ajoutgi un autre mot (faire un recherche sur les mot retant)
				
			}
			
			if(e.getSource()== interfaceRacin.getOkButton()){
				interfaceRacin.dispose();
				
			}
			if(e.getSource()==interfaceRacin.getAnnuleButton()){
				interfaceRacin.dispose();

			}
			if(e.getSource()== interfaceRacin.getLanceRacinButton()){
					interfaceRacin.getLanceRacinButton().setEnabled(false);
					
					
					
					//la methode de racinisation 

				
					
				} 
				
				
				
			}
			
		}
	}
	
	


