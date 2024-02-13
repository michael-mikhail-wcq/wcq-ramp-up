package wcq.ramp.up.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class GCDModel {

    private @Id
    @GeneratedValue Long id;
    private Integer result;

    public GCDModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "GCDModel{" +
                "id=" + id +
                  ", result=" + result +
                '}';
    }
}




