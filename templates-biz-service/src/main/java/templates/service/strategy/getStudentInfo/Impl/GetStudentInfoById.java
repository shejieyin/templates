package templates.service.strategy.getStudentInfo.Impl;

import org.springframework.context.annotation.Primary;
import templates.client.dto.StudentDTO;
import templates.client.enums.QueryAction;
import org.springframework.stereotype.Service;
import templates.client.request.StudentQuery;
import templates.service.strategy.getStudentInfo.StudentInfoStrategy;

import javax.annotation.PostConstruct;


@Service("getStudentInfoById")
//@Primary
public class GetStudentInfoById implements StudentInfoStrategy {

//    @PostConstruct
//    public void init(){
//        System.out.println("hahhhhhhhhhhhh");
//    }

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

    public void init(){
        System.out.println("hhhhhhhhhhhh");
    }



    @Override
    public String getQueryAction(){
        return QueryAction.QUERY_BY_ID.getQueryAction();
    }

}
