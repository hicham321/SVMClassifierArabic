import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import org.apache.commons.lang.UnhandledException;

//cette classe relie les donnée de l'interface et la classe Racnisation

public class Handler {
	
	
	Racinisation racinisation= new Racinisation();
	
	InterfaceRacinisaion interfaceRacin = new InterfaceRacinisaion();
	
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
				
				racinisation.Ins(interfaceRacin.getTextMot());
				racinisation.insRacin(interfaceRacin.getTextRacin());
				
				interfaceRacin.getTextMott().setText("");
				interfaceRacin.getTextRacint().setText("");
				
				//ajout un autre mot (faire un recherche sur les mot retant)
				
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
	
	


