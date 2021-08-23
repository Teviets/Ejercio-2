/**
 * En esta clase accede a la vista y a la perrera, mediante esto se genera en si todo lo que se puede
 * realizar el programa en si
 * En esta clase se encuentra el metodo main
 */
class Controlador{

    public static void main(String[] args) {
        Perrera perrera = new Perrera();// Se asigna una perrera
        Vista vistita = new Vista();// Se asigna una nueva vista

        int opcion = 0;// Seguarda la opcion que el usuario podria escoger
        
        while (opcion != 9){
            opcion = vistita.menuPrincipal();

            switch (opcion){
                case 1:
                    perrera.mostrarFamilias();
                    break;
                case 2:
                    perrera.mostrarPerros();
                    break;
                case 3:
                    int indice = vistita.infoDeFam();
                    perrera.mostrarInfoFam(indice);
                    break;
                case 4:
                    int indicep = vistita.infoDePer();
                    perrera.mostrarInfoPer(indicep);
                    break;
                case 5:
                    int indiceFam = vistita.menuAsignacionFam();
                    int indicePer = vistita.menuAsignacionPerro();
                    String dec = vistita.menuAsignacionDes();
                    perrera.asignarPerros(indicePer, indiceFam, dec);
                    break;
                case 6:
                    int indPer = vistita.ingresarPerro();
                    perrera.agregarPerro(indPer);
                    break;
                case 7:
                    int hijotes = vistita.cHijosGran();
                    int hijitos = vistita.cHijosPe(); 
                    int indFam = vistita.ingresoFamilia();
                    String apell = vistita.apellidoFam();
                    perrera.agregarFam(indFam,apell,hijitos,hijotes);
                    break;
                case 8:
                    int indiFam = vistita.salidaFam();
                    perrera.quitarFam(indiFam);
                    break;
            }
        }
    }
}