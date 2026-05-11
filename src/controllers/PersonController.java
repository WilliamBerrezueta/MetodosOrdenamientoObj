package controllers;

import models.Person;

public class PersonController {
    
    //metodo que ordena un arreglo de personas por edad
    //con metodo de insercion
    public void sortPersonByAge(Person[] personas) {

        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getAge() > aux.getAge()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;

        }
    }

    public void sortPersonByName(Person[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getName().compareTo(aux.getName()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;

        }
    }
    //metodo ordena las personas segun el promedio de sus notas con seleccion
    public void sortPersonByPromedio(Person[] personas) {
        for (int i = 0; i < personas.length; i++) {
            int indice = i;
            for (int j = i + 1; j < personas.length; j++) {
                //comparacion para actualizar el inidce
                if (personas[j].getPromedio() < personas[indice].getPromedio()) {
                    indice = j;
                }
            }
            Person aux = personas[i];
            personas[i] = personas[indice];
            personas[indice] = aux;
        }
    }
    // ordenar el arreglo de personas por un valor de su nombre
    //el valor del nombre sera la cantidad de letras del nombre
    //donde la vocales valen 5
    //consonantes valen el valor de de la edad
    //ej: juan 20        ej; Ana 80
    //20+5+5+20= 50      80+5+5= 90
    public void sortPersonByNameValue(Person[] personas){
        
        for (int i = 0; i < personas.length; i++) {
            int indice = i;
            for (int j = i + 1; j < personas.length; j++) {
                //comparacion para actualizar el inidce
                if (personas[j].valueName() < personas[indice].valueName()) {
                    indice = j;
                }
            }
            Person aux = personas[i];
            personas[i] = personas[indice];
            personas[indice] = aux;
        }
        



    }   
}

