/**
 * double check单例模式
 */
public class Singleton {

    //volatile 关键字保证每个线程读取到的都是最新的值
    private static volatile Singleton instance;

    private Singleton(){}

    //double check 确保线程安全且性能较高
    public static Singleton getInstance(){
        if (instance == null) {
            synchronized(Singleton.class){
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
