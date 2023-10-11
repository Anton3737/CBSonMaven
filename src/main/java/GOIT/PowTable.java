package GOIT;

import java.util.Arrays;

public class PowTable {

    public static final int[] POWERS_2;

    static {
        int length = 10;
        POWERS_2 = new int[length];
        for (int i = 0; i < length; i++) {
            POWERS_2[i] = (i + 1) * (i + 1);
        }
    }
}

class PowTableTest {
    public static void main(String[] args) {
        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}
