import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;


public class Assignment1 {

	public static void main(String[] args) {
		ReadAllLines read = new ReadAllLines();
		read.readFromFiles(args[0]);
		int column = Integer.parseInt(args[1]);

		Compare comp = new Compare(read.getMarray(), (read.size-1), column, args[2], args[0]);
		

	}

	

}
