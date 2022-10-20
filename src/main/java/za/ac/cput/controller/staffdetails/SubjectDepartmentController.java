/* SubjectDepartmentController.java
   Controller for the Subject Department
   Author: Raeesah Williams (219091498)
   Date: 05 September 2022
*/

package za.ac.cput.controller.staffdetails;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.staffdetails.SubjectDepartment;
import za.ac.cput.services.Interface.staffdetails.ISubjectDepartment;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/abc-school-management/subjectDepartment")
@Slf4j
public class SubjectDepartmentController
{
    private final ISubjectDepartment iSubjectDepartmentService;

    @Autowired
    public SubjectDepartmentController(ISubjectDepartment iSubjectDepartmentService) {
        this.iSubjectDepartmentService = iSubjectDepartmentService;
    }

    @PostMapping("/save")
    public ResponseEntity<SubjectDepartment> save(@Valid @RequestBody SubjectDepartment subjectDepartment) {
        log.info("Save request: {}", subjectDepartment);
        System.out.printf("Save request: &s%n", subjectDepartment);
        SubjectDepartment save = iSubjectDepartmentService.save(subjectDepartment);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{subjectDepartmentId}")
    public ResponseEntity<SubjectDepartment> read(@PathVariable String subjectDepartmentId){
        log.info("Read request: {}", subjectDepartmentId);
        SubjectDepartment read = this.iSubjectDepartmentService.read(subjectDepartmentId).get();
        return ResponseEntity.ok(read);
    }

    @DeleteMapping("delete/{subjectDepartmentId}")
    public ResponseEntity<Void> delete(@PathVariable String subjectDepartmentId) {
        log.info("Delete request {}", subjectDepartmentId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/all")
    public ResponseEntity <List<SubjectDepartment>> findAll() {
        List<SubjectDepartment> subjectDepartment = this.iSubjectDepartmentService.findAll();
        return ResponseEntity.ok(subjectDepartment);
    }
}
