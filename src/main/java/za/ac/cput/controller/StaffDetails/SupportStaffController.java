/*
SupportStaffController.java
Controller SupportStaff
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.controller.StaffDetails;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.StaffDetails.SupportStaff;
import za.ac.cput.services.Interface.StaffDetails.ISupportStaff;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/abc-school-management/supportStaff")
@Slf4j
public class SupportStaffController {
    private final ISupportStaff iSupportStaffService;

    @Autowired
    public SupportStaffController(ISupportStaff iSupportStaffService) { this.iSupportStaffService = iSupportStaffService; }

    @PostMapping("/save")
    public ResponseEntity<SupportStaff> save(@Valid @RequestBody SupportStaff supportStaff) {
        log.info("Save request {}", supportStaff);
        SupportStaff save = iSupportStaffService.save(supportStaff);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{suppStaffID}")
    public  ResponseEntity<SupportStaff> read(@PathVariable String suppStaffID) {
        log.info("Read Request: {}", suppStaffID);
        SupportStaff read = this.iSupportStaffService.read(suppStaffID).get();
        return ResponseEntity.ok(read);
    }

    @DeleteMapping("delete/{suppStaffID}")
    public ResponseEntity<Void> delete(@PathVariable String suppStaffID) {
        log.info("Delete Request {}", suppStaffID);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/all")
    public ResponseEntity <List<SupportStaff>> findAll() {
        List<SupportStaff> supportStaff = this.iSupportStaffService.findall();
        return ResponseEntity.ok(supportStaff);
    }
}