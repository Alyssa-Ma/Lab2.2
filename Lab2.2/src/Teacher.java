public class Teacher extends Person{
	private String subject;
	private String title;
	private int age;
	private int numClass;

	public Teacher(int height, String firstName, String familyName, double weight, String subject, String title, int age, int numClass) {
		super(height, firstName, familyName, weight);
		this.subject = subject;
		this.title = title;
		this.age = age;
		this.numClass = numClass;
	}
	public String toString() {
		return this.getTitle() + this.getFirstName(); 
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumClass() {
		return numClass;
	}

	public void setNumClass(int numClass) {
		this.numClass = numClass;
	}
}
