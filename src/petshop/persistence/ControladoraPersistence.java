
package petshop.persistence;

import petshop.logic.Duenio;
import petshop.logic.Mascota;

public class ControladoraPersistence {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void save(Duenio duenio, Mascota mascota) {
      /*el duenio debe estar creado antes de asociarlo a la mascota*/
      /*create owner on db*/
      duenioJpa.create(duenio);
      mascoJpa.create(mascota);
    }
    
    
}
