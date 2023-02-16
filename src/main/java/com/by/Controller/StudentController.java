package com.by.Controller;


import com.by.Mapper.StudentMapper;
import com.by.Model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Resource
    private StudentMapper studentMapper;

    @GetMapping
    
    public List<Student> select(){
        return studentMapper.select();
    }
}
