package dev.patika.studentinfosystem;

public class Main {
	
	public static void main(String[] args) {
		
		Course c1 = new Course("Matematik", "MAT101", "MAT");
        Course c2 = new Course("Fizik", "FZK101", "FZK");
        Course c3 = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        c1.addTeacher(t1);
        c2.addTeacher(t2);
        c3.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", c1, c2, c3);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkAdditionNote(40,40,20);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", c1, c2, c3);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkAdditionNote(90,90,90);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", c1, c2, c3);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkAdditionNote(10,10,0);
        s3.isPass();

		
	}

}
