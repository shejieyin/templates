package templates.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import templates.starter.TemplatesApplication;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= TemplatesApplication.class, properties = "application.properties")
public class BaseTest {

}