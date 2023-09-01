package service.ServiceImpl;



import java.util.List;

import dto.StudentDto;
import entity.Student;

public interface StudentService{

    void saveStudent(StudentDto studentDto);

    Student findByuserName(Student userName);

    List <StudentDto> findAllStudent();

    

}