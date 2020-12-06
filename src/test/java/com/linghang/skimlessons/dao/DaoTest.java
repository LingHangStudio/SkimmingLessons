package com.linghang.skimlessons.dao;

import com.linghang.skimlessons.entity.College;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 *
 * @author 田
 *
 */
@SpringBootTest
public class DaoTest {

    @Autowired
    private CollegeDao collegeDao;

    @Test
    public void test1() {
        List<College> allCollege = collegeDao.findAllCollege();
        System.out.println(allCollege);
    }

}
