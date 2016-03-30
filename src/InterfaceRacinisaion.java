import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//l'interface pour ajout√© un racin pour chaque mot 

public class InterfaceRacinisaion extends JFrame {
	
	private JButton Ok = new JButton();
	
	private JButton AjoutRacin = new JButton();
	 
	private JButton Annul√ = new JButton();
	
	private JTextField TextMot = new JTextField();
	
	private JTextField TextRacin = new JTextField();
	
	public InterfaceRacinisaion(){
		
		this.setTitle("Racinisation");
		
        this.setSize(600, 300);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		panel.add(this.Ok);
		
		panel.add(this.AjoutRacin);
		
		panel.add(this.Annul√);
		
		panel.add(this.TextMot);
		
		panel.add(this.TextRacin);
		
		this.add(panel);

		
	}
	
	//pour ajout√©  l'actionListener dans la class Handler 
	public void RacinInterfAddActionListener( ActionListener listner){
		
		this.AjoutRacin.addActionListener(listner);
		this.Ok.addActionListener(listner);
		this.Annul√.addActionListener(listner);
		
	}
	// les methode get 
	public JButton getOkButton (){
		
		return this.Ok;
	}
	
	public JButton getAnnuleButton(){
		return this.Annul√;
	}
	
	public JButton getAjoutRacinButton(){
		
		return this.AjoutRacin;
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
    
    
	
	
	
	
	

}
