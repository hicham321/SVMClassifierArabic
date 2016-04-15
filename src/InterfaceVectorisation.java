import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class InterfaceVectorisation extends JFrame {
	
	private JTextArea AfficheRacinisation = new JTextArea();
	
	private JTextArea AfficheEliminationMotVides = new JTextArea();

	private JTextArea AfficheVectorisationparDoc = new JTextArea();

	private JTextArea AfficheVectorisationParCor = new JTextArea();

	
	public InterfaceVectorisation(){
		
		this.setSize(1000, 900);
		
		this.setTitle("Vectorisation");
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		panel.add(this.AfficheRacinisation);
		
		this.AfficheRacinisation.setBounds(50, 50, 200, 200);
		
        panel.add(this.AfficheEliminationMotVides);
		
		this.AfficheEliminationMotVides.setBounds(50, 50, 200, 200);
		
        panel.add(this.AfficheVectorisationparDoc);
		
		this.AfficheVectorisationparDoc.setBounds(50, 50, 200, 200);
		
        panel.add(this.AfficheVectorisationParCor);
		
		this.AfficheVectorisationParCor.setBounds(50, 50, 200, 200);
		
        this.add(panel);
		
	}
	
	public void SetTextArea(String st){
		
		this.AfficheRacinisation.setText(st);
	}

}
