package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderDetail implements Serializable {
    @ManyToOne @Id
    private Orders orders;
    @ManyToOne
    private Item item;
    private int qty;
}
