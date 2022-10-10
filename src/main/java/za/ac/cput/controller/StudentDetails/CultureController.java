/* CultureController.java
   Controller for Culture
   Author: Kegomoditswe Leshope - 219189048
   Date:  7 September 2022
*/

package za.ac.cput.controller.StudentDetails;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.domain.StudentDetails.Culture;
import za.ac.cput.services.Interface.StudentDetails.ICulture;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/abc-school-management/student")
@Slf4j
public class CultureController {

    private final ICulture iCulture;

    @Autowired
    public CultureController(ICulture iCulture) {
        this.iCulture = iCulture;
    }

    @PostMapping("save")
    public ResponseEntity<Culture> save (@Valid @RequestBody Culture culture){
        log.info("Save request: {}", culture);
        Culture save = iCulture.save(culture);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{cultureId}")
    public ResponseEntity<Culture> read (@PathVariable String cultureId){
        log.info ("Read request: {}", cultureId);
        Culture read = this.iCulture.read(cultureId).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(read);
    }

    @DeleteMapping("delete/{cultureId}")
    public ResponseEntity<Void> delete (@PathVariable String cultureId){
        log.info("Delete request: {}", cultureId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<Culture>>findAll(){
        List<Culture> culture = this.iCulture.findAll();
        return ResponseEntity.ok(culture);
    }


}
