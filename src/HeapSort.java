
public class HeapSort {

	 public void sort(Double sclm[], String[][] main){
	        int n = sclm.length;
	 
	        // Build heap (rearrange array)
	        for (int i = n / 2 - 1; i >= 0; i--){
	            heapsort(sclm, n, i, main);
	        }
	        // One by one extract an element from heap
	        for (int i=n-1; i>=0; i--) {
	            // Move current root to end
	        	String[] temp2 = main[0+1];
	        	main[0+1] = main[i+1];
	        	main[i+1] = temp2;
	        	
	        	Double temp = sclm[0];
	        	sclm[0] = sclm[i];
	        	sclm[i] = temp;
	 
	            // call max heapify on the reduced heap
	            heapsort(sclm, i, 0, main);
	        }
	    }
	 
	    // To heapify a subtree rooted with node i which is
	    // an index in arr[]. n is size of heap
	    void heapsort(Double sclm[], int n, int i, String[][] main){
	        int largest = i;  // Initialize largest as root
	        int l = 2*i + 1;  // left = 2*i + 1
	        int r = 2*i + 2;  // right = 2*i + 2
	 
	        // If left child is larger than root
	        if (l < n && sclm[l] > sclm[largest]){
	            largest = l;
	    }
	        // If right child is larger than largest so far
	        if (r < n && sclm[r] > sclm[largest]){
	            largest = r;
	    }
	        // If largest is not in root
	        if (largest != i){
	        	String[] temp3 = main[i+1];
	        	main[i+1] = main[largest+1];
	        	main[largest+1] = temp3;
	        	
	        	Double swap = sclm[i];
	        	sclm[i] = sclm[largest];
	        	sclm[largest] = swap;
	 
	            // Recursively heapify the affected sub-tree
	            heapsort(sclm, n, largest, main);
	        }
	    }
	
	
}
