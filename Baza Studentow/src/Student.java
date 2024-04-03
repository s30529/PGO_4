public
class Student {

    public String fName;
    public String lName;
    public String indexNumber;
    public StudentGroup studentGroup;
    public String email;
    public String address;
    public double[] grades;
    public int gradesFilled;

    public Student(String fName, String lName, String indexNumber, StudentGroup studentGroup, String email, String address) {
        this.fName = fName;
        this.lName = lName;
        this.indexNumber = indexNumber;
        this.studentGroup = studentGroup;
        this.email = email;
        this.address = address;
        this.grades = new double[15];
        this.gradesFilled = 0;
    }

    public void addGrade(double newGrade) {
        if(gradesFilled >= 15) {
            System.out.println("Cannot add more than 15 grades");
            return;
        }

        grades[gradesFilled++] = newGrade;
    }

    public double averageGrade() throws IllegalArgumentException{
        if(gradesFilled == 0)
            throw new IllegalArgumentException("Student have no grades.");

        double total = 0;

        for(double grade : grades)
            total += grade;

        double average = total / gradesFilled;

        if(average < 2)
            return 2;
        if(average >= 2.5 && average < 3)
            return 2.5;
        if(average >= 3 && average < 3.5)
            return 3;
        if(average >= 3.5 && average < 4)
            return 3.5;
        if(average >= 4 && average < 4.5)
            return 4;
        if(average >= 4.5 && average < 5)
            return 4.5;
        return 5;
    }

}