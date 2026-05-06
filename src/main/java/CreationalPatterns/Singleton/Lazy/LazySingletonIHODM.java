package CreationalPatterns.Singleton.Lazy;

public class LazySingletonIHODM {

    private LazySingletonIHODM(){
            System.out.println("this is only called once on the first getInstance call");
    }

    private static class Holder{
        private static final LazySingletonIHODM INSTANCE=new LazySingletonIHODM();
    }

    public static LazySingletonIHODM getInstance(){
        return Holder.INSTANCE;
    }
}
