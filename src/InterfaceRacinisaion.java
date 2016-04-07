import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//l'interface pour ajouté un racin pour chaque mot 

public class InterfaceRacinisaion extends JFrame {
	
	private JButton Ok = new JButton("OK");
	
	private JButton AjoutRacin = new JButton("Ajouté un racine");
	 
	private JButton Annule = new JButton("Annulé");
	
	private JButton lanceRacinisation= new JButton("lance Racinisation");
	
	private JTextField TextMot = new JTextField(10);
	
	private JTextField TextRacin = new JTextField(10);
	
	public InterfaceRacinisaion(){
		
		this.setTitle("Racinisation");
		
        this.setSize(600, 300);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		panel.add(this.Ok);
		
		panel.add(this.AjoutRacin);
		
		panel.add(this.Annule);
		
		panel.add(lanceRacinisation);
		
		panel.add(this.TextMot);
		
		panel.add(this.TextRacin);
		
		this.add(panel);

		
	}
	
	//pour ajouté  l'actionListener dans la class Handler 
	public void RacinInterfAddActionListener( ActionListener listner){
		
		this.AjoutRacin.addActionListener(listner);
		this.Ok.addActionListener(listner);
		this.Annule.addActionListener(listner);
		this.lanceRacinisation.addActionListener(listner);
		
	}
	// les methode get 
	public JButton getOkButton (){
		
		return this.Ok;
	}
	
	public JButton getAnnuleButton(){
		return this.Annule;
	}
	
	public JButton getAjoutRacinButton(){
		
		return this.AjoutRacin;
	}
	
	public JButton getLanceRacinButton(){
		
		return this.lanceRacinisation;
	}
	
	public String getTextMot( ){
		
		return this.TextMot.getText();
	}
	
    public String getTextRacin( ){
		
		return this.TextRacin.getText();
	}
    
    public JTextField getTextMott( ){
		
		return this.TextMot;
	}
    
    
    public JTextField getTextRacint( ){
		
		return this.TextRacin;
	}
    
    public void setextRacin(String textRacin){
    	
    	this.TextRacin.setText(textRacin);
    }
    
	
	
	
	
	

}
