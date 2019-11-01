package templates.client.request;

import lombok.Data;


@Data
public class StudentQuery {

    /**
     * QUEEY_BY_ID
     * QUERY_BY_STUDENT_NO
     * QUERY_BY_NAME
     */
    String queryAction;

    Long id;

    Long studentNo;

    String studentName;

}
