package mvp.arit.com.mvp;

public class Number {
    int number = 1;

    void increase(){
        this.number++;
    }

    void decrease(){
        this.number--;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
