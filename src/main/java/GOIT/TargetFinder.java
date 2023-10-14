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



        // Лажа повна треба розібратись з лямбдою


        Collections.sort(targetDistances, Comparator.comparingInt(t -> t.distance));

        TargetDistance targetDistance = targetDistances.get(0);
        int closestTargetIndex = targetDistance.index;
        int[] resArray = targets[closestTargetIndex];

        return resArray;
    }


//    public void test(int[] aiCoords, int[][] targets) {
//
//        int[] target0 = targets[0];
//        int[] target1 = targets[1];
//        int[] target2 = targets[2];
//
//        double distance = Math.sqrt(Math.pow((target0[0] - aiCoords[0]), 2) + Math.pow((target0[1] - aiCoords[1]), 2));
//        double distance1 = Math.sqrt(Math.pow((target1[0] - aiCoords[0]), 2) + Math.pow((target1[1] - aiCoords[1]), 2));
//        double distance2 = Math.sqrt(Math.pow((target2[0] - aiCoords[0]), 2) + Math.pow((target2[1] - aiCoords[1]), 2));
//
//        int roundDis0 = (int) Math.round(distance);
//        int roundDis1 = (int) Math.round(distance1);
//        int roundDis2 = (int) Math.round(distance2);
//
//
//        List<Integer> targetListRes = new ArrayList<>();
//        targetListRes.add(roundDis0);
//        targetListRes.add(roundDis1);
//        targetListRes.add(roundDis2);
//
//        Collections.sort(targetListRes);
//
//        class TargetDistance {
//            int distance;
//            int index;
//
//            TargetDistance(int distance, int index) {
//                this.distance = distance;
//                this.index = index;
//            }
//        }
//
//        List<TargetDistance> targetList = new ArrayList<>();
//        targetList.add(new TargetDistance(roundDis0, 0));
//        targetList.add(new TargetDistance(roundDis1, 1));
//        targetList.add(new TargetDistance(roundDis2, 2));
//
//        Collections.sort(targetList, Comparator.comparingInt(t -> t.distance));
//
//        // Отримання інформації про те, з якого масиву ми отримали значення targetList.get(0)
//        TargetDistance closestTarget = targetList.get(0);
//        int closestTargetIndex = closestTarget.index;
//
//        // Отримання масиву за індексом без окремого методу
//        int[] closestTargetArray = targets[closestTargetIndex];
//
//        // Вивід інформації
//        System.out.println("Найближча мета: target" + closestTargetIndex);
//        System.out.println("Масив за індексом: " + Arrays.toString(closestTargetArray));
//    }


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
