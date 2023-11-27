package hu.bankmonitor.mortgage;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Mortgage {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private Integer amount;
  private String currency;

  @OneToOne(cascade = CascadeType.ALL)
  private Participant participant;
}
