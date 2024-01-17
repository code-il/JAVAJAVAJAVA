import java.util.ArrayList;
import java.util.Collections;

public class os10all{
    public static int sstfDiskScheduling(ArrayList<Integer> requestQueue, int currentPosition) {
        ArrayList<Integer> sortedQueue = new ArrayList<>(requestQueue);
        Collections.sort(sortedQueue);

        int totalSeekTime = 0;
        while (!sortedQueue.isEmpty()) {
            int closestRequest = sortedQueue.get(0);
            int seekDistance = Math.abs(closestRequest - currentPosition);
            totalSeekTime += seekDistance;
            currentPosition = closestRequest;
            sortedQueue.remove(0);
        }

        return totalSeekTime;
    }

    public static int scanDiskScheduling(ArrayList<Integer> requestQueue, int currentPosition, int maxCylinder) {
        Collections.sort(requestQueue);

        int totalSeekTime = 0;

        ArrayList<Integer> leftRequests = new ArrayList<>();
        ArrayList<Integer> rightRequests = new ArrayList<>();

        for (int request : requestQueue) {
            if (request < currentPosition) {
                leftRequests.add(request);
            } else {
                rightRequests.add(request);
            }
        }

        Collections.reverse(leftRequests);

        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> currentQueue = (i == 0) ? leftRequests : rightRequests;
            int direction = (i == 0) ? -1 : 1;

            for (int request : currentQueue) {
                int seekDistance = Math.abs(request - currentPosition);
                totalSeekTime += seekDistance;
                currentPosition = request;
            }
        }

        return totalSeekTime;
    }

    public static int cScanDiskScheduling(ArrayList<Integer> requestQueue, int currentPosition, int maxCylinder) {
        Collections.sort(requestQueue);

        int totalSeekTime = 0;

        ArrayList<Integer> leftRequests = new ArrayList<>();
        ArrayList<Integer> rightRequests = new ArrayList<>();

        for (int request : requestQueue) {
            if (request < currentPosition) {
                leftRequests.add(request);
            } else {
                rightRequests.add(request);
            }
        }

        leftRequests.add(0);
        rightRequests.add(maxCylinder);

        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> currentQueue = (i == 0) ? leftRequests : rightRequests;
            int direction = (i == 0) ? -1 : 1;

            for (int request : currentQueue) {
                int seekDistance = Math.abs(request - currentPosition);
                totalSeekTime += seekDistance;
                currentPosition = request;
            }
        }

        return totalSeekTime;
    }

    public static int lookDiskScheduling(ArrayList<Integer> requestQueue, int currentPosition) {
        Collections.sort(requestQueue);

        int totalSeekTime = 0;

        ArrayList<Integer> leftRequests = new ArrayList<>();
        ArrayList<Integer> rightRequests = new ArrayList<>();

        for (int request : requestQueue) {
            if (request < currentPosition) {
                leftRequests.add(request);
            } else {
                rightRequests.add(request);
            }
        }

        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> currentQueue = (i == 0) ? leftRequests : rightRequests;
            int direction = (i == 0) ? -1 : 1;

            for (int request : currentQueue) {
                int seekDistance = Math.abs(request - currentPosition);
                totalSeekTime += seekDistance;
                currentPosition = request;
            }
        }

        return totalSeekTime;
    }

    public static int cLookDiskScheduling(ArrayList<Integer> requestQueue, int currentPosition) {
        Collections.sort(requestQueue);

        int totalSeekTime = 0;

        ArrayList<Integer> leftRequests = new ArrayList<>();
        ArrayList<Integer> rightRequests = new ArrayList<>();

        for (int request : requestQueue) {
            if (request < currentPosition) {
                leftRequests.add(request);
            } else {
                rightRequests.add(request);
            }
        }

        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> currentQueue = (i == 0) ? leftRequests : rightRequests;
            int direction = (i == 0) ? -1 : 1;

            for (int request : currentQueue) {
                int seekDistance = Math.abs(request - currentPosition);
                totalSeekTime += seekDistance;
                currentPosition = request;
            }
        }

        return totalSeekTime;
    }

    public static void main(String[] args) {
        // Example queue of disk I/O requests
        ArrayList<Integer> requestQueue = new ArrayList<>();
        requestQueue.add(98);
        requestQueue.add(183);
        requestQueue.add(37);
        requestQueue.add(122);
        requestQueue.add(14);
        requestQueue.add(124);
        requestQueue.add(65);
        requestQueue.add(67);

        int initialPosition = 53;
        int maxCylinder = 199; // Adjust this value if needed

        int totalSeekTimeSSTF = sstfDiskScheduling(new ArrayList<>(requestQueue), initialPosition);
        int totalSeekTimeSCAN = scanDiskScheduling(new ArrayList<>(requestQueue), initialPosition, maxCylinder);
        int totalSeekTimeCSCAN = cScanDiskScheduling(new ArrayList<>(requestQueue), initialPosition, maxCylinder);
        int totalSeekTimeLOOK = lookDiskScheduling(new ArrayList<>(requestQueue), initialPosition);
        int totalSeekTimeCLOOK = cLookDiskScheduling(new ArrayList<>(requestQueue), initialPosition);

        System.out.println("SSTF Disk Scheduling:");
        System.out.println("Total Seek Time: " + totalSeekTimeSSTF);

        System.out.println("SCAN Disk Scheduling:");
        System.out.println("Total Seek Time: " + totalSeekTimeSCAN);

        System.out.println("C-SCAN Disk Scheduling:");
        System.out.println("Total Seek Time: " + totalSeekTimeCSCAN);

        System.out.println("LOOK Disk Scheduling:");
        System.out.println("Total Seek Time: " + totalSeekTimeLOOK);

        System.out.println("C-LOOK Disk Scheduling:");
        System.out.println("Total Seek Time: " + totalSeekTimeCLOOK);
    }
}
