package persistance_tier;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import model_tier.Prodotto;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {

	@Query("SELECT p FROM Prodotto WHERE descrizione LIKE %:s%")
	public List<Prodotto> findDescrizioneLike(String s);
	
}
