package CreationalPatterns.Singleton.Lazy;

public class LazySingletonDoubleCheckedLock {

    private LazySingletonDoubleCheckedLock(){}

    private  static volatile LazySingletonDoubleCheckedLock INSTANCE;

    public static LazySingletonDoubleCheckedLock getInstance(){
        if(INSTANCE==null){
            synchronized (LazySingletonDoubleCheckedLock.class){
                if(INSTANCE==null){
                    INSTANCE=new LazySingletonDoubleCheckedLock();
                }
            }
        }
        return INSTANCE;
    }
}
