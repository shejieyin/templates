package templates.starter.Singleton;

//懒汉式加载--非线程安全
public class SingletonClass_2 {
    private SingletonClass_2 singletonClass2;

    public SingletonClass_2 getSingletonClass2() {
        if(singletonClass2 == null){
            singletonClass2 =  new SingletonClass_2();
        }
        return singletonClass2;
    }
}
