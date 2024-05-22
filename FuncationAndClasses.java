package funcation.and.classes;

import java.util.Scanner;

class Student {

    String name;
    int[] deg = new int[5];//int [] deg;
    int sum = 0;
    double avg = 0.0;
}

public class FuncationAndClasses {

    static Scanner in = new Scanner(System.in);
    // public static void add(Student [] a)

    public static Student[] add(Student[] stu) {
        for (int student_counter = 0; student_counter < stu.length; student_counter++) {
            stu[student_counter] = new Student();
            System.out.println("Enter Student Name : ");
            stu[student_counter].name = in.next();
            for (int degree_counter = 0; degree_counter < stu[student_counter].deg.length; degree_counter++) {
                System.out.println("Enter Student Degree : ");
                stu[student_counter].deg[student_counter] = in.nextInt();
                stu[student_counter].sum = stu[student_counter].sum + stu[student_counter].deg[degree_counter];
            }
            stu[student_counter].avg = stu[student_counter].sum / 5;
        }
        sort(stu);
        print(stu);
        return stu;
    }

    public static Student[] sort(Student[] stu) {
        for (int Student_degree1 = 0; Student_degree1 < 4; Student_degree1++) {
            for (int Student_degree2 = Student_degree1 + 1; Student_degree2 < 4; Student_degree2++) {
                if (stu[Student_degree1].avg < stu[Student_degree2].avg) {
                    Student temp = stu[Student_degree1];
                    stu[Student_degree1] = stu[Student_degree2];
                    stu[Student_degree2] = temp;
                }
            }
        }
        return stu;
    }

    public static void print(Student[] stu) {
        for (int Student_counter = 0; Student_counter < stu.length; Student_counter++) {
            System.out.println("Student name is" + stu[Student_counter].name + "\n degree are");
            for (int i = 0; i < stu[i].deg.length; i++) {
                System.out.print(stu[Student_counter].deg[i] + "\t");
            }
            System.out.println("\n sumation =" + stu[Student_counter].sum + "\t avg= " + stu[Student_counter].avg);
        }
    }

    public static Student search(Student[] stu) {

        Student student = new Student();
        System.out.println("Enter Name Of Student : ");
        String student_name = in.next();
        for (int Student_counter = 0; Student_counter < stu.length; Student_counter++) {
            if (stu[Student_counter].name.equals(student_name)) {
                student = stu[Student_counter];
                break;
            } else {
                student = null;
            }
        }
        return student;

    }

    public static int loc(Student[] stu, Student b) {
        int num_loc = 0;
        for (int Student_counter = 0; Student_counter < stu.length; Student_counter++) {
            if (b == stu[Student_counter]) {
                break;
            }
            num_loc++;
        }
        return num_loc;
    }

    public static Student update(Student stu[], Student s) {
        s.name = in.next();
        int loca = loc(stu, s);
        for (int Student_counter = 0; Student_counter < 5; Student_counter++) {
            s.deg[Student_counter] = in.nextInt();
            s.sum = s.sum + s.deg[Student_counter];
        }
        s.avg = s.sum / 5;
        stu[loca] = s;
        return s;
    }

    public static void print(Student aa) {
        System.out.println("Student name is" + aa.name + "\n degree are");
        for (int i = 0; i < 5; i++) {
            System.out.print(aa.deg[i] + "\t");
        }
        System.out.println("\n sumation =" + aa.sum + "\t avg= " + aa.avg);
    }

    public static void main(String[] args) {
        int num_of_opration = 0;

        Student[] stu = new Student[4];
        Student aa = new Student();

        do {
            System.out.println("1)Enter Sutdents Informations : ");
            System.out.println("2)Sort Sutdents : ");
            System.out.println("3)Print Sutdents Informations : ");
            System.out.println("4)Search : ");
            System.out.println("5)UpDate: ");
            System.out.println("6)Print Student Information : ");
            System.out.println("7)Exit : ");
            System.out.println("Enter Num Of Opartion : ");
            num_of_opration = in.nextInt();
            switch (num_of_opration) {
                case 1: {
                    add(stu);
                    break;
                }
                case 2: {
                    sort(stu);
                    break;
                }
                case 3: {
                    print(stu);
                    break;
                }
                case 4: {
                    search(stu);
                    if (search(stu) != null) {
                        aa = search(stu);
                    }
                    break;
                }
                case 5: {
                    update(stu, aa);
                    break;
                }
                case 6:
                    print(aa);
            }
        } while (num_of_opration != 7);
    }
}
