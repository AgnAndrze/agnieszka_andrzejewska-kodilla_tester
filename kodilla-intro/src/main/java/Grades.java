public class Grades {
    private int[] grades;
    private int size;
    private int sum;
    public Grades () {
        this.grades = new int[4];
        this.size = 0;
    }
    //tego momentu nie rozumiem
    public void add(int value) {
        if (this.size == 4) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    //do tego momentu
    public int getLastGrade() {
        return grades [size -1];
    }
    public double mean() {
        int result = 0;
        for (int i = 0; i < grades.length; i++) {
            result = result + grades[i];
        }
        return result / grades.length;
    }
}
