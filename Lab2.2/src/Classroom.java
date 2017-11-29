public class Classroom {
	Person[] students;
	Person teacher;
	
	public Classroom(Person[] students, Person teacher) {
		this.students = students;
		this.teacher = teacher;
	}
	
	public String getSubject() {
		return ((Teacher)teacher).getSubject();
	}
	public double classAverage() {
		int count = 0, TGPA = 0;
		
		for(Person p: students) {
			if(p instanceof Student) {
				TGPA += ((Student) p).getGPA();
				count++;
			}
		}
		return TGPA/count;
	}
	
	public String printClass() {
		return ((Teacher)teacher).toString() + ((Teacher)teacher).getSubject() + students.length; 
	}
}


