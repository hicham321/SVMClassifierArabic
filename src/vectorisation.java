import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class vectorisation {
	

	
public vectorisation()  {
	
	
	}

private Map PoidDansDocument(ArrayList<String> list) {
		
		
		
		
		Map <String,Double> mapfortext=new HashMap<String,Double>();
		
		
		for(int k=0;k<list.size();k++){
			int compteur=0;
			for(int j=0;j<list.size();j++){
				
				if(list.get(k).equals(list.get(j))){
					
					compteur++;
					
				}
			}
            //poid de mot dans le document

			double res = (double)compteur/list.size(); 

			mapfortext.put(list.get(k), res);
		}
		ArrayList <String> cles = new ArrayList<String>(mapfortext.keySet());
        //pour affiché dans l'interface 
		for(String cle: cles){
			
		    System.out.println(cle + ": " + mapfortext.get(cle));

		}
		return mapfortext;

}
public Map PoidMotCorpus(ArrayList<ArrayList<String>> grandlist){
	
	ArrayList<String> list = new ArrayList<String>();
	
	for(int i=0;i<grandlist.size();i++){
		for(int j=0; j<grandlist.get(i).size();j++){
			
			list.add(grandlist.get(i).get(j));
			
		}
	}
	Map<String, Integer> map= PoidDansDocument(list);
	return map;
}

//Reused method from HMM classifier

private ArrayList<ArrayList<String>>   FichierAuVecteur (String LienVersRepertoire) throws FileNotFoundException , UnsupportedEncodingException ,IOException{
	    

 	
		File dir = new File(LienVersRepertoire);
		
		  File[] ListeDeRepertoire = dir.listFiles();
		  
		  int compteur =0;
		  if (ListeDeRepertoire != null) {
		    for (File child : ListeDeRepertoire) {
		      // Do something with child
		    	
		    	ArrayList<String> VecteurFichier =new ArrayList<>();
		    	
		    	StopWord st =new StopWord(child);
		    	VecteurFichier= st.EliminerStopWord();
		    	
		    	
		   
		    	
		    	
		    	
		        this.VecteurDesFichiers.add(VecteurFichier);
		        compteur++;
		      
		    }
		  } else {
		    // Handle the case where dir is not really a directory.
		    // Checking dir.isDirectory() above would not be sufficient
		    // to avoid race conditions with another process that deletes
		    // directories.
			  System.out.println(" Ce n'est pas une repertoire de fichiers ");
		  }
		
	this.NombreDeDocuments=compteur;
	
	
	return VecteurDesFichiers;
}
public ArrayList<Map<String, Double>> PoidDoc(ArrayList<ArrayList<String>> grandlist){
	
ArrayList<Map<String,Double>> listmap = new ArrayList<Map<String,Double>>();
	
	
	for(int i=0;i<grandlist.size();i++){
		Map<String, Double> map= PoidDansDocument(grandlist.get(i));
		listmap.add(map);
		
	}

	
	
	return listmap ;
}
public int CompteToutLesMots(ArrayList<ArrayList<String>> listGrand){
	int longeur= 0;
	for(int i=0; i<listGrand.size();i++){
		for(int j=0 ;j<listGrand.get(i).size();j++){
		  longeur++; 	
		}
		
	}
	return longeur;
}

public static void main(String[] args) throws IOException,UnsupportedEncodingException,FileNotFoundException {
	
	//File file= new File("C:/Users/Hicham/Desktop/stop-words_arabic_1_ar.txt");
	
	
	

	
	
	
}

	
}

