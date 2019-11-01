package templates.service.impl;

import templates.client.dto.StudentDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import templates.client.request.StudentQuery;
import templates.client.service.StudentInfo;
import templates.common.utils.LogUtils;
import templates.service.strategy.getStudentInfo.StudentInfoFactory;


@Slf4j
@Service
public class StudentInfoImpl implements StudentInfo {
    @Autowired
    StudentInfoFactory studentInfoFactory;


    @Override
    public StudentDTO getStudentInfo(StudentQuery studentQuery){
        LogUtils.info(log,studentQuery.toString());
        //todo 入参检查

        //执行调用
        return studentInfoFactory.getStrategy(studentQuery.getQueryAction()).getStudentInfo(studentQuery);

    }


}
