import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contacto contacto1 = new Contacto("Alba", "633453212", "alba@gmail.com", "Calle la rosaleda 21,2oB");
        Contacto contacto2 = new Contacto("Juan","62232321","Juan@hotmail.es",null);


             Scanner escaneado =  new Scanner(System.in);
        System.out.println("AGENDA");
        System.out.println("Press 0. Volver atras");
        System.out.println("Press 1. Mostrar contactos");
        System.out.println("Press 2. Añadir contacto");
        System.out.println("Press 3. Eliminar un contacto");
        System.out.println("Press 4. Modificar un contacto");
        System.out.println("Press 5. Cargar contactos");
        System.out.println("Press 6. Eliminar todos los contactos");
        int eleccionSwitch=0;
        switch (eleccionSwitch){
            case 0:
                System.out.println("No hay donde volver");
                break;
            case 1:
                System.out.println("Contactos");
                Agenda.mostrar
                break;
            case 2:
                System.out.println("Añade un contacto");
                Agenda.añadir
                break;
            case 3:
                System.out.println("Elimina un contacto");

        }
    }


}
