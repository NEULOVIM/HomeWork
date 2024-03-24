package Task2;

public class Workers {
    public static void main(String[] args) {
        Emploee emploee = new Emploee();
        Accauntant accauntant = new Accauntant();
        Director director = new Director();


        emploee.sendJobTitle();
        director.sendJobTitle();
        accauntant.sendJobTitle();
    }
}
