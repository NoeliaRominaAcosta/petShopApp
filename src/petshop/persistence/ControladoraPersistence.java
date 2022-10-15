
package petshop.persistence;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import petshop.logic.Duenio;
import petshop.logic.Mascota;
import petshop.persistence.exceptions.NonexistentEntityException;

public class ControladoraPersistence {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void save(Duenio duenio, Mascota mascota) {
      /*el duenio debe estar creado antes de asociarlo a la mascota*/
      /*create owner on db*/
      duenioJpa.create(duenio);
      mascoJpa.create(mascota);
    }

    public List<Mascota> traerMascotas() {
        return  mascoJpa.findMascotaEntities();
        //findMascotaEntities busca todos los registros de la tabla mascota y lo retorno
    }

    public void borrarMascota(int num_cliente) {
        try {
            //llamamos
            mascoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int num_cliente) {
       return mascoJpa.findMascota(num_cliente);
    }
    
    
}
