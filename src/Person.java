import NameMesh.NameMesh;

public class Person extends NameMesh {

    String name = "RJ";
    long age = 25;

    void Get() {
        System.out.print("Name Mesh: " + super.name.toUpperCase() + "\n");
        System.out.print("Name: " + this.name.toUpperCase() + "\n");
    }

    void getAge() {
        System.out.printf("I am Ryan And I am %d Years Old\n", super.age);
        System.out.printf("I am Ryan And I am %d Years Old\n", this.age + 1);
    }

    void GetSteps() {
        if (this.isOwned) {
            getAge();
        }
    }
}