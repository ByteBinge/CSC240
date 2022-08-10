class Student {
    private String firstName;
    private String lastName;
    private static int ID = 1;
    private double GPA;
    private int numberOfCredits;

    public Student(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	ID = getNextID();
	GPA = 0.0;
	numberOfCredits = 0;
    }
    
    private static int getNextID() {
	return ++ID;
    }

    private void report() {

    }

    private boolean canGraduate() {

    }

    public static void main(String[] args) {
	Student christian = new Student("Christian", "Jakob");
	System.out.printf("%s %s, ID=%d, GPA=%1.2f, Credits=%d", christian.firstName, christian.lastName, christian.ID, christian.GPA, christian.numberOfCredits);
	System.out.println();
	Student John = new Student("Bob", "John");
	System.out.println(John.ID);
    }
}
