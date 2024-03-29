
package petshop.logic;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import petshop.persistence.ControladoraPersistence;

public class Controladora {
  ControladoraPersistence controlPersis = new ControladoraPersistence();

    public void save(String nameOfPet, String razaOfPet, String color, String observations, String phone, String alergic, String special, String owner) {
       Duenio duenio = new Duenio();
       duenio.setName(owner);
       duenio.setTelOwner(phone);
       Mascota mascota = new Mascota();
       mascota.setNamePet(nameOfPet);
       mascota.setRazaPet(razaOfPet);
       mascota.setColorPet(color);
       mascota.setAlergicPet(alergic);
       mascota.setSpecialPet(special);
       mascota.setObsPet(observations);
       mascota.setUnDuenio(duenio);
       
       /*la logica llama a la persistencia para crearlos*/
       
       controlPersis.save(duenio,mascota);
       
       /*informa que se guardo con exito*/
       JOptionPane optionPane = new JOptionPane("Guardado exitoso");
       optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
       JDialog dialog = optionPane.createDialog("Exitoso");
       dialog.setAlwaysOnTop(true);
       dialog.setVisible(true);
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void deletePet(int num_cliente) {
       //controladora persistencia
       controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
       return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nameOfPet, String razaOfPet, String color, String owner, String observations, String phone, String alergic, String special) {
       masco.setNamePet(nameOfPet);
       masco.setColorPet(color);
       masco.setAlergicPet(alergic);
       masco.setRazaPet(razaOfPet);
       masco.setSpecialPet(special);
       masco.setObsPet(owner);
       //modifico mascota
       controlPersis.modificarMascota(masco);
       //seteo nuevos valores de dueño
       Duenio duenio = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
       duenio.setTelOwner(owner);
       duenio.setName(phone);
       //llamar al modificar dueño
       this.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int id_duenio) {
       return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio duenio) {
        controlPersis.modificarDuenio(duenio);
    }
    
}
