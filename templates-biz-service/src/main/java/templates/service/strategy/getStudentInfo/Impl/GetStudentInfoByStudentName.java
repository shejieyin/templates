package templates.service.strategy.getStudentInfo.Impl;

import templates.client.dto.StudentDTO;
import templates.client.enums.QueryAction;
import org.springframework.stereotype.Service;
import templates.client.request.StudentQuery;
import templates.service.strategy.getStudentInfo.StudentInfoStrategy;

@Service("getStudentInfoByStudentName")
public class GetStudentInfoByStudentName implements StudentInfoStrategy {
    @Override
    public StudentDTO getStudentInfo(StudentQuery query){

        StudentDTO studentDTO= new StudentDTO();
        //todo query by StudentName
        studentDTO.setId(3L);
        studentDTO.setStudentNo(30000001L);
        studentDTO.setSex(2);
        studentDTO.setStudentName("小绿");
        return studentDTO;
    }



    @Override
    public String getQueryAction(){
        return QueryAction.QUERY_BY_NAME.getQueryAction();
    }

}
