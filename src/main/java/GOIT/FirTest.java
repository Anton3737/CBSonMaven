package GOIT;

public class FirTest {

    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();
        FirNumSum firNumSum = new FirNumSum();
        FirNumFactorial firNumFactorial = new FirNumFactorial();
        FirNumMultiplyOdd firNumMultiplyOdd = new FirNumMultiplyOdd();
        FirNumFizzBuzz firNumFizzBuzz = new FirNumFizzBuzz();
        FirNumBasis firNumBasis = new FirNumBasis();
        //Should be 6

        firNumBasis.calc(9);
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {

    @Override
    public int calc(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println(res);
        return res;
    }
}

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);
        return result;
    }
}

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int res = 1;
        for (int i = 1; i <= n; i += 2) {
            res = res * i;
        }
        System.out.println(res);
        return res;
    }
}

class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                res = res + i;
            }
        }
        System.out.println(res);
        return res;
    }
}

class FirNumBasis extends FirNum {
    @Override
    public int calc(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                res = (res + i)/2;
                System.out.println(res);
            }
        }
        System.out.println(res/2);
        return res/2;
    }
}


