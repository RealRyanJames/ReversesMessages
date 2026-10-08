import NameMesh.NameMesh;

void main() {

    Person person = new Person();
    NameMesh mesh = new NameMesh();

    if (String.class.toString().equals(person.name.getClass().toString())) {
        person.Get();
        person.GetSteps();
        System.out.print(new StringBuilder(person.name).reverse());
        System.out.print(new StringBuilder(mesh.name).reverse());
    }
}
