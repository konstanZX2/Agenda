import java.util.*;

public class Agenda {
    private List<Contacto> contactos = new LinkedList<>();

    private void loadContacts(){
        contactos.add(new Contacto("Alba", "633453212", "alba@gmail.com", "Calle la rosaleda 21,2oB");
    }

    public void añadirContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public Agenda(){
        mostrarContactos();
        Collections.sort(contactos, Comparator.comparing(contacto ->contacto.getNombre()));
    }

    public void quitarContactos(Contacto contacto){
        contactos.remove(contacto);
    }

    public Contacto borrarContacto(int index){
        return contactos.get(index);
    }
    public void update(Contacto)


    public void mostrarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println("Contacto: " + contacto.getNombre()+contacto.getTelefono()+contacto.getDireccion()+contacto.getCorreoElectronico());
        }
        Collections.sort(contactos, Comparator.comparing(contacto ->contacto.getNombre()));


    }


}
