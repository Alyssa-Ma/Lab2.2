
public class Student extends Person{
	private String[] schedule;
	private double GPA;
	private long osis;
		
	public Student(int height, String firstName, String familyName, double weight)
	
	{
		super(height, firstName, familyName, weight);
		this.schedule = schedule;
		this.GPA = GPA;
		this.osis = osis;
	}

	/**
	 * @return the gPA
	 */
	public double getGPA() {
		return GPA;
	}

	/**
	 * @param gPA the gPA to set
	 */
	public void setGPA(double gPA) {
		GPA = gPA;
	}

	/**
	 * @return the osis
	 */
	public long getOsis() {
		return osis;
	}

	/**
	 * @param osis the osis to set
	 */
	public void setOsis(long osis) {
		this.osis = osis;
	}

	
}
