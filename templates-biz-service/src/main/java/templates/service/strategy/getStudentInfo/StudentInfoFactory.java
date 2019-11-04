package templates.service.strategy.getStudentInfo;

import templates.common.exception.BaseCheckException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import templates.common.utils.LogUtils;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class StudentInfoFactory implements ApplicationContextAware{

    private static Map<String, StudentInfoStrategy> strategyMap = new HashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)throws BeansException {
        Map<String,StudentInfoStrategy> map = applicationContext.getBeansOfType(StudentInfoStrategy.class);
        map.forEach((key, value) -> strategyMap.put(value.getQueryAction(), value));
    }

    public  <T extends StudentInfoStrategy> T getStrategy(String queryAction) {
        StudentInfoStrategy strategy = strategyMap.get(queryAction);
        if(strategy == null){
            LogUtils.info(log,"error");
            throw new BaseCheckException("error");
        }
        return (T)strategy;
    }

}
