package GOIT;

import java.util.*;

public class QuarkeTrack {

    private  int[] lines;

    public QuarkeTrack(int[] lines) {
        this.lines = lines;
    }

    public int[] getLines() {
        return lines;
    }

    public void setLines(int[] lines) {
        this.lines = lines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuarkeTrack that = (QuarkeTrack) o;

        return Arrays.stream(lines).sum() == Arrays.stream(that.lines).sum();

    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.stream(lines).sum());
    }
}

class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};  // довжина пробіжки  за раунд  9
        int[] track2Data = {3, 5, 4};  // довжина пробіжки  за раунд  12
        int[] track3Data = {1, 5, 3};  // довжина пробіжки  за раунд  9

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        //false
        System.out.println("false");
        System.out.println(track1.equals(track2));

        //true
        System.out.println("true");
        System.out.println(track1.equals(track3));

        System.out.println("---------------------------");
        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}