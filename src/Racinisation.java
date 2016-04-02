import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// Cette class fait la racinisation manuelement 
public class Racinisation {
	private Connection con ;

	private Statement stmt;
	
	private ArrayList<String> MotRacine;

	
	public Racinisation (){
		
	}
	
    public void connectio ( String path ){
		
		
		
	    try {
	        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

	        this.con = DriverManager.getConnection(path, "", "");

	        this.stmt = con.createStatement();

	        // Returns a ResultSet that contains the data produced by the query;
	        // never null
	        String query= "insert query here";
	        ResultSet rs = stmt.executeQuery(query);


	        while (rs.next()) {
	            /*String fName = rs.getString("Field1");
	           String lName = rs.getString("LastName");
	            int age = rs.getInt("ID");*/
	        }

	        stmt.close();

	        con.close();
	    } catch (SQLException ex) {
	        System.err.println("SQLException: " + ex.getMessage());
	    } 
	      catch (ClassNotFoundException e) {
	    	  
		    System.err.println("classnotfoundException: " + e.getMessage());

	    	  
	    }
	}
    //inserer un mot  
     public void Ins (String Mot){
		
		try{
        String query= "INSERT INTO Racinisation (Mot) VALUES("+ Mot +")" ;
        
        ResultSet r= this.stmt.executeQuery(query);
		}catch ( SQLException e) {
			System.out.println("sql exception : "+ e);
		}
		
	}
     public void insRacin(String racin){
    	 
    	 try{
    	 String query= "INSERT INTO Racinisation (Racin) VALUES("+ racin +")" ;
    	        
    	 ResultSet r= this.stmt.executeQuery(query);
         }catch ( SQLException e) {
    			System.out.println("sql exception : "+ e);
    	 }
    	 
     }
     public String rech (String mot){
    	 
    	 try{
         String query= "SELECT Racin from Racinisation WHERE Racinisation.Mot= "+ mot +"" ;
         //need to return the string for the racin
         	        
         ResultSet r= this.stmt.executeQuery(query);
         //Return a string from the result set 
         String result = r.getString(0);
         
    	 return result;

         }catch ( SQLException e) {
        			System.out.println("sql exception : "+ e);
        			return "";
         }
    	 
    	 
     }
     
     public void LanceRacin() throws FileNotFoundException, UnsupportedEncodingException, IOException{
    	 
    	    File f = new File("inserer le lien ver les mots vides");
			
			StopWord st =new StopWord(f);
			
			ArrayList<String>list=st.EliminerStopWord();
			
			for(int i =0;i<list.size();i++){
				Rech();
			}

			
			
			
    	 
     }
     //crie des method trouvé racin , et racin non trouvé , 
     
    
	
	
}
