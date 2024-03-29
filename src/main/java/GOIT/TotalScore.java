package GOIT;

class TotalScore {
    public int sum(int[] scores) {
        int result = 0;
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            result += scores[index++];
        }
        return result;
    }
}

class TotalScoreTest {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore().sum(score));
    }
}
