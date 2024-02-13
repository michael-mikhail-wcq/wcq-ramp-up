package wcq.ramp.up.controller;

import org.springframework.web.bind.annotation.*;
import wcq.ramp.up.model.GCDModel;
import wcq.ramp.up.service.GCDService;

import java.util.List;

@RestController
@RequestMapping("/gcd")
public class GCDController {

    final GCDService service;

    public GCDController(GCDService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<GCDModel> get() {
        return service.getGCDs().stream().toList();
    }

    @GetMapping("/{id}")
    public GCDModel get(@PathVariable Long id) {
        return service.getGCDById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        service.deleteGCD(id);
    }

    @PostMapping("")
    public void addGCD(@RequestBody GCDModel gcd) {
        service.saveGCD(gcd);
    }

    @PutMapping("/{id}")
    public void updateGCD(@RequestBody GCDModel gcd, @PathVariable Long id) {
        service.updateGCD(gcd, id);
    }
}
