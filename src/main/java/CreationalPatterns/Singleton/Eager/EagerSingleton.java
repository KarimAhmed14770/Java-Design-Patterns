package CreationalPatterns.Singleton.Eager;

public class EagerSingleton {

    private EagerSingleton(){}

    private final static EagerSingleton INSTANCE=new EagerSingleton();

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
}
