package CreationalPatterns.SingletonPattern;

/**
 * 单例模式 —— 懒汉式
 * 线程安全
 */
public class LazySingleton1 {
    /**
     * 私有构造方法
     */
    private LazySingleton1() {}

    // 声明实例类型的变量
    private static LazySingleton1 instance;

    /**
     * 对外的公共访问接口，增加同步锁
     */
    public static synchronized LazySingleton1 getInstance(){
        // 用到的时候才实例化对象
        // 若已经实例化过，则直接返回
        if(instance == null){
            instance = new LazySingleton1();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton1 instance1 = LazySingleton1.getInstance();
        LazySingleton1 instance2 = LazySingleton1.getInstance();
        // 证明是同一个对象
        System.out.println("Whether instance1 is the same as instance2?  " + (instance1 == instance2));
    }
}
