package templates.starter.Singleton;

//懒汉式加载-线程安全
public class SingletonClass_3 {
    private SingletonClass_3 singletonClass3;

    public synchronized SingletonClass_3 getSingletonClass2() {
        if(singletonClass3 == null){
            singletonClass3 =  new SingletonClass_3();
        }
        return singletonClass3;
    }
}
