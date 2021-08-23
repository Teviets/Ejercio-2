/**
 * En esta clase se relacionan las posibles acciones que va a tener el perro y la familia dentro de las cuales estan
 * - mostrar las familias registradas
 * - mostrar a los perros procesados
 * - mostrar la informacion de la familia
 * - mostrar la informacion de un perro
 * - registrar una familia
 * - procesar a un perro
 * - Eliminar a otra familia
 * - Asignar un perro a una familia
 * 
 * @author Sebastian Estrada Tuch
 * @since 22/08/2021
 * @version 1.0
 */
class Perrera{
    private Familia[] familias = new Familia[15];// Guarda un cupo limite de 15 familias
    private Perro[] perros = new Perro[60]; // Guarda el cupo limite de perros procesados

    /**
     * En este metodo constructor se declaran 3 familias y 3 perros para tener desde un principio en la perrera
     */
    public Perrera(){
        familias[0] = new Familia(0,0,"Kent Rogers");
        familias[1] = new Familia(1,0,"Parker Stark");
        familias[2] = new Familia(0,1,"Banner Wayne");
        perros[0] = new Perro("Firulais", 2.0, 80, "Golden Retriver" , "Mediano");
        perros[1] = new Perro("Pilin", 5.0, 100, "Dóberman" , "Grande");
        perros[2] = new Perro("Lola",0.5,100,"Coquer","Pequeño");
    }

    /**
     * En este metodo se imprimen en una lista los apellidos de las familias registradas
     * a los espacio de familias que estan vacios se declaran como null, se indica
     * el indice con el que se identifican
     */
    public void mostrarFamilias(){
        for (int i = 0; i <= 14; i++){
            if (familias[i] != null){
                System.out.println(i+".- " + familias[i].getApellidos() + "\n");
            }else if (familias[i] == null){
                System.out.println(i+".- Null");
            }
        }
    }
    /**
     * En este metodo se muestran en una lista los nombres de los perros y las jaulas vacias
     * se muestran como null, se les indica el indice con lo que se identifican
     */
    public void mostrarPerros(){
        for (int i =0; i<=59; i++){
            if(perros[i] != null){
                System.out.println(i + ".- " + perros[i].getNombre() + "\n");
            }else if (perros[i] == null){
                System.out.println(i + ".- Null");
            }
        }
    }


    /**
     * En este meteodo dependiendo de i que es su indice se busca imprimir la informacion de la familia
     * @param i
     */
    public void mostrarInfoFam(int i){
        familias[i].infoFam();
    }
    /**
     * En este meteodo dependiendo de i que es su indice se busca imprimir la informacion del perro
     * @param i
     */
    public void mostrarInfoPer(int i){
        perros[i].perroInfo();
    }

    /**
     * Con este metodo se agrega una familia a los espacios en la perrera
     * @param i
     * @param ape
     * @param hijPe
     * @param hijGran
     */
    public void agregarFam(int i,String ape, int hijPe, int hijGran){
        familias[i] = new Familia(hijPe,hijGran,ape);
    }
    /**
     * En este metodo se quita un familia dependiendo de su indice
     * @param i
     */
    public void quitarFam(int i){
        familias[i] = null;
    }
    /**
     * En este metodo se procesa a un perro
     * @param i
     */
    public void agregarPerro(int i){
        perros[i] = new Perro();
    }

    /**
     * En este metodo se asigna a un perro a una familia
     * @param indPe
     * @param indFam
     * @param dec
     */
    public void asignarPerros(int indPe, int indFam, String dec){
        familias[indFam].asignacionFinal(perros[indPe], dec);
        perros[indPe] = null;
    }
}