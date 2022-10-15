/*
FeesController.java
Controller for Fees
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.controller.ParentDetails;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.ParentDetails.Fees;
import za.ac.cput.services.Interface.ParentDetails.IFees;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/abc-school-management/fees")
@Slf4j
public class FeesController {
    private final IFees iFeesService;

    @Autowired
    public FeesController(IFees iFeesService) {
        this.iFeesService = iFeesService;
    }

    @PostMapping("/save")
    public ResponseEntity<Fees> save(@Valid @RequestBody Fees fees) {
        log.info("Save request: {}", fees);
        System.out.println(String.format("Save request: ",fees));
        Fees save = iFeesService.save(fees);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{feeID}")
    public ResponseEntity<Fees> read(@PathVariable String feeID) {
        log.info("Read Request: {}", feeID);
        Fees read = this.iFeesService.read(feeID).get();
        return ResponseEntity.ok(read);
    }

    @DeleteMapping ("delete/{feeID}")
    public ResponseEntity<Void> delete(@PathVariable String feeID) {
        log.info("Delete request {}", feeID);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/all")
    public ResponseEntity <List<Fees>> findAll() {
        List<Fees> fees = this.iFeesService.findAll();
        return ResponseEntity.ok(fees);
    }
}