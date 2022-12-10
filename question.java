public class Question {
    private String qn;
	private int id;
    private String cra;

    public Question(String n, int i, String c)
    {
        this.qn = n;
        this.cra = c;
		this.id = i;
    }

    public String getQn() { return name; }
	public String getId() { return id; }
    public String getCorrectAns() { return crs; }
}
