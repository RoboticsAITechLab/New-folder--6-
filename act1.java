class student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class act1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("Ankit");
        System.out.println("Student Name: " + s1.getName());
    }
}

