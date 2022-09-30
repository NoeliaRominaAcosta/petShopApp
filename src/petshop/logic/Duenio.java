package petshop.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_duenio;
    private String name;
    private String telOwner;

    public Duenio() {
        
    }
    /*alt + insert constructor vacio*/

    public Duenio(int id_duenio, String name, String telOwner) {
        this.id_duenio = id_duenio;
        this.name = name;
        this.telOwner = telOwner;
    }
    /*alt + insert y seleccionamos atrib*/
    /*alt + insert getter and setter seleccionamos todo*/

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelOwner() {
        return telOwner;
    }

    public void setTelOwner(String telOwner) {
        this.telOwner = telOwner;
    }
}