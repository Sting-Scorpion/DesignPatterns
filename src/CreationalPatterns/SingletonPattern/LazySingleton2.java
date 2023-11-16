package CreationalPatterns.SingletonPattern;

/**
 * 单例模式 —— 懒汉式
 * 双重检验锁
 */
public class LazySingleton2 {
    /**
     * 私有构造方法
     */
    private LazySingleton2() {}

    // 声明实例类型的变量
    // 增加 volatile 关键字，确保代码有序性
    private static volatile LazySingleton2 instance;

    /**
     * 对外的公共访问接口
     */
    public static LazySingleton2 getInstance(){
        // 双重检查锁模式，提高效率
        // 一次判断
        if(instance == null){
            synchronized (LazySingleton2.class){
                // 二次判断
                if(instance == null){
                    // 用到的时候才实例化对象
                    instance = new LazySingleton2();
                }
            }
            instance = new LazySingleton2();
        }
        // 若已经实例化过，则直接返回
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton2 instance1 = LazySingleton2.getInstance();
        LazySingleton2 instance2 = LazySingleton2.getInstance();
        // 证明是同一个对象
        System.out.println("Whether instance1 is the same as instance2?  " + (instance1 == instance2));
    }
}
