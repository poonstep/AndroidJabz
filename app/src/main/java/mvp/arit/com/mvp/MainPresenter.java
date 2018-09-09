package mvp.arit.com.mvp;

public class MainPresenter {

    private Number numberModel = new Number();
    public void loadNumber(){
        return this.numberModel.getNumber();
    }
    
    public void start(){
        // load data from server
    }
}
