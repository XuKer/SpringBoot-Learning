package com.xuke.DataSource;



import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * @Author: XuKe
 * @CreateOn:2020-02-11 20:39
 * @Email ：wxk1035@gmail.com
 */
@RestController
public class SQLTestController {

    @Autowired
    private SQLRepository sqlRepository;



    @RequestMapping("course")
    public List<Map<String,Object>> testCourse(){

        return sqlRepository.findAll();
    }
}
