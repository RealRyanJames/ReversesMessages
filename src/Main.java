import IFileClient.FileClientFound;
import NameMesh.NameMesh;

void main() {

    Person person = new Person();
    NameMesh mesh = new NameMesh();

    if (String.class.toString().equals(person.name.getClass().toString())) {
        person.Get();

        FileClientFound files = new FileClientFound();
        File file = new File("name.txt");

        if (file.exists()) {
            try (FileWriter writer = new FileWriter(files.GetFileByName(file.getName()))) {
                writer.write("Reversed Name is: " + new StringBuilder(mesh.name).reverse());
            } catch (Exception ce) {
                ce.fillInStackTrace();
            }
        } else {
            try (FileWriter writer = new FileWriter(file.getName())) {
                writer.write("Reversed Name is: " + new StringBuilder(mesh.name).reverse());
            } catch (Exception ce) {
                ce.fillInStackTrace();
            }
        }

        person.GetSteps();
        System.out.print(new StringBuilder(person.name).reverse());
        System.out.print(new StringBuilder(mesh.name).reverse());
    }
}