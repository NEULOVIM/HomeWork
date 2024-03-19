package ADDlesson6;

public class RAM {
   private String name;
   private int memory;

    public RAM() {
    }


    public RAM(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }

    public void infoRAM() {
        System.out.println("RAM: " + "Name: " + name + " \t " + "Memory: " + memory);
    }
}
