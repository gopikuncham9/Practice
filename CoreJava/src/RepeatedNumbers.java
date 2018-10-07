
public class RepeatedNumbers {
	public static void main(String[] args) {
		/*int mylist[]= {1,2,3,2,4,3,5,2,5};
		for(int i=0;i<mylist.length-1;i++) {
			for(int j=i+1;j<mylist.length;j++) {
				if((mylist[i] == mylist[j]  &&  (i != j))) {
					System.out.println("duplicate number is"  +mylist[j]);
				}
			}
		}*/
	     int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
	     
	        for (int i = 0; i < my_array.length-1; i++)
	        {
	            for (int j = i+1; j < my_array.length; j++)
	            {
	                if ((my_array[i] == my_array[j]) && (i != j))
	                {
	                    System.out.println("Duplicate Element : "+my_array[j]);
	                }
	            }
	        }
	    } 
}
