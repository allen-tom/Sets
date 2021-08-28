import java.util.*;

public class Sets{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		  Set<Integer> one = new TreeSet<Integer>();
		  Set<Integer> two = new TreeSet<Integer>();
		  
		 // Set<Integer> union = new TreeSet<Integer>();
		  
		  	 	one.add(scan.nextInt());
		  	 	one.add(scan.nextInt());
		  	 	one.add(scan.nextInt());
		  	 	one.add(scan.nextInt());
		  	 	one.add(scan.nextInt());
		  	 	System.out.println("Set one " + one);
		  	 	two.add(scan.nextInt());
		  	 	two.add(scan.nextInt());
		  	 	two.add(scan.nextInt());
		  	 	two.add(scan.nextInt());
		  	 	two.add(scan.nextInt());
		  	 	System.out.println("Set two " + two );
		  	 	//--------- Union -------------------------//
		  	 		Set<Integer> union = new TreeSet<Integer>(one);
		  	 	
		  	 	union.addAll(two);
		  	 	System.out.println("Union - " + union);
		  	 	
		  	 	// -------- Intersection ------------------//
		  	 	Set<Integer> intersection = new TreeSet<Integer>(one);
		  	 	
		  	 	intersection.retainAll(two);
		  	 	System.out.println("Intersection - " + intersection);
		  	 	//--------- Difference -------------------//
		  	 	Set<Integer> difference1 = new TreeSet<Integer>(one);
		  	 	difference1.removeAll(two);
		  	 	System.out.println("Difference A-B " + difference1);
		  	 	Set<Integer> difference2 = new TreeSet<Integer>(two);
		  	 	difference2.removeAll(one);
		  	 	System.out.println("Difference B-A " + difference2);
		  		//--------- Symmetric Difference ---------//
		  		Set<Integer> symDiff = new TreeSet<Integer>(union);
		  	 	symDiff.addAll(intersection);
		  	 	Set<Integer> tmp = new TreeSet<Integer>(union);
    				tmp.retainAll(intersection);
    				symDiff.removeAll(tmp);
    				 
		  	 	System.out.println("Symmetric Difference " + symDiff);
			//System.out.println(one);
		}
	}