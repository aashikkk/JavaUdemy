class Student {
    int rollNo;
    String name;
    int marks;
}

public class arrayofObj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Ravi";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Seqasvi";
        s2.marks = 78;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Mahendasco";
        s3.marks = 80;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Enhanced for Loop

        for (Student stud : students) {
            System.out.println(stud.name + ": " + stud.marks);
        }

        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].name + ": " + students[i].marks);
        // }
    }
}
