package wcq.ramp.up.service;

import wcq.ramp.up.model.GCDModel;

import java.util.Collection;

public interface GCDService {

    Collection<GCDModel> getGCDs();
    GCDModel getGCDById(Long id);

    void saveGCD(GCDModel gcd);

    void updateGCD(GCDModel gcd, Long id);

    void deleteGCD(Long id);
}
