package pk.hobby.applications;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.time.LocalDate;

@Entity
@Cacheable
public class Income extends PanacheEntity{
    @GeneratedValue
    public Long id;

    @Column(length = 40, unique = true)
    public String name;

    @Column(nullable = false)
    public Double amount;

    @Column(name = "credit_date", nullable = false)
    public LocalDate creditDate;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDate getCreditDate() {
        return creditDate;
    }
}
