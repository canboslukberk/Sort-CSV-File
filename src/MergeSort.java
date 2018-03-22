
public class MergeSort {
	
	public void merge(Double sclm[], int l, int m, int r, String[][] main){
		
		
	int size1 = m-l+1;
	int size2 = r-m;


	String sL[][] = new String [size1+1][];
	String sR[][] = new String [size2+1][];
	
	Double L[] = new Double [size1];
	Double R[] = new Double [size2];
	
    for (int i=0; i<size1; ++i){	
    	sL[i] = main[l+i+1];
    	L[i] = sclm[l+i];    
    } 
    
    for (int j=0; j<size2; ++j){
    	sR[j] = main[m+1+j+1];
    	R[j] = sclm[m+1+j];
    }
    int i = 0, j = 0;
    
    // Initial index of merged subarry array
    int k = l;
    while (i < size1 && j < size2){
        if (L[i] <= R[j]){
        	main[k+1] = sL[i];
        	sclm[k] = L[i];
            i++;
        }
        else{
        	main[k+1] = sR[j];
        	sclm[k] = R[j];
            j++;
        }
        k++;
    }
    
    while (i < size1){
    	main[k+1] = sL[i];
    	sclm[k] = L[i];
        i++;
        k++;
    }

    /* Copy remaining elements of R[] if any */
    while (j < size2){
    	main[k+1] = sR[j];
    	sclm[k] = R[j];
        j++;
        k++;
    }
}
	
    public void sort(Double arr[], int l, int r, String[][] main){
        if (l < r){
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m, main);
            sort(arr , m+1, r, main);
 
            // Merge the sorted halves
            merge(arr, l, m, r, main);
        }
    }

	
}
