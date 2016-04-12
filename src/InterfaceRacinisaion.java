import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//l'interface pour ajouté un racin pour chaque mot 

public class InterfaceRacinisaion extends JFrame {
	
	private JButton Ok = new JButton("OK");
	
	private JButton AjoutRacin = new JButton("Ajouté");
	 
	private JButton Annule = new JButton("Annulé");
	
	private JFileChooser Choisi;
	
	private JButton lanceRacinisation= new JButton("lance Racinisation");
	
	private JLabel MotLabel= new JLabel("Mot :");
	
	private JTextField TextMot = new JTextField(10);
	
	private JLabel RacinLabel = new JLabel("Racin :");
	
	private JTextField TextRacin = new JTextField(10);
	
	public InterfaceRacinisaion(){
		
		this.setTitle("Racinisation");
		
        this.setSize(600, 300);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		panel.add(this.Ok);
		
		this.Ok.setBounds(150, 220, 80, 25);
				
		panel.add(this.AjoutRacin);
		
		this.AjoutRacin.setBounds(350,110 , 100, 25);
				
		panel.add(this.Annule);
		
		this.Annule.setBounds(400, 220, 80, 25);
		
		panel.add(lanceRacinisation);
		
		this.lanceRacinisation.setBounds(350, 65, 100, 25);
		
		panel.add(this.MotLabel);
		
		this.MotLabel.setBounds(150, 65, 50, 25);
		
		panel.add(this.TextMot);
		
		this.TextMot.setBounds(200, 65, 100, 25);
		
		panel.add(this.RacinLabel);
		
		this.RacinLabel.setBounds(150, 110, 50, 25);
		
		panel.add(this.TextRacin);
		
		this.TextRacin.setBounds(200, 110, 100, 25);
		
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
		
		return this.TextMot.getText().toString();
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
