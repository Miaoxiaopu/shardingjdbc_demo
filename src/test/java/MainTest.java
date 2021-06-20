import com.fish.MainApplication;
import com.fish.mapper.FileInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainApplication.class)
public class MainTest {

    @Autowired
    private FileInfoMapper mapper;

    @Test
    public void test() throws IOException {
//        List<Map<String, Object>> fileList = mapper.getFileList();
//        log.info(fileList.toString());
        mapper.insertFile(new HashMap<String,Object>(){
            {put("fileName","黑侠");}
        });
//        List<Map<String, Object>> byId = mapper.findById(14L);


    }

}
