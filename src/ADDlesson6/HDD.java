package ADDlesson6;

public class HDD {
    String name;
    int memory;
    String type;

    public HDD() {
    }

    public HDD(String name, int memory,  String type) {
        this.name = name;
        this.memory = memory;
        this.type = type;
    }

    public void infoHDD() {
        System.out.println("HDD:  " + "Name: " + name + " \t " + "Memory: " + memory + "\t" + "Type: " + type);
    }


}
