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
		
		this.AfficheRacinisation.setBounds(50, 50, 50, 50);
		
        panel.add(this.AfficheEliminationMotVides);
		
		this.AfficheEliminationMotVides.setBounds(50, 150, 50, 50);
		
        panel.add(this.AfficheVectorisationparDoc);
		
		this.AfficheVectorisationparDoc.setBounds(50, 250, 50, 50);
		
        panel.add(this.AfficheVectorisationParCor);
		
		this.AfficheVectorisationParCor.setBounds(50, 350, 50, 50);
		
        this.add(panel);
		
	}
	
	public void SetTextAreaRacin (String st){
		
		this.AfficheRacinisation.setText(st);
	}
    public void SetTextAreaElimin(String st){
		
		this.AfficheEliminationMotVides.setText(st);
	}
    public void SetTextAreaVectDoc(String st){
		
		this.AfficheVectorisationparDoc.setText(st);
	}
    public void SetTextAreaVectCor(String st){
		
		this.AfficheVectorisationParCor.setText(st);
	}

}
