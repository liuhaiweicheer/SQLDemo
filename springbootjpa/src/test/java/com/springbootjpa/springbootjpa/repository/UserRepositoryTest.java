package com.springbootjpa.springbootjpa.repository;

import com.springbootjpa.springbootjpa.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

/**
 * @author lhw
 * @date 2020/9/26
 */
//@DataJdbcTest
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;


    @Test
    public void testAdd(){
        User user = userRepository.save(User.builder().name("jackxx").email("123456@126.com").build());
        Assert.notNull(user,"user 为空");
    }

}
