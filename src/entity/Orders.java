package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {
    @Id
    private String oid;
    @ManyToOne
    private Customer customer;
    @CreationTimestamp
    private LocalDate date;

    @OneToMany(mappedBy = "orders")
   private List<OrderDetail>orderDetails= new ArrayList<>();
}
