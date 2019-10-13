package inter;

public class Student {
	String name;
	public Student(String regestration) {
		this.name = regestration;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
public static void main(String[] args) {
	Student s = new Student("R123");
	Student s1 = new Student("R123");
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	System.out.println(s.hashCode() == s1.hashCode());
	//System.out.println(s == s1);
	System.out.println(s.equals(s1));
}
}
