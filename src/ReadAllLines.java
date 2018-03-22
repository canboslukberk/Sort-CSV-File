import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadAllLines {
	
	
	Charset charset = Charset.forName("ISO-8859-1");
	List<String> lines = new ArrayList<String>();
	String[] s_arr;
	private String[][] mArray;
	int size;
	
	public String[][] getMarray() {
		return mArray;
	}
	public String[][] readFromFiles(String path){
	    try {
	    	Path mypath = Paths.get(path);
	    	lines = Files.readAllLines(mypath, charset);
	    	size = lines.size();
	    	
			listToArray();
	    
	    } catch (IOException e) {
	      System.out.println("Dosya hatali veya yok");
    	
	    }
		return mArray;
	
	}

	public String[][] listToArray(){
		mArray= new String[lines.size()][82];
		String[] myArray = lines.toArray(new String[lines.size()]);
		for (int i=0;i<lines.size();i++) {
			s_arr = myArray[i].split(",");
			for (int j=0; j<82; j++) {
				mArray[i][j] = s_arr[j];
			}
		}

				return mArray;
	}
}
