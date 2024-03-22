import java.util.Random;
// Name: Israel Ogunsua
// Date: March 22 2024

class Process{
    private String type;
    private int pid;
    private int burst;
    private int ioBlock;
    private int cpuTime;
    private int creationTime;

    public Process(String type, int burst, int ioBlock, int cpuTime, int creationTime) {
        this.type = type;
        this.burst = burst;
        this.ioBlock = ioBlock;
        this.cpuTime = cpuTime;
        this.creationTime = creationTime;
    }

    public String getType() {
        return type;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getBurst() {
        return burst;
    }

    public int getIoBlock() {
        return ioBlock;
    }

    public int getCpuTime() {
        return cpuTime;
    }

    public int getCreationTime() {
        return creationTime;
    }

    @Override
    public String toString() {
        return "Process:\n" +
                "Type: " + type + "\n" +
                "PID: " + pid + "\n" +
                "Burst: " + burst + "\n" +
                "IO Block Time: " + ioBlock + "\n" +
                "CPU Time: " + cpuTime + "\n" +
                "Creation Time Stamp: " + creationTime + "\n";
    }
}
