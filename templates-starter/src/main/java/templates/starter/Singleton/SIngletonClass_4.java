package templates.starter.Singleton;
//双重加锁检查
public class SIngletonClass_4 {
    private volatile SIngletonClass_4 sIngletonClass;

    public SIngletonClass_4 getsIngletonClass() {
       if(sIngletonClass==null){
           synchronized (SIngletonClass_4.class){
               if(sIngletonClass ==null){
                   sIngletonClass = new SIngletonClass_4();
               }
           }

       }
       return sIngletonClass;
    }
}
