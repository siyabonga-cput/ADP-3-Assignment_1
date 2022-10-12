/* TeacherController.java
Author: Jayden Johnson (219086796)
Date: 7 October 2022
*/

package za.ac.cput.controller.StaffDetails;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.StaffDetails.Teacher;
import za.ac.cput.services.Interface.StaffDetails.ITeacher;

import javax.validation.Valid;
import java.util.List;


    @RestController
    @RequestMapping("/abc-school-management/teacher")
    @Slf4j
    public class TeacherController {
        private final ITeacher iTeacherService;

        @Autowired
        public TeacherController(ITeacher iTeacherService) {
            this.iTeacherService = iTeacherService;
        }

        @PostMapping("/save")
        public ResponseEntity<Teacher> save(@Valid @RequestBody Teacher teacher) {
            log.info("Save request: {}", teacher);
            System.out.println(String.format("Save request: &s", teacher));
            Teacher save = iTeacherService.save(teacher);
            return ResponseEntity.ok(save);
        }

        @GetMapping("read/{teacherId}")
        public ResponseEntity<Teacher> read(@PathVariable String teacherId) {
            log.info("Read Request: {}", teacherId);
            Teacher read = this.iTeacherService.read(teacherId).get();
            return ResponseEntity.ok(read);
        }

        @DeleteMapping("delete/{teacherId}")
        public ResponseEntity<Void> delete(@PathVariable String teacherId) {
            log.info("Delete request {}", teacherId);
            return ResponseEntity.noContent().build();
        }

        @GetMapping("/all")
        public ResponseEntity <List<Teacher>> findAll() {
            List<Teacher> parent = this.iTeacherService.findAll();
            return ResponseEntity.ok(parent);
        }

}
