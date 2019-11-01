package templates.service.strategy.getStudentInfo;

import templates.client.dto.StudentDTO;
import templates.client.request.StudentQuery;
import templates.service.strategy.BaseStrategy;

public interface StudentInfoStrategy extends BaseStrategy {

    StudentDTO getStudentInfo(StudentQuery query);
}
