public class ShowGrades {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(6);
        grades.add(5);
        grades.add(6);
        grades.add(4);
        System.out.println("Średnia to: " + grades.mean());
        System.out.println("Ostatnia ocena to: " + grades.getLastGrade());

    }
}
