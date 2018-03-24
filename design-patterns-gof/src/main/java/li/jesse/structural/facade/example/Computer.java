package li.jesse.structural.facade.example;

public class Computer
{
    public void startComputer()
    {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        long BOOT_ADDRESS = 100;
        long BOOT_SECTOR = 1000;
        int SECTOR_SIZE = 10;

        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}
