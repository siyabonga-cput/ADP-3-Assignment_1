///* StudentPrestigeController.java
//   Controller for StudentPrestige
//   Author: Kegomoditswe Leshope - 219189048
//   Date:  7 September 2022
//*/
//
//package za.ac.cput.controller.StudentDetails;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//import za.ac.cput.domain.StudentDetails.StudentPrestige;
//import za.ac.cput.services.Interface.StudentDetails.IStudentPrestige;
//
//import javax.validation.Valid;
//import java.util.List;
//
//@RestController
//@RequestMapping("/abc-school-management/studentprestige")
//@Slf4j
//public class StudentPrestigeController {
//    private final IStudentPrestige iStudentPrestige;
//
//    @Autowired
//    public StudentPrestigeController(IStudentPrestige iStudentPrestige) {
//        this.iStudentPrestige = iStudentPrestige;
//    }
//
//    @PostMapping("/save")
//    public ResponseEntity<StudentPrestige> save (@Valid @RequestBody StudentPrestige studentPrestige){
//        log.info("Save request: {}", studentPrestige);
//        StudentPrestige save = iStudentPrestige.save(studentPrestige);
//        return ResponseEntity.ok(save);
//    }
//
//    @GetMapping("read/{prestigeId}")
//    public ResponseEntity<StudentPrestige> read (@PathVariable String prestigeId){
//        log.info ("Read request: {}", prestigeId);
//        StudentPrestige read = this.iStudentPrestige.read(prestigeId).orElseThrow(
//                () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
//        return ResponseEntity.ok(read);
//    }
//
//    @DeleteMapping("delete/{prestigeId}")
//    public ResponseEntity<Void> delete (@PathVariable String prestigeId){
//        log.info("Delete request: {}", prestigeId);
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping("/all")
//    public ResponseEntity<List<StudentPrestige>>findAll(){
//        List<StudentPrestige> studentPrestige = this.iStudentPrestige.findAll();
//        return ResponseEntity.ok(studentPrestige);
//    }
//}