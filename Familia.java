/**
 * Esta clase es utilizada para declarar una familia, junto con sus caracteristicas y realizar posibles acciones 
 * que posee cada familia en la perrera
 * - Contruir una familia
 * - Generar otra familia con otro metodo
 * - Imprimir la informacion de la familia
 * - Asignarse un perro
 * - Retornar diversos valores los cuales se consideran importantes
 * 
 * @author Sebastian Estrada Tuch
 * @since 22/08/2021
 * @version 1.0
 */
class Familia{
    private int hijosPe;// Guarda la cantidad de hijos pequeños que posee la familia
    private int hijosGran;// Guarda la cantidad de hijos mayores a 10 que posee la familia
    private String apellidos;// Guarda los 2 apellidos que posee la familia
    private Perro[] perrosObtenidos = new Perro[4];// Guarda los 4 posibles perros que pueden obtener


    /**
     * Este es el segundo metodo constuctor ayuda a generar otra forma de generar familias
     * @param hp
     * @param hg
     * @param ap
     */
    public Familia (int hp , int hg, String ap){
        hijosGran = hg;
        hijosPe = hp;
        apellidos = ap;
    }

    /**
     * este metodo se imprime en la consola para toda la informacion de la familia
     */
    public void infoFam(){
        int sumaHijos = hijosGran + hijosPe;
        System.out.println("La familia " + apellidos + "\n"+
                            "Cuenta con " + sumaHijos + " hijos"+ "\n");
        for (int i = 0; i<=3; i++){
            if (perrosObtenidos[i] != null){
                System.out.println(i + ".- " + perrosObtenidos[i].getNombre());
            }else if (perrosObtenidos[i] == null){
                System.out.println(i + ".- Null");
            }
        }
        System.out.println("\n\n");
    }
    /**
     * En este metodo se asigna a la familia un perro dependiendo de si la familia desea o no al perro
     * @param p
     * @param des
     */
    public void asignacionFinal(Perro p,String des){
            if ((hijosPe > 0 && p.getSize() == "Pequeño") || (hijosPe > 0 && p.getRaza() == "Labrador")){
                asignarPerro(p);
                System.out.println("Se le ha asignado el perro\n");
            }else if ((p.getPeligroso() != true) && (hijosPe == 0) && (hijosGran>0 && p.getSize()=="Pequeño") || (hijosGran>0 && p.getSize() == "Mediano")){
                asignarPerro(p);
                System.out.println("Se le ha asignado el perro\n");
            }else if (hijosGran == 0 && hijosPe == 0){
                asignarPerro(p);
                System.out.println("Se le ha asignado el perro\n");
            }else {
                System.out.println("\nSu familia no califica para la adopcion del perro\n");
            }

    }
    /**
     * En este metodo se asigna en si el perro a un espacio de las posibles mascotas que puede tener la familia
     * @param p
     */
    public void asignarPerro(Perro p){
        if (perrosObtenidos[0] == null){
            perrosObtenidos[0] = p;
        }else if (perrosObtenidos[1] == null){
            perrosObtenidos[1] = p;
        }else if (perrosObtenidos[2] == null){
            perrosObtenidos[2] = p;
        }else if (perrosObtenidos[3] == null){
            perrosObtenidos[3] = p;
        }
    }
    /**
     *  Este metodo es un getter de los apellidos de la familia
     * @return retorna el String que guarda los dos apellidos de la familia
     */
    public String getApellidos(){
        return apellidos;
    }
    /**
     * Este metodo es un getter de la cantidad de hijos pequeños
     * @return retorna la variable que guarda la cantidad de hijos pequeños
     */
    public int getHijosPe(){
        return hijosPe;
    }
    /**
     * Este metodo es un getter de la cantidad de hijos grandes
     * @return retorna el valor de la cantidad de hijos grandes
     */
    public int getHijosGran(){
        return hijosGran;
    }
}