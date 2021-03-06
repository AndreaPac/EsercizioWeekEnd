package model_tier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Prodotto {

	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String descrizione;
	@Column
	private long prezzo;

}
