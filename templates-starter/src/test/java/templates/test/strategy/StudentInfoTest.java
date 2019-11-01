package templates.test.strategy;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import templates.client.enums.QueryAction;
import templates.client.request.StudentQuery;
import templates.client.service.StudentInfo;
import templates.test.BaseTest;

public class StudentInfoTest extends BaseTest {

    @Autowired
    StudentInfo studentInfo;



    @Test
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
