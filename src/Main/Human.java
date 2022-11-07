package Main;

public class Human {
    // FIELDS / Instance Variables
    static int human_count = 0;
    private String name;
    private int age;
    private boolean gender_male;

    public static final String SPECIES = "Homo Sapiens";
    public static final int AGE_OF_DEATH = 80;

    public Human() {
        this("Juan Dela Cruz", 26, true);
//        name = "Juan Dela Cruz";
//        age = 26;
//        gender_male = true;
    }

    public Human(int age, String name, boolean gender_male) {
        this(name, age, gender_male);
    }

    public Human(String name, int age, boolean gender_male) {
        this.name = name;
        this.age = age;
        this.gender_male = gender_male;
        human_count++;
    }

    // METHOD
    public void talk() {
        System.out.println(name + ": Hi!");
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
