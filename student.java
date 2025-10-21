public class student {
    int id;
    String name;
    double mark;

    public student(int id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Mark: " + mark;
    }
}

