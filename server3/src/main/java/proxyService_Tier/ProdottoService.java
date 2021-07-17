package proxyService_Tier;

import java.util.List;

import org.springframework.stereotype.Service;

import model_tier.Prodotto;

@Service
public interface ProdottoService {

	List<Prodotto> addProdotto(Prodotto p);

	List<Prodotto> removeProdotto(Prodotto p);

	List<Prodotto> getAllProdotto();
	
	List<Prodotto> getByDescriptionLike(String s);

}
