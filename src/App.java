import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person[] personas = {
            new Person("Alice", 30, new int[]{10, 15, 20}),
            new Person("Bob", 25, new int[]{15, 15, 20}),
            new Person("Charlie", 35, new int[]{10, 10, 10}),
            new Person("David", 20, new int[]{20, 15, 20}),
            new Person("Eve", 28, new int[]{20, 10, 20}),
        };

        //imprimir
        //ordenar
        //Imprimir

        for (Person person : personas) {
            System.out.println(person);
        }

        PersonController controller = new PersonController();
        controller.sortPersonByAge(personas);
        System.out.println("Personas ordenadas por edad:");
        for (Person person : personas) {
            System.out.println(person);
        }

        PersonController controller2 = new PersonController();
        controller2.sortPersonByName(personas);
        System.out.println("Personas ordenadas por nombre:");
        for (Person person : personas) {
            System.out.println(person);
        }

        PersonController controller3 = new PersonController();
        controller3.sortPersonByPromedio(personas);
        System.out.println("Personas ordenadas por promedio:");
        for (Person person : personas) {
            System.out.println(person);
        }
        PersonController controller4 = new PersonController();
        controller4.sortPersonByNameValue(personas);
        System.out.println("Personas ordenadas por valor del nombre:");
        for (Person person : personas) {
            System.out.println(person);
        }
    }
}
