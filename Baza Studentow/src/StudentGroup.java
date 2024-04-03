public
class StudentGroup {

    public String id;
    public Student[] students;
    public int studentsFilled;

    public StudentGroup(String id) {
        this.id = id;
        this.students = new Student[20];
        this.studentsFilled = 0;
    }

    public void addStudent(Student student) throws IllegalStateException{
        if(studentsFilled >= 20 || studentInGroup(student))
            throw new IllegalStateException("Too many students in group or student already assigned");

        students[studentsFilled++] = student;
    }

    private boolean studentInGroup(Student student) {
        for(Student st : students)
            if(st == student)
                return true;

        return false;
    }

}