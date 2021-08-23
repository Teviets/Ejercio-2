import java.util.Scanner;

import java.util.Arrays;

import java.util.Random;

/**
 * En esta clase se contruye un perro con diversidad de valoress necesarios e importantes registrados en la perrera, 
 * se asignan las razas que son peligrosas y otras conocidas.
 * 
 * -Se calcula los años cronoligicamente y se transforman en años humanos
 * - Se le asigna si es peligroso o no
 * - se detecta si la raza del perro esta dentro de las conocidas o no, si no se declara la raza mestiza
 * - Se imprime toda la informacion del perro
 * - Los respectivos  getters que retornan la informacion relevantes de sus propiedades
 * 
 * @author Sebastian Estrada Tuch
 * @since 22/08/2021
 * @version 1.0
 */
class Perro{
    private String nombre;// Guarda el nombre que tiene el perro
    private double edadPe;// Guarda la edad cronologica que tiene el perro
    private double edadHu;// Guarda la edad del perro en años humanos
    private int salud;// Guarda el estatus de salud que el perro tiene
    private String raza;// Guarda la raza que es el perro
    private Boolean peligroso = false;// Se guarda si el perro es peligroso o no
    private String size;// Guarda la informacion del tamaño que el perro tiene
    private String[] razasPerligrosas = {"pit bull terrier" , "American Stafforshire Terrier" , "Tosa Inu" , "Dogo Argentino",
                                         "Dogo Guatemalteco" , "Fila Brasileño", "Presa Canario" , "Dóberman" , "Gran Perro Japonés",
                                         "Mastín napolitano", "Presa Mallorqui", "Dogo de Burdeos" , "Bulimastif", "Bull terrier Inglés",
                                         "Bulldog Americano", "Rhodesiano", "Rottweiler"};// Se guardan las razas peligrosas
    private String[] razasConocidas = {"Golden Retriver", "Labrador", "Chihuahua", "Galgo", "Pug", "Gran Danés", "San Bernardo", "Mastin Español",
                                        "Basset Hound", "Shar pei", "Akita inu", "Bloodhound", "Matin del pirineo", "Samoyedo",
                                        "Pekines", "Terranova", "Chow Chow"};// Se guardan los perros que son manzos

    private Scanner scan = new Scanner(System.in);// Se guarda el scanner con el que se declaran los valores del perro
    private Random rand = new Random();// Con esta variable se genera un dato aleatorio en el que se genera la salud del perro

    /**
     * Este es el primer metodo constructor en el que el usuario introduce la informacion que el perro tiene
     */
    public Perro() {
        salud = rand.nextInt(100);
        System.out.println("¿Cual es el nombre al que responde el perro?\n");
        nombre = scan.next();
        System.out.println("¿Cuantos años tiene el perro cronologicamente? (En años, Ejemplo: 1, 10, 0.5)\n");
        edadPe = scan.nextDouble();
        System.out.println("¿Que raza es el perro?\n");
        raza = scan.next();
        System.out.println("¿De que tamaño es el perro? (Pequeño, Mediano, Grande)\n");
        size = scan.next();
        System.out.println("\n\n");
        calculoEdad();
        perroPeligrosoONo();
        deteccionDeRaza();
    }

    /**
     * Este es el metodo constructor con el que mediante otra forma se ingresa y se generan los datos del perro
     * @param nom
     * @param edadP
     * @param sld
     * @param rza
     * @param tam
     */
    public Perro(String nom,Double edadP, int sld, String rza, String tam){
        nombre = nom;
        edadPe = edadP;
        salud = sld;
        raza = rza;
        size = tam;
        calculoEdad();
        perroPeligrosoONo();
        deteccionDeRaza();
    }

    /**
     * En este metodo se calcula la edad en años humanos utilizando la edad en tiempo cronologico
     * @return retorna la variable edadHu que guarda los años humanos vividos por el perro
     */
    private double calculoEdad(){
        double edadPer = edadPe;
        edadPer = edadPer * 365;
        edadHu = 16*(Math.log(edadPer)) + 31;
        edadHu = edadHu / 365;
        return edadHu;

    }
    /**
     * En este metodo se define si el perro es o no peligroso
     */
    private void perroPeligrosoONo(){
        if (Arrays.asList(razasPerligrosas).contains(raza) == true){
            peligroso = true;
        }else if (Arrays.asList(razasPerligrosas).contains(raza) == false){
            peligroso = false;
        }
    }
    /**
     * En este metodo se busca si la raza ingresada pro el usuario esta dentro de los perros conocidos o peligrosos.
     */
    private void deteccionDeRaza (){
        if (Arrays.asList(razasConocidas).contains(raza) == false && Arrays.asList(razasPerligrosas).contains(raza) == false){
            raza = "Mestizo";
        }
    }

    /**
     * En este metodo se imprime en consola la informacion relevante que el perro posee
     */
    public void perroInfo(){
        System.out.println("Nombre: " + nombre + "\n"+
                            "Tiene " + edadPe + " años vividos " + "que son " + edadHu + " años humanos\n" +
                            "Cuenta con un estatus de salud de " + salud + "\n"+ 
                            "Su raza es "+ raza + "\n");
        if (peligroso == true){
            System.out.println("Se considera peligroso\n");
        }else if (peligroso == false){
            System.out.println("No se considera peligroso\n");
        }
        System.out.println("Y es de tamaño: "+ size);
    }

    /**
     * Este metodo es un getter del peligro
     * @return retorna un booleano que informa si es o no peligroso este perro
     */
    public Boolean getPeligroso(){
        return peligroso;
    }
    /**
     * Este metodo es un getter del tamaño que tiene el perro
     * @return retorna el tamaño que tiene el perro
     */
    public String getSize (){
        return size;
    }
    /**
     * Este metodo es un getter del nombre del perro
     * @return retorna un String que contiene el nombre al que responde el perro
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Este metodo es un getter de la raza que tiene le perro
     * @return retorna un String que contiene la raza con la que se ha identificado al perro
     */
    public String getRaza(){
        return raza;
    }
}