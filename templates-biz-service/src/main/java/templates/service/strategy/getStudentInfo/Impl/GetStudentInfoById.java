package templates.service.strategy.getStudentInfo.Impl;

import templates.client.dto.StudentDTO;
import templates.client.enums.QueryAction;
import org.springframework.stereotype.Service;
import templates.client.request.StudentQuery;
import templates.service.strategy.getStudentInfo.StudentInfoStrategy;


@Service("getStudentInfoById")
public class GetStudentInfoById implements StudentInfoStrategy {

    @Override
    public StudentDTO getStudentInfo(StudentQuery query){

        StudentDTO studentDTO= new StudentDTO();
        //todo query by ID
        studentDTO.setId(1L);
        studentDTO.setStudentNo(10000001L);
        studentDTO.setSex(1);
        studentDTO.setStudentName("小明");
        return studentDTO;
    }



    @Override
    public String getQueryAction(){
        return QueryAction.QUERY_BY_ID.getQueryAction();
    }

}
