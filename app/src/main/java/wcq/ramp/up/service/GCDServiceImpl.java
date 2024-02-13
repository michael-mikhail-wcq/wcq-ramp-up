package wcq.ramp.up.service;

import org.springframework.stereotype.Service;
import wcq.ramp.up.GCDRepository;
import wcq.ramp.up.model.GCDModel;

import java.util.List;

@Service
public class GCDServiceImpl implements GCDService {

    final GCDRepository repository;

    public GCDServiceImpl(GCDRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<GCDModel> getGCDs() {
        return repository.findAll();
    }

    @Override
    public GCDModel getGCDById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void saveGCD(GCDModel gcd) {
        // Create and save
        repository.save(gcd);
    }

    @Override
    public void updateGCD(GCDModel gcd, Long id) {

        // Get if exists and modify and save
        // Else create and save
        repository.findById(id).map((GCDModel old) -> {
            old.setResult(gcd.getResult());
            return repository.save(old);
        }).orElseGet(() -> {
            gcd.setId(id);
            return repository.save(gcd);
        });
    }

    @Override
    public void deleteGCD(Long id) {
        // Delete
        repository.deleteById(id);

    }
}
