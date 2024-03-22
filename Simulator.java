// Name: Israel Ogunsua
// Date: March 22 2024


import java.util.Random;
import java.util.ArrayList;
import java.util.List;

class Simulator {
    private Random random = new Random();
    private int processCounter = 0;
    int creationTime = 0; 
    public void startSimulation() {
        // List to represent the ready queue
        List<Process> readyQueue = new ArrayList<>();

      
        while (true) {
            // Call method to create processes with the same creation time stamp
            creationTime++;

            List<Process> newProcesses = createProcesses(creationTime);
            for (Process process : newProcesses) {
                if (process != null) {
                    process.setPid(processCounter++);
                    readyQueue.add(process);
                }



            }

            if ( newProcesses.size() >= 2  ){
                     System.out.println("loop done");
                    break;
            }
        }

        for(Process process :  readyQueue){
             System.out.println(process);
        }
    }

    private List<Process> createProcesses(int creationTime) {
        List<Process> newProcesses = new ArrayList<>();







        boolean createInteractive =(random.nextInt(10)==1);
        boolean createBatch = (random.nextInt(10)==1);

        if (createInteractive) {
            // Generate random burst, CPU time, and IO block time for interactive process
            int burst = generateRandomInRange(8, 12);
            int cpuTime = generateRandomInRange(16, 20);
            int ioBlock = generateRandomInRange(4, 6);
     
            newProcesses.add(new Process("Interactive", burst, ioBlock, cpuTime, creationTime));
        }

        if (createBatch) {
            // Generate random burst, CPU time, and IO block time for batch process
            int burst = generateRandomInRange(200, 300);
            int cpuTime = generateRandomInRange(400, 600);
            int ioBlock = generateRandomInRange(8, 12);
    
            newProcesses.add(new Process("Batch", burst, ioBlock, cpuTime, creationTime));
        }

        return newProcesses;
    }

    private int generateRandomInRange(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }
}

