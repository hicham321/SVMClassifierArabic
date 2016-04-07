import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.apache.commons.lang.UnhandledException;

import com.sun.webkit.ContextMenu.ShowContext;


 
//cette classe relie les donnée de l'interface et la classe Racnisation

public class Handler {
	
	
	Racinisation racinisation= new Racinisation();
	
	InterfaceRacinisaion interfaceRacin = new InterfaceRacinisaion();
	
	private ArrayList<String> MotRacin;
	
	private ArrayList<String> MotRacinTemp;
	
	private ArrayList<String> MotNonRacin;

	private int compteur ;
	
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
				if(interfaceRacin.getTextRacin().isEmpty()){
				   JOptionPane.showMessageDialog(null, "entreé un Racin pour continue");
				}else{
					String Racin =interfaceRacin.getTextRacin(); 
					
				    //inserer dans la base
				    racinisation.Ins(interfaceRacin.getTextMot());
				    racinisation.insRacin(Racin);
				
				    //inserer dans la liste
				    MotRacin.add(Racin);
				
				    interfaceRacin.getTextMott().setText(MotNonRacin.get(compteur+1));
				    interfaceRacin.getTextRacint().setText("");
				
				    compteur= compteur+1;
				    //ajoutgi un autre mot (faire un recherche sur les mot retant)
					
				}		
					
				
			}
			
			if(e.getSource()== interfaceRacin.getOkButton()){
				interfaceRacin.dispose();
				
			}
			if(e.getSource()==interfaceRacin.getAnnuleButton()){
				interfaceRacin.dispose();

			}
			if(e.getSource()== interfaceRacin.getLanceRacinButton()){
				try{
					racinisation.connectio("jdbc:ucanaccess://E:/Database71.accdb");
					interfaceRacin.getLanceRacinButton().setEnabled(false);
					ArrayList<String> list =racinisation.LanceRacin();
					
						
						for (int i = 0; i < list.size(); i++) {
							String Mot=racinisation.rech(list.get(i));
							if( Mot !="Null"){
								MotRacin.add(Mot);
							
						    }else{
						    	
						    	MotNonRacin.add(list.get(i));	
						    }
						
						}
						if(MotNonRacin.isEmpty()){
							JOptionPane.showMessageDialog(null, " La Racinisation est terminé");
						}
						else{
							compteur=0;
						interfaceRacin.getTextMott().setText(MotNonRacin.get(compteur));
						}
						
						
								
							}
							
							
						
					
					
					
					//la methode de racinisation 
					//iteration sur les mots non vides
				catch(Exception t){
					t.printStackTrace();
				}
		}
				} 
				
				
				
			}
			
		}
	
	
	


