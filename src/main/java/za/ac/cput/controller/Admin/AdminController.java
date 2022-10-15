package za.ac.cput.controller.Admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.services.Interface.Admin.IAdmin;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/abc-school-management/admin")
@Slf4j
public class AdminController {
    private final IAdmin iAdmin;

    @Autowired
    public AdminController(IAdmin iAdmin){
        this.iAdmin = iAdmin;
    }
    @PostMapping("/save")
    public ResponseEntity<Admin> save(@Valid @RequestBody Admin admin) {
        log.info("Save request: {}", admin);
        System.out.println(String.format("Save request: &s", admin));
        Admin save = iAdmin.save(admin);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{adminId}")
    public ResponseEntity<Admin> read(@PathVariable String adminId) {
        log.info("Read Request: {}", adminId);
        Admin read = this.iAdmin.read(adminId).get();
        return ResponseEntity.ok(read);
    }

    @DeleteMapping("delete/{adminId}")
    public ResponseEntity<Void> delete(@PathVariable String adminId) {
        log.info("Delete request {}", adminId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/all")
    public ResponseEntity <List<Admin>> findAll() {
        List<Admin> admin = this.iAdmin.findAll();
        return ResponseEntity.ok(admin);
    }
}
