import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Cette class fait la racinisation manuelement 
public class Racinisation {
	private Connection con ;

	private Statement stmt;

	
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
     public void rech (String mot){
    	 
    	 try{
         String query= "SELECT Mot from Racinisation WHERE Racinisation.Mot= "+ mot +"" ;
        	        
         ResultSet r= this.stmt.executeQuery(query);
         }catch ( SQLException e) {
        			System.out.println("sql exception : "+ e);
         }
    	 
    	 
     }
     
    
	
	
}
