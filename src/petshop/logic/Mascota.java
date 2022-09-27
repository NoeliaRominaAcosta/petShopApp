
package petshop.logic;

public class Mascota {
    private int num_cliente;
    private String namePet;
    private String razaPet;
    private String colorPet;
    private String alergicPet;
    private String specialPet;
    private String obsPet;
    
    private Duenio unDuenio;
/*una mascota puede tener un solo dueño 1 a 1 dueño va de este lado, la mascota lo obtiene porqe mascota es el principal*/
    public Mascota() {
    }

    public Mascota(int num_cliente, String namePet, String razaPet, String colorPet, String alergicPet, String specialPet, String obsPet, Duenio unDuenio) {
        this.num_cliente = num_cliente;
        this.namePet = namePet;
        this.razaPet = razaPet;
        this.colorPet = colorPet;
        this.alergicPet = alergicPet;
        this.specialPet = specialPet;
        this.obsPet = obsPet;
        this.unDuenio = unDuenio;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public String getRazaPet() {
        return razaPet;
    }

    public void setRazaPet(String razaPet) {
        this.razaPet = razaPet;
    }

    public String getColorPet() {
        return colorPet;
    }

    public void setColorPet(String colorPet) {
        this.colorPet = colorPet;
    }

    public String getAlergicPet() {
        return alergicPet;
    }

    public void setAlergicPet(String alergicPet) {
        this.alergicPet = alergicPet;
    }

    public String getSpecialPet() {
        return specialPet;
    }

    public void setSpecialPet(String specialPet) {
        this.specialPet = specialPet;
    }

    public String getObsPet() {
        return obsPet;
    }

    public void setObsPet(String obsPet) {
        this.obsPet = obsPet;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }
     
}


