package Navetur;

public class Navetur {
    public static void main(String[] args) {

        // Creo Capitan
        Capitan elcap = new Capitan("Ramiro", "Fontan", "Aba3451");
        Capitan eldos = new Capitan("Pedro", "Capo", "ZZA354");

        // Creo un Yate
        Yate elUno = new Yate(elcap,150000,5000,2021,180,5);
        Yate duquesa = new Yate(eldos,60000, 2500,2019,70, 5);

        // Creo veleros
        Velero vela1 = new Velero(elcap, 70000,2500,2018,75.5, 4);
        Velero vela2 = new Velero(eldos, 155800, 7800, 2023, 180, 8);

        System.out.println(elUno);
        double alquiler = vela2.calcularAlquiler();

        if(vela2.evaluarTamaño(vela2.getCantidadMastiles())){
            System.out.println("EL velero es grande");
        } else {
            System.out.println("el velero es chico");
        }
        //System.out.println(alquiler);

        //Comparar yates
        if(elUno.compareTo(duquesa) > 0){
            System.out.println("ElUno es mayor que duquesa");
        } else if (elUno.compareTo(duquesa) < 0) {
            System.out.println("elUno es menor que duquesa");
        }else {
            System.out.println("Los dos yates son iguales");
        }
    }
}
