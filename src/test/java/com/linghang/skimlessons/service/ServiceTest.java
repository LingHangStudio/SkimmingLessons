package com.linghang.skimlessons.service;

import com.linghang.skimlessons.common.ServerResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author 田
 *
 */
@SpringBootTest
public class ServiceTest {

    @Autowired
    private SLService slService;

    @Test
    public void test() {
        ServerResponse collegeListResponse = slService.getCollegeList();
        System.out.println(collegeListResponse.isSuccess());
    }
}
