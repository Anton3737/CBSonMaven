package GOIT;

import java.util.*;

public class TargetFinder {


    public int[] findTarget(int[] aiCoords, int[][] targets) {
        class TargetDistance {
            int distance;
            int index;

            public TargetDistance(int distance, int index) {
                this.distance = distance;
                this.index = index;
            }
        }
        List<TargetDistance> targetDistances = new ArrayList<>();
        int[] onceArray = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length; j++) {
                onceArray[j] = targets[i][j];
                double distanceOfTarget = Math.sqrt(Math.pow((onceArray[0] - aiCoords[0]), 2) + Math.pow((onceArray[1] - aiCoords[1]), 2));
                int roundDistance = (int) Math.round(distanceOfTarget);
                targetDistances.add(new TargetDistance(roundDistance, i));
            }
        }
        Collections.sort(targetDistances, Comparator.comparingInt(t -> t.distance));
        TargetDistance targetDistance = targetDistances.get(0);
        int closestTargetIndex = targetDistance.index;
        int[] resArray = targets[closestTargetIndex];
        return resArray;
    }
}

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

//        Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));

//        targetFinder.test(aiCoords, targets);

    }
}
