public class Student extends Person{
	private String[] schedule;
	private double GPA;
	private long osis;
		
	public Student(int height, String firstName, String familyName, double weight, String[] schedule, double GPA, long osis)
	
	{
		super(height, firstName, familyName, weight);
		this.schedule = schedule;
		this.GPA = GPA;
		this.osis = osis;
	}

	/**
	 */
	public double getGPA() {
		return GPA;
	}

	/**
	 * @param gPA the gPA to set
	 */
	public void setGPA(double GPA) {
		GPA = GPA;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return familyName + " , " + firstName ;
	}

	
}
