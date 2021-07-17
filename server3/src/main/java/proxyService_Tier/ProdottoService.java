package proxyService_Tier;

import java.util.List;



import model_tier.Prodotto;


public interface ProdottoService {

	List<Prodotto> addProdotto(Prodotto p);

	List<Prodotto> removeProdotto(Prodotto p);

	List<Prodotto> getAllProdotto();
	
	List<Prodotto> getByDescriptionLike(String s);

}
