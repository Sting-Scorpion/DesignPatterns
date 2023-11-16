package CreationalPatterns.SingletonPattern;

/**
 * 单例模式 —— 懒汉式
 * 静态内部类
 */
public class LazySingleton3 {
    /**
     * 私有构造方法
     */
    private LazySingleton3(){}

    // JVM 加载外部类的时候不会加载内部类
    private static class SingletonHolder{
        private static final LazySingleton3 INSTANCE = new LazySingleton3();
    }

    /**
     * 对外的公共访问接口
     */
    public static LazySingleton3 getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        LazySingleton3 instance1 = LazySingleton3.getInstance();
        LazySingleton3 instance2 = LazySingleton3.getInstance();
        // 证明是同一个对象
        System.out.println("Whether instance1 is the same as instance2?  " + (instance1 == instance2));
    }
}
