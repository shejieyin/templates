package templates.starter;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import templates.client.enums.QueryAction;
import templates.client.request.StudentQuery;
import templates.client.service.StudentInfo;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {
    @Autowired
    StudentInfo studentInfo;

    @RequestMapping(value = "getStudentInfo", method = RequestMethod.GET)
    public void getStudentInfo(){
        StudentQuery query = new StudentQuery();
        query.setQueryAction(QueryAction.QUERY_BY_STUDENT_NO.getQueryAction());
        System.out.println(studentInfo.getStudentInfo(query));

        query.setQueryAction(QueryAction.QUERY_BY_ID.getQueryAction());
        System.out.println(studentInfo.getStudentInfo(query));

        query.setQueryAction(QueryAction.QUERY_BY_NAME.getQueryAction());
        System.out.println(studentInfo.getStudentInfo(query));

    }
}
