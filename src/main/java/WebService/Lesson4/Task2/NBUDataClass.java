package WebService.Lesson4.Task2;

import java.util.List;

public class NBUDataClass {

    private int r030;
    private String txt;
    private float rate;
    private String cc;
    private String exchangedate;

    private List<NBUDataClass> nbuDataClassList;

//    public NBUDataClass(int r030, String txt, float rate, String cc, String exchangedate) {
//        this.r030 = r030;
//        this.txt = txt;
//        this.rate = rate;
//        this.cc = cc;
//        this.exchangedate = exchangedate;
//    }

    public int getR030() {
        return r030;
    }

    public void setR030(int r030) {
        this.r030 = r030;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getExchangedate() {
        return exchangedate;
    }

    public void setExchangedate(String exchangedate) {
        this.exchangedate = exchangedate;
    }
}
