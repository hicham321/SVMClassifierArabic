import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.*;

import javax.swing.JOptionPane;




 
//cette classe relie les donnée de l'interface et la classe Racnisation

public class Handler {
	
	
	Racinisation racinisation= new Racinisation();
	
	InterfaceRacinisaion interfaceRacin = new InterfaceRacinisaion();
	
	private ArrayList<String> MotRacin= new ArrayList<String>();
	
	private ArrayList<String> MotRacinTemp=new ArrayList<String>();
	
	private ArrayList<String> MotNonRacin= new ArrayList<String>();
	
	private File file  ;

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
				}
				
				else{
					
				    if(compteur==MotNonRacin.size()-1){
						   JOptionPane.showMessageDialog(null, "La racinisagtion est terminé");
						   String Racin =interfaceRacin.getTextRacin(); 
						   String Mot = interfaceRacin.getTextMot();

						   System.out.println(MotNonRacin.get(compteur));
						   racinisation.InsT(Mot, Racin);
						   interfaceRacin.getTextMott().setText("");
						   interfaceRacin.getTextRacint().setText("");
						    
				    }else{
						   System.out.println(MotNonRacin.get(compteur));

						   String Racin =interfaceRacin.getTextRacin(); 
						   String Mot = interfaceRacin.getTextMot();
						   System.out.println(MotNonRacin.get(compteur));

						   //inserer dans la base
						   /*racinisation.Ins(interfaceRacin.getTextMot());
						   racinisation.insRacin(Racin);*/
							
						   racinisation.InsT(Mot, Racin);
						
						   //inserer dans la liste
						   MotRacin.add(Racin);
						
						   interfaceRacin.getTextMott().setText(MotNonRacin.get(compteur+1));
						   interfaceRacin.getTextRacint().setText("");
				
				           compteur= compteur+1;
				         }
				           //ajoutgi un autre mot (faire un recherche sur les mot retant)
					
				   }		
				 	
				
			}
			
			if(e.getSource()== interfaceRacin.getOkButton()){
				interfaceRacin.dispose();
				
			}
			if(e.getSource()==interfaceRacin.getAnnuleButton()){
				interfaceRacin.dispose();

			}
			
			// L'action du bouton Lancé Racinisation 
			if(e.getSource()== interfaceRacin.getLanceRacinButton()){
				try{
					racinisation.connectio("jdbc:ucanaccess://C:/Users/Hicham/Desktop/Database71.accdb");
					
					interfaceRacin.getLanceRacinButton().setEnabled(false);
					ArrayList<String> list =racinisation.LanceRacin(file);
					
					
					
						
						for (int i = 0; i < list.size(); i++) {
							String Mot=racinisation.rech(list.get(i));
							if( Mot !="Null"){
								MotRacin.add(Mot);
							
						    }
							if(Mot=="Null"){
						    	MotNonRacin.add(list.get(i));	
						    }
							
						
						}
						if(MotNonRacin.isEmpty()){
							JOptionPane.showMessageDialog(null, " La Racinisation est terminé");
						}
						else{
							compteur=0;
						interfaceRacin.getTextMott().setText(MotNonRacin.get(compteur).toString());
						}
						
						
								
							}
					catch(Exception t){
					t.printStackTrace();
				}
		}
				} 
				
				
				
			}
			
		}
	