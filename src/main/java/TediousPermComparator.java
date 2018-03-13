public class TediousPermComparator implements java.util.Comparator<Student> {

	public int compare(Student s1, Student s2) {
		/* Integer.compare(s1.getPerm(), s2.getPerm()); */		
		return s1.getPerm() - s2.getPerm();
	}

}
