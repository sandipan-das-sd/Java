public class Opps {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();
        Pen pen2 = new Pen();
        pen2.color = "green";
        pen2.type = "ge2";
        pen2.write();
        pen2.printColor();
        pen1.printColor();
    }
}

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something...");
    }

    public void printColor() {
        System.out.println(this.color);
    }

}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}








