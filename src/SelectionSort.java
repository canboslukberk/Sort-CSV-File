

public class SelectionSort {
	
	public void sort(Double[] sclm, String[][] main){
		int i, j, second = 0;
		for(i=0; i<sclm.length-1; i++){
			int first = i;
			Double min=sclm[i];
			for(j=i+1; j<(sclm.length); j++){
				//compare min element and array elements
				if(sclm[j] < min){
					min = sclm[j];
					second = j;
				}
			}
			if(min != sclm[i]){
				//sort main array
				String [] temp2 = main[first+1];
				main[first+1] = main[second+1];
				main[second+1] = temp2;
				//sort column
				Double temp = sclm[first];
				sclm[first] = sclm[second];
				sclm[second] = temp; 


			}
			
		}
	}
}


