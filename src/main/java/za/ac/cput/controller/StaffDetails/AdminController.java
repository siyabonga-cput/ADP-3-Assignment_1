package za.ac.cput.controller.StaffDetails;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.services.Interface.Admin.IAdmin;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/abc-school-management/student")
@Slf4j
public class AdminController {
    private final IAdmin iAdminService;

    @Autowired
    public AdminController(IAdmin iAdminService) {
        this.iAdminService = iAdminService;
    }

    @PostMapping("/save")
    public ResponseEntity<Admin> save(@Valid @RequestBody Admin admin) {
        log.info("Save request: {}", admin);
        System.out.println(String.format("Save request: &s", admin));
        Admin save = iAdminService.save(admin);
        return ResponseEntity.ok(save);
    }
    @GetMapping("read/{adminId}")
    public ResponseEntity<Admin> read(@PathVariable String adminId) {
        log.info("Read Request: {}", adminId);
        Admin read = this.iAdminService.read(adminId).get();
        return ResponseEntity.ok(read);
    }
    @DeleteMapping("delete/{adminId}")
    public ResponseEntity<Void> delete(@PathVariable String adminId) {
        log.info("Delete request {}", adminId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/all")
    public ResponseEntity <List<Admin>> findAll() {
        List<Admin> admin = this.iAdminService.findAll();
        return ResponseEntity.ok(admin);
    }
}
