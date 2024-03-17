package ADDlesson6;

public class TestComputer {
    public static void main(String[] args) {

        RAM ram = new RAM("Kingston", 16);
        HDD hdd = new HDD("Princeston", 1000, "Internal");


        Computer computer1 = new Computer(500, "Sumsung ");
        computer1.infoComputer();

        System.out.println();

        Computer computer2 = new Computer(1000, "HP",ram,hdd);
        computer2.infoComputer();
    }
}
