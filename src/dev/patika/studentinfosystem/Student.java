package dev.patika.studentinfosystem;

public class Student {
	
 
    Course c1;
    Course c2;
    Course c3;
    String name;
    int stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, int stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }


    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void addBulkAdditionNote(int verbalNote1, int verbalNote2, int verbalNote3) {
        if (verbalNote1 >= 0 && verbalNote1 <= 100) {
            this.c1.noteAdd = verbalNote1;
        }
        if (verbalNote2 >= 0 && verbalNote2 <= 100) {
            this.c2.noteAdd = verbalNote2;
        }
        if (verbalNote3 >= 0 && verbalNote3 <= 100) {
            this.c3.noteAdd = verbalNote3;
        }

    }

    void isPass() {
        System.out.println("====================");
        this.average = ((this.c1.note * 0.8 + this.c1.noteAdd * 0.2)
                + (this.c2.note * 0.8 + this.c2.noteAdd * 0.2)
                + (this.c3.note * 0.8 + this.c3.noteAdd * 0.2)) / 3.0;
        
        if (this.average > 55) {
            System.out.println("Sinifi basarili gectiniz.");
            this.isPass = true;
        } else {
            System.out.println("Sinifta kaldiniz!");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu\t:" + this.c1.note);
        System.out.println(this.c2.name + " Notu\t:" + this.c2.note);
        System.out.println(this.c3.name + " Notu\t:" + this.c3.note);
        System.out.println(this.c1.name + " SozNotu\t:" + this.c1.noteAdd);
        System.out.println(this.c2.name + " SozNotu\t:" + this.c2.noteAdd);
        System.out.println(this.c3.name + " SozNotu\t:" + this.c3.noteAdd);
        System.out.println("Ortalamaniz:" + this.average);

    }


}
