import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person[] personas = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("David", 20),
            new Person("Eve", 28),
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
        
    }
}
