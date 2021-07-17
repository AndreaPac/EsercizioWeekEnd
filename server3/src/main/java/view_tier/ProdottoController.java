package view_tier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import model_tier.Prodotto;
import proxyService_Tier.ProdottoService;

@Slf4j
@RestController
@CrossOrigin("*")

public class ProdottoController {

	@Autowired
	ProdottoService ps;
	
	@RequestMapping("/get-all-prodotti")
	@ResponseBody
	public List<Prodotto> getAllProdotto(){
		log.info("Siamo in getAllProdotto!");
		return ps.getAllProdotto();
	}
	
	@RequestMapping("/add-prodotto")
	@ResponseBody
	public List<Prodotto> addProdotto(@RequestBody Prodotto p){
		log.info("Siamo in addProdotto!");
		return ps.addProdotto(p);
	}
	@RequestMapping("/remove-prodotto")
	@ResponseBody
	public List<Prodotto> removeProdotto(){
		log.info("Siamo in removeProdotto!");
		return ps.getAllProdotto();
	}
	@RequestMapping("/get-prodotto-by-like/{s}")
	@ResponseBody
	public List<Prodotto> getProdottoByLike(@PathVariable String s){
		log.info("Siamo in getProdottoByLike!");
		return ps.getByDescriptionLike(s);
	}
}
