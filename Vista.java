import java.util.Scanner;
/**
 * En esta clase se imprimen todas las opciones o lo relevante para el programa
 * - Se imprime el menu principal
 * - Se pregunta que familia es la que se desea conocer la informacion
 * - Se pregunta cual es el perro al que se le desea conocer su informacion
 * - Se pregunta a que jaula se va a ingresar a un perro
 * - Se pregunta a que espacio se le asignara el lugar a una familia mientras se le asigna un perro
 * - Se pregunta que familia salio
 * - Se pregunta a que familia se le quiere asignar un perro
 * - Se pregunta que perro se le asignara a la familia anterios
 * - Se pregunta si la familia desea o no adoptar a este perro
 * 
 * @author Sebastian Estrada Tuch
 * @since 22/08/2021
 * @version 1.0
 */
class Vista{
    private Scanner scan;// Este scanner es el que se utiliza para guardar la informacion de opcion, indiceFam e indicePer
    private int opcion = 0; // Guarda la opcion que escogio el usuario para el menu
    private int indiceFam = 0; // Guarda el indice que el usuario desea para la familia
    private int indicePer = 0; // Guarda el indice que el usuario desea para el perro
    /**Este es el metodo constructor en el que se declara un nuevo Scanner */
    public Vista (){
        scan = new Scanner (System.in);
    }
    /**
     * En este metodo se imprime el menu y se busca declarar la opcion escogida por el usuario
     * @return retorna el entero de la variable opcion
     */
    public int menuPrincipal(){
        int opcion;
        System.out.println("1. Mostrar el indicie de las familias\n" + 
                           "2. Mostrar el indice de los perros en la perrera\n"+
                           "3. Mostrar informacion de familia\n" +
                           "4. Mostrar informacion de perros\n"+
                           "5. Asignar mascota a la familia\n"+
                           "6. Ingresar nuevos perros\n"+
                           "7. Ingresar nuevas familias\n"+
                           "8. Salio una familia\n"+
                           "9. Salir\n\n");
        opcion = scan.nextInt();
        return opcion;
    }
    /**
     * En este metodo pregunta al usuario que indice de familia a la cual se desea conocer su informacion
     * @return retorna el int del indice
     */
    public int infoDeFam(){
        System.out.println("Ingrese el indice de la familia a la cual desea conocer su informacion: \n");
        indiceFam = scan.nextInt();
        return indiceFam;
    }
    /**
     * En este metodo pregunta al usuario que indice de perro a la cual se desea conocer su informacion
     * @return retorna el int del indice
     */
    public int infoDePer(){
        System.out.println("Ingrese el indice del perro que desea conocer su informacion: \n");
        indicePer = scan.nextInt();
        return indicePer;
    }
    /**
     * En este metodo se pregunta a que jaula se puede ingresar un perro
     * @return se retorna el numero de jaula a la que se va a ingresar
     */
    public int ingresarPerro(){
        System.out.println("\nIngrese la jaula a la que se debe ingresar el perro\n");
        indicePer = scan.nextInt();
        return indicePer;
    }
    /**
     * En este metodo se le asigna un asiento a la familia
     * @return retorna el numero de asiento a la que la familia va a ingresar
     */
    public int ingresoFamilia(){
        System.out.println("\nIngrese el numero de familia que ingreso\n");
        indiceFam = scan.nextInt();
        return indiceFam;
    }
    /**
     * En este metodo se verifica el asiento que ocupaba la familia que salio
     * @return retorna el numero de asiento que dejo libe la familia
     */
    public int salidaFam(){
        System.out.println("\nIngrese el numero de la familia que se fue:\n");
        indiceFam = scan.nextInt();
        return indiceFam;
    }
    /**
     * En este metodo se pregunta el numero de asiento de la familia que va a adoptar
     * @return retorna el numero de asiento que tiene la familia
     */
    public int menuAsignacionFam(){
        System.out.println("Ingrece el indice de la familia que desea adoptar un perro temporal\n");
        indiceFam = scan.nextInt();
        return indiceFam;
    }
    /**
     * En este metodo se pregunta el numero de jaula que va a adoptar la familia
     * @return retorna el numero de jaula que tiene el perro
     */
    public int menuAsignacionPerro(){
        System.out.println("\nIngrese el indice del perro deseado\n");
        indicePer = scan.nextInt();
        return indicePer;
    }
    /**
     * En este metodo se pregunta a la familia si quiere o no adoptar al perro
     * @return retorna la desicion tomada por la familia
     */
    public String menuAsignacionDes(){
        System.out.println("\nEsta seguro que desea adoptar a este perro (Si o No)\n");
        String descision = scan.next();
        return descision;
    }

    /**
     * En este metodo se pregunta que apellidos tiene la familia
     * @return retorna una string con los apellidos de la familia
     */
    public String apellidoFam (){
        System.out.println("¿Cuales son los apellidos de la familia?\n");
        String apel = scan.nextLine();
        return apel;
    }
    /**
     * En este metodo se pregunta la cantidad de hijos mayores a 10 años
     * @return retorna un int que respresenta la cantidad de hijos grandes
     */
    public int cHijosGran(){
        System.out.println("¿Cuantos hijos mayores a 10 años hay en su familia?\n");
        int hijote = scan.nextInt();
        return hijote;
    }
    /**
     * En etes metodo se pregunta al usuario la cantidad de hijos menores a 10 años
     * @return retorna un  int que respresenta la cantidad de hijos pequeños
     */
    public int cHijosPe() {
        System.out.println("¿Cuantos hijos menores de 10 años hay en su familia?\n");
        int hijito = scan.nextInt();
        return hijito;
    }
    
}