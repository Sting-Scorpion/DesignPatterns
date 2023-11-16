package CreationalPatterns.SingletonPattern;

/**
 * 单例模式 —— 饿汉式
 * 静态成员变量方法
 */
public class EagerSingleton1 {
    /**
     * 私有构造方法
     */
    private EagerSingleton1() {}

    /**
     * 本类中创建自己的对象
     */
    private static EagerSingleton1 instance = new EagerSingleton1();

    /**
     * 对外的公共访问接口
     */
    public static EagerSingleton1 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        EagerSingleton1 instance1 = EagerSingleton1.getInstance();
        EagerSingleton1 instance2 = EagerSingleton1.getInstance();
        // 证明是同一个对象
        System.out.println("Whether instance1 is the same as instance2?  " + (instance1 == instance2));
    }
}
