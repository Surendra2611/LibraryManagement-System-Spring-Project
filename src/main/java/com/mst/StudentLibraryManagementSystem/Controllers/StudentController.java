package com.mst.StudentLibraryManagementSystem.Controllers;
import com.mst.StudentLibraryManagementSystem.DTOs.StudentUpdateMobRequestDTO;
import com.mst.StudentLibraryManagementSystem.Models.Student;
import com.mst.StudentLibraryManagementSystem.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String createStudent(@RequestBody Student student){

        return studentService.createStudent(student);
    }


    @GetMapping("/get_user")
    public String getNameByEmail(@RequestParam("email")String email){

        return studentService.findNameByEmail(email);
    }


    @PutMapping("/update_mob")
    public String updateMob(@RequestBody StudentUpdateMobRequestDTO studentReqDto){
        return studentService.updateMobNo(studentReqDto);
    }

}
