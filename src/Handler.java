import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;




 
//cette classe relie les donnée de l'interface et la classe Racnisation

public class Handler {
	
	
	Racinisation racinisation= new Racinisation();
	
	InterfaceRacinisaion interfaceRacin = new InterfaceRacinisaion();
	
	private ArrayList<String> MotRacin= new ArrayList<String>();
		
	private ArrayList<String> MotNonRacin= new ArrayList<String>();
	
	private ArrayList<ArrayList<String>> GrandList = new ArrayList<ArrayList<String>>();
		
	private File file ;
	
	private JFileChooser filechooser = new JFileChooser();
	
	private int returnVal;

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
						   JOptionPane.showMessageDialog(null, "La racinisagtion du document est terminé");
						   String Racin =interfaceRacin.getTextRacin(); 
						   String Mot = interfaceRacin.getTextMot();
                           //
						   System.out.println(MotNonRacin.get(compteur));
						   racinisation.InsT(Mot, Racin);
						   interfaceRacin.getTextMott().setText("");
						   interfaceRacin.getTextRacint().setText("");
						   //pour resette l'array list et l'ajout a lagrand list
						   
						   GrandList.add(MotRacin);
						   MotRacin.clear();
						   MotNonRacin.clear();
						   interfaceRacin.getLanceRacinButton().setEnabled(true);
						    
				    }else{
						   System.out.println(MotNonRacin.get(compteur));

						   String Racin =interfaceRacin.getTextRacin(); 
						   String Mot = interfaceRacin.getTextMot();
						   System.out.println(MotNonRacin.get(compteur));
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
				//le code qui lance la vectorisation et ferme l'interface de racinisation
				
				interfaceRacin.dispose();
				
			}
			if(e.getSource()==interfaceRacin.getAnnuleButton()){
				interfaceRacin.dispose();

			}
			//l'action du bouton Choisi 
			if(e.getSource()== interfaceRacin.getChoisiButton()){
				returnVal = filechooser.showOpenDialog(null);
	            if(returnVal == JFileChooser.APPROVE_OPTION){
	                    file = filechooser.getSelectedFile();
	                    }
				
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
	