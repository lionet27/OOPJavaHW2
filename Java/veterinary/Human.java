package veterinary;
import HW2.Illable;



public class Human implements Illable {

    public String name;
    private String dataBirthday;
    private String adress;
    private float telefone;
    private String pasport;

    public Human(String name, String dataBirthday, String adress, float telefone, String pasport) {
        this.name = name;
        this.dataBirthday = dataBirthday;
        this.adress = adress;
        this.telefone = telefone;
        this.pasport = pasport;
    }

    
    public Human(String name,float telefone) {
        this(name, null,null,telefone,null);
    }
    public Human(String name) {
        this.name = name;
    }
    
    public Human() {
        this(null);
    }    
    public float getTelefone() {
        return telefone;
    }
    public void setTelefone(float telefone) {
        this.telefone = telefone;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getDataBirthday() {
        return dataBirthday;
    }
    public void setDataBirthday(String dataBirthday) {
        this.dataBirthday = dataBirthday;
    }
    public String getPasport() {
        return pasport;
    }
    public void setPasport(String pasport) {
        this.pasport = pasport;
    }


    @Override
    public void getIll() {

    }

}
