import IFileClient.FileClientFound;
import NameMesh.NameMesh;

static class Run implements Runnable {
    @Override
    public void run() {
        System.out.printf("%s\n", "Code has Been Run \n");
    }
}

void main() {

    Person person = new Person();
    NameMesh mesh = new NameMesh();
    Run run = new Run();

    if (String.class.toString().equals(person.name.getClass().toString())) {
        person.Get();

        FileClientFound files = new FileClientFound();
        File file = new File("name.txt");

        if (file.exists()) {
            try (FileWriter writer = new FileWriter(files.GetFileByName(file.getName()))) {
                writer.write("Reversed Name is: " + new StringBuilder(mesh.name).reverse());
                Thread th = new Thread(run);
                th.start();
            } catch (Exception ce) {
                ce.fillInStackTrace();
            } finally {
                System.out.printf("Cannot Name of File %s", file.getName());
            }
        } else {
            try (FileWriter writer = new FileWriter(file.getName())) {
                writer.write("Reversed Name is: " + new StringBuilder(mesh.name).reverse());

                Thread th = new Thread(run);
                th.start();
            } catch (Exception ce) {
                ce.fillInStackTrace();
            }
            finally {
                System.out.printf("Cannot Name of File %s", file.getName());
            }
        }

        person.GetSteps();
        System.out.print(new StringBuilder(person.name).reverse() + "\n");
        System.out.print(new StringBuilder(mesh.name).reverse() + "\n");
        Thread th = new Thread(run);
        th.start();
    }
}