package model_tier;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Prodotto {

	private Long id;
	private String descrizione;
	private long prezzo;
	
}
