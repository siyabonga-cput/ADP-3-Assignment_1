/* SubjectController.java
Author: Jayden Johnson (219086796)
Date: 7 October 2022
*/

package za.ac.cput.controller.staffdetails;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.staffdetails.Subject;
import za.ac.cput.services.Interface.staffdetails.ISubject;

import javax.validation.Valid;
import java.util.List;


    @RestController
    @RequestMapping("/abc-school-management/subject")
    @Slf4j
    public class SubjectController {
        private final ISubject iSubjectService;

        @Autowired
        public SubjectController(ISubject iSubjectService) {
            this.iSubjectService = iSubjectService;
        }

        @PostMapping("/save")
        public ResponseEntity<Subject> save(@Valid @RequestBody Subject subject) {
            log.info("Save request: {}", subject);
            System.out.printf("Save request: &s%n", subject);
            Subject save = iSubjectService.save(subject);
            return ResponseEntity.ok(save);
        }

        @GetMapping("read/{subjectId}")
        public ResponseEntity<Subject> read(@PathVariable String subjectId) {
            log.info("Read Request: {}", subjectId);
            Subject read = this.iSubjectService.read(subjectId).get();
            return ResponseEntity.ok(read);
        }

        @DeleteMapping("delete/{subjectId}")
        public ResponseEntity<Void> delete(@PathVariable String subjectId) {
            log.info("Delete request {}", subjectId);
            return ResponseEntity.noContent().build();
        }

        @GetMapping("/all")
        public ResponseEntity <List<Subject>> findAll() {
            List<Subject> parent = this.iSubjectService.findAll();
            return ResponseEntity.ok(parent);
        }
}