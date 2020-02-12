package com.xuke.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author: XuKe
 * @CreateOn:2020-02-12 20:22
 * @Email ：wxk1035@gmail.com
 */
@Repository
public class SQLRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<Map<String,Object>> findAll() {
        List<Map<String,Object>> list=jdbcTemplate.queryForList("select cno,cname from c",new Object[]{});

        return list;
    }
}
