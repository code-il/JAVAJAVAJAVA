import java.util.Scanner;

class Job {
    String name;
    int burstTime;
    int arrivalTime;
    int remainingTime;

    Job(String name, int burstTime, int arrivalTime) {
        this.name = name;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
        this.remainingTime = burstTime;
    }
}

public class os6roundrobin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of jobs: ");
        int numJobs = scanner.nextInt();

        Job[] jobs = new Job[numJobs];
        for (int i = 0; i < numJobs; i++) {
            System.out.print("Enter job name: ");
            String name = scanner.next();
            System.out.print("Enter burst time: ");
            int burstTime = scanner.nextInt();
            System.out.print("Enter arrival time: ");
            int arrivalTime = scanner.nextInt();

            jobs[i] = new Job(name, burstTime, arrivalTime);
        }

        System.out.print("Enter time quantum: ");
        int timeQuantum = scanner.nextInt();

        scanner.close();

        executeRoundRobin(jobs, timeQuantum);
    }

    public static void executeRoundRobin(Job[] jobs, int timeQuantum) {
        int numJobs = jobs.length;
        int[] remainingTime = new int[numJobs];
        boolean[] completed = new boolean[numJobs];
        int currentTime = 0;
        int completedJobs = 0;

        for (int i = 0; i < numJobs; i++) {
            remainingTime[i] = jobs[i].burstTime;
        }

        while (completedJobs < numJobs) {
            for (int i = 0; i < numJobs; i++) {
                if (!completed[i] && jobs[i].arrivalTime <= currentTime) {
                    if (remainingTime[i] <= timeQuantum) {
                        currentTime += remainingTime[i];
                        System.out.println(jobs[i].name + " (Finished)");
                        completedJobs++;
                        completed[i] = true;
                    } else {
                        currentTime += timeQuantum;
                        remainingTime[i] -= timeQuantum;
                        System.out.println(jobs[i].name + " (Remaining Time: " + remainingTime[i] + ")");
                    }
                }
            }
        }
    }
}
