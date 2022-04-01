import java.util.*;

public class Agenda {
    private List<Contacto> contactos = new LinkedList<>();

    public void añadir(Contacto contacto) {
        contactos.add(contacto);
    }

    public void mostrar() {
        for (Contacto contacto : contactos) {
            System.out.println("Contacto: " + contacto.getNombre()+contacto.getTelefono()+contacto.getDireccion()+contacto.getCorreoElectronico());
        }
        Collections.sort(contactos, Comparator.comparing(contacto ->contacto.getNombre()));


    }

}
