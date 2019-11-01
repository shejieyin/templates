package templates.service.strategy.getStudentInfo.Impl;

import templates.client.dto.StudentDTO;
import templates.client.enums.QueryAction;
import org.springframework.stereotype.Service;
import templates.client.request.StudentQuery;
import templates.service.strategy.getStudentInfo.StudentInfoStrategy;

@Service("getStudentInfoByStudentNo")
public class GetStudentInfoByStudentNo implements StudentInfoStrategy {

    @Override
    public StudentDTO getStudentInfo(StudentQuery query){

        StudentDTO studentDTO= new StudentDTO();
        //todo query by StudentNo
        studentDTO.setId(2L);
        studentDTO.setStudentNo(20000001L);
        studentDTO.setSex(2);
        studentDTO.setStudentName("小黄");
        return studentDTO;
    }



    @Override
    public String getQueryAction(){
        return QueryAction.QUERY_BY_STUDENT_NO.getQueryAction();
    }

}
