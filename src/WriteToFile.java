import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WriteToFile {

	public void arrayToList(String[][] array, String dir) throws FileNotFoundException {
	List<String> collection = Arrays.stream(array)  //'array' is two-dimensional
		    .flatMap(Arrays::stream)
		    .collect(Collectors.toList());

		PrintWriter pw = new PrintWriter(new File(dir));
			

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<collection.size(); i++){
			if(i%82 == 0 && i != 0){
				sb.append("\r\n");
			}
			sb.append(collection.get(i));
			sb.append(",");
			
		}
		pw.write(sb.toString());
		pw.close();

	}

}