package templates.starter.Singleton;

//饿汉式加载
public class SingletonClass_1 {
    private static SingletonClass_1 singletonClass = new SingletonClass_1();
    public SingletonClass_1 getSingletonClass(){
        return singletonClass;
    }
}
