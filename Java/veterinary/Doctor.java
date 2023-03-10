package veterinary;

public class Doctor extends Human{
    
        public Doctor(String name, String dataBirthday, String adress, float telefone, String pasport){
        super(name, dataBirthday, adress, telefone, pasport);
    } 

    public Doctor(String name, float telefone) {
        super(name, telefone);
    }
        public Doctor(String name) {
        super(name);
    }

        public Doctor() {
    }

    public void examineAnimal(){
        System.out.println("Обследовал животное");
    }


    public void cureAnimal(){
        System.out.println("Полечил животное");
    }

    public void writeRecipeDrugs(){
        System.out.println("Выписал рецепт на лекарства");
    }

}
