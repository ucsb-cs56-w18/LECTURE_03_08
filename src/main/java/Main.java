import java.util.ArrayList;

public class Main {

	public static void main(String [] args) {
		ArrayList<Student> roster = new ArrayList<Student>();

		roster.add(new Student("Annan",123456,"CMPSC"));
		roster.add(new Student("Jay Gaucho",777777,"COMM"));
		roster.add(new Student("Max",169420,"HYDROLOGY"));
		roster.add(new Student("Brian",999999,"ICE SCIENCE"));
		roster.add(new Student("Mary",22222,"CMPEN"));

		java.util.Collections.sort(roster);
		System.out.println("Sorted by Major:");
		System.out.println(roster);

		System.out.println("Sorted by Perm:");
		roster.sort(new TediousPermComparator());
		System.out.println(roster);
		
		System.out.println("Sorted by Name:");
		roster.sort( (s1,s2) -> s1.getName().compareTo(s2.getName()) );
		System.out.println(roster);
		
		/* Line 23 above is short for:

                roster.sort(
		   new Comparator() {
                       public int compare(Student s1, Student s2) { 
                         return s1.getName().compareTo(s2.getName()); 
                       }   
                   }
                );
	      
                */

		System.out.println("Sorted by Perm, more simply:");
		roster.sort( (s1,s2) -> Integer.compare( s1.getPerm(), s2.getPerm() ) );
		System.out.println(roster);

	}

}
