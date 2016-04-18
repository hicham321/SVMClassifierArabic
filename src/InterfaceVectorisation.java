import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class InterfaceVectorisation extends JFrame {
	
	//private JTextArea AfficheRacinisation = new JTextArea();
	
	//private JTextArea AfficheEliminationMotVides = new JTextArea();

	private JTextArea AfficheVectorisationparDoc = new JTextArea();

	private JTextArea AfficheVectorisationParCor = new JTextArea();
	
	private JLabel labelParCor = new JLabel("Poid Du par rapport au corpus :");
	
	private JScrollPane scrollparcor = new JScrollPane(this.AfficheVectorisationParCor);
	
	private JLabel labelPardoc = new JLabel("Poid Du par rapport au document :");


	private JScrollPane scrollpardoc = new JScrollPane(this.AfficheVectorisationparDoc);


	
	public InterfaceVectorisation(){
		
		this.setSize(600, 700);
		
		this.setTitle("Vectorisation");
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		//panel.add(this.AfficheRacinisation);
		
		//this.AfficheRacinisation.setBounds(50, 50, 50, 50);
		
        //panel.add(this.AfficheEliminationMotVides);
		
		//this.AfficheEliminationMotVides.setBounds(50, 150, 50, 50);
		
        //panel.add(this.AfficheVectorisationparDoc);
        
        this.AfficheVectorisationParCor.setLineWrap(true);
        this.AfficheVectorisationParCor.setWrapStyleWord(true);
        this.AfficheVectorisationparDoc.setLineWrap(true);
        this.AfficheVectorisationparDoc.setWrapStyleWord(true);

        panel.add(this.labelParCor);
        
        this.labelParCor.setBounds(50, 320, 200, 20);
		
		panel.add(this.scrollparcor);
		
		this.scrollparcor.setBounds(50, 350, 400, 150);
		
        panel.add(this.labelPardoc);
        
        this.labelPardoc.setBounds(50, 100, 200, 20);
		
        panel.add(this.scrollpardoc);
		
		this.scrollpardoc.setBounds(50, 150, 400, 150);
		
        this.add(panel);
		
	}
	
	/*public void SetTextAreaRacin (String st){
		
		this.AfficheRacinisation.setText(st);
	}
    public void SetTextAreaElimin(String st){
		
		this.AfficheEliminationMotVides.setText(st);
	}*/
    public void SetTextAreaVectDoc(String st){
		
		this.AfficheVectorisationparDoc.setText(st);
	}
    public void SetTextAreaVectCor(String st){
		
		this.AfficheVectorisationParCor.setText(st);
	}

}
