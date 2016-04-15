import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class InterfaceVectorisation extends JFrame {
	
	private JTextArea affiche = new JTextArea();
	
	public InterfaceVectorisation(){
		
		this.setSize(600, 400);
		
		this.setTitle("Vectorisation");
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		panel.add(this.affiche);
		
		this.affiche.setBounds(50, 50, 200, 200);

		
	}
	
	public void SetTextArea(String st){
		
		this.affiche.setText(st);
	}

}
