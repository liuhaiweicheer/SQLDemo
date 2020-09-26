package dao;

import com.demo.Main;
import com.demo.entity.Position;
import com.demo.repository.PositionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lhw
 * @date 2020/9/21
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class PositionTest {

    @Autowired
    private PositionRepository positionRepository;

    @Test
    public void testAdd(){
        for(int i = 1; i <= 20; i++){
            Position position = new Position();
//            position.setId(i);
            position.setName("test"+i);
            position.setSalary("10000");
            position.setCity("Beijing");
            positionRepository.save(position);
        }
    }

}
