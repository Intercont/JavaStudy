package hackerrank;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class JavaSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
//11 999910621
            //00CB516470E1
            testCases--;
        }

        //Ordenando no Braço - primeiro Dev
//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student student, Student t1) {
//                int result = 0;
//                if (student.getCgpa() > t1.getCgpa()) { //maior nota do primeiro, quero ordenar DECRESCENTE
//                    return -1;
//                } if (student.getCgpa() < t1.getCgpa()) {
//                    return 1;
//                } else if (student.getCgpa() == t1.getCgpa()) {
//                    result = student.getFname().compareTo(t1.getFname()); //Ordem alfabética
//                    if (result == 0) {
//                        if(student.getId() > t1.getId()) { //menor ID vai primeiro
//                            result = -1;
//                        } else {
//                            result = 1;
//                        }
//                    }
//                }
//                return result;
//            }
//        });

        //Depois de pensar um pouco - mais eficiente - usando Collections do Java - ordenamos do último critério para o primeiro
        Collections.sort(studentList, Comparator.comparing(Student::getId));
        Collections.sort(studentList, Comparator.comparing(Student::getFname));
        Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed());

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}




