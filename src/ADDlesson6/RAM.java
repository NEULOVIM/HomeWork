package ADDlesson6;

public class RAM {
    String name;
    int memory;

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
