public class Student implements Comparable<Student>  {

	private String name;
	private int perm;
	private String major;

	public Student(String name, int perm, String major) {
		this.name = name;
		this.perm = perm;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public int getPerm() {
		return perm;
	}

	public String getMajor() {
		return major;
	}

	@Override
	public int compareTo(Student o) {
		return this.getMajor().compareTo(o.getMajor());
	} 

	@Override
	public String toString() {
		return "[" +
			this.getName() + "," +
			this.getPerm() + "," +
			this.getMajor() + "]";
	} 

	
}
