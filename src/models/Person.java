package models;

public class Person {
    
    private String name;
    private int age;
    private int[] notas;

    public Person(String name, int age, int[] notas) {
        this.name = name;
        this.age = age;
        this.notas = notas;
    }

    public int[] getNotas() {
        return notas;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Personas{name='" + name + "', age=" + age + ", promedio=" + getPromedio() + " valueName=" + valueName() + "}";
    }

    public int getPromedio(){
        //calculo del promedio de las notas
        //suma de las notas / cantidad de notas
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public int valueName(){
        int value = 0;
        for (int i = 0; i < name.length(); i++) {
            char letra = name.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                value += 5;
            } else {
                value += age;
            }
        }
        return value;   
    }
}
