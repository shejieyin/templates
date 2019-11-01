package templates.client.service;

import templates.client.dto.StudentDTO;
import templates.client.request.StudentQuery;

public interface StudentInfo {

    StudentDTO getStudentInfo(StudentQuery studentQuery);
}
