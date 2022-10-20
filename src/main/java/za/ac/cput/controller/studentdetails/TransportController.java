/* TransportController.java
   Controller for the Subject Department
   Author: Raeesah Williams (219091498)
   Date: 05 September 2022
*/

package za.ac.cput.controller.studentdetails;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.studentdetails.Transport;
import za.ac.cput.services.Interface.studentdetails.ITransport;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/abc-school-management/transport")
@Slf4j
public class TransportController
{
    private final ITransport iTransportService;

    @Autowired
    public TransportController(ITransport iTransportService) {
        this.iTransportService = iTransportService;
    }

    @PostMapping("/save")
    public ResponseEntity<Transport> save(@Valid @RequestBody Transport transport) {
        log.info("Save request: {}", transport);
        System.out.println(String.format("Save request: &s", transport));
        Transport save = iTransportService.save(transport);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{transportId}")
    public ResponseEntity<Transport> read(@PathVariable String transportId){
        log.info("Read request: {}", transportId);
        Transport read = this.iTransportService.read(transportId).get();
        return ResponseEntity.ok(read);
    }

    @DeleteMapping("delete/{transportId}")
    public ResponseEntity<Void> delete(@PathVariable String transportId) {
        log.info("Delete request {}", transportId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/all")
    public ResponseEntity <List<Transport>> findAll() {
        List<Transport> transport = this.iTransportService.findAll();
        return ResponseEntity.ok(transport);
    }
}