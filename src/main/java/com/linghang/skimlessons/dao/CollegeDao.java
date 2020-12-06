package com.linghang.skimlessons.dao;


import com.linghang.skimlessons.entity.College;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollegeDao {

    /**
     * 查询学院列表
     * @return 学院列表
     */
    List<College> findAllCollege();
}
