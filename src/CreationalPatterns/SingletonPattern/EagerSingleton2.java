package CreationalPatterns.SingletonPattern;

/**
 * 单例模式 —— 饿汉式
 * 静态代码块方法
 */
public class EagerSingleton2 {
    /**
     * 私有构造方法
     */
    private EagerSingleton2() {}

    // 声明实例类型的变量
    private static EagerSingleton2 instance;

    // 用静态代码块赋值
    static{
        instance = new EagerSingleton2();
    }

    /**
     * 对外的公共访问接口
     */
    public static EagerSingleton2 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        EagerSingleton2 instance1 = EagerSingleton2.getInstance();
        EagerSingleton2 instance2 = EagerSingleton2.getInstance();
        // 证明是同一个对象
        System.out.println("Whether instance1 is the same as instance2?  " + (instance1 == instance2));
    }
}
