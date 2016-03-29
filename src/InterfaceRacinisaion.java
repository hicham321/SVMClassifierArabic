import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//l'interface pour ajouté un racin pour chaque mot 

public class InterfaceRacinisaion extends JFrame {
	
	private JButton Ok = new JButton();
	
	private JButton AjoutRacin = new JButton();
	 
	private JButton Annulé = new JButton();
	
	private JTextField TextMot = new JTextField();
	
	private JTextField TextRacin = new JTextField();
	
	public InterfaceRacinisaion(){
		
	}
	
	//pour ajouté  l'actionListener dans la class Handler 
	public void RacinInterfAddActionListener( ActionListener listner){
		
		this.AjoutRacin.addActionListener(listner);
		this.Ok.addActionListener(listner);
		this.Annulé.addActionListener(listner);
		
	}
	
	public JButton getOkButton (){
		
		return this.Ok;
	}
	
	public JButton getAnnuleButton(){
		return this.Annulé;
	}
	
	public JButton getAjoutRacinButton(){
		
		return this.AjoutRacin;
	}
	
	
	
	

}
