import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class vectorisation {
	

	
public vectorisation(ArrayList<String> list)  {
	
	
	}

private void PoidDansDocument(ArrayList<String> list) {
		
		
		
		
		Map <String,Integer> mapfortext=new HashMap<String,Integer>();
		
		
		for(int k=0;k<list.size();k++){
			int compteur=0;
			for(int j=0;j<list.size();j++){
				
				if(list.get(k).equals(list.get(j))){
					
					compteur++;
					
				}
			}
            //poid de mot dans le document
			mapfortext.put(list.get(k), compteur/list.size());
		}
		ArrayList <String> cles = new ArrayList<String>(mapfortext.keySet());
        //pour affiché dans l'interface 
		for(String cle: cles){
			
		    System.out.println(cle + ": " + mapfortext.get(cle));

		}

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

