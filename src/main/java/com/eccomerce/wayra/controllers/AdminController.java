package com.eccomerce.wayra.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eccomerce.wayra.models.Admin;
import com.eccomerce.wayra.models.Category;
import com.eccomerce.wayra.models.City;
import com.eccomerce.wayra.models.Client;
import com.eccomerce.wayra.models.Payament;
import com.eccomerce.wayra.models.Product;
import com.eccomerce.wayra.models.Purchase;
import com.eccomerce.wayra.models.PurchaseLine;
import com.eccomerce.wayra.repositories.AdminRepository;
import com.eccomerce.wayra.repositories.CategoryRepository;
import com.eccomerce.wayra.repositories.CityRepository;
import com.eccomerce.wayra.repositories.ClientRepository;
import com.eccomerce.wayra.repositories.PayamentRepository;
import com.eccomerce.wayra.repositories.ProductRepository;
import com.eccomerce.wayra.repositories.PurchaseLineRepository;
import com.eccomerce.wayra.repositories.PurchaseRepository;

@RestController
@RequestMapping("admin")
public class AdminController {
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private CityRepository cityRepocitory;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private PurchaseLineRepository purchaseLineRepository;
	
	@Autowired
	private PurchaseRepository purchaseRepository;
	
	@Autowired 
	private PayamentRepository payamentRepository;
	
	
	@GetMapping("save")
	public void prueba() {
		Admin admin = new Admin();
		admin.setEmail("fefe@fef");
		admin.setName("Fde");
		admin.setPassword("asdasd");
		admin.setType("231");
		admin.setUserName("fedeee");
		adminRepository.save(admin);
		
		City c = new City();
		c.setName("Mdp");
		c.setPostalCode("123");
		cityRepocitory.save(c);
		
		Client client = new Client();
		client.setAdress("gerg");
		client.setCity(c);
		client.setDni("gerr33");
		client.setEmail("hter");
		client.setName("rgr");
		client.setPassword("ggew");
		client.setUserName("wqq");
		client.setPhoneNumber("rege");
		clientRepository.save(client);
		
		Category category = new Category();
		category.setName("Prueb");
		categoryRepository.save(category);
		
		Product p = new Product();
		p.setCategory(category);
		p.setDescription("asd");
		p.setName("gregre");
		p.setPrice(new BigDecimal(123));
		p.setStock(new BigDecimal(12312));
		productRepository.save(p);
		
		PurchaseLine pl = new PurchaseLine();
		pl.setQuantity(new BigDecimal(4545));
		pl.setProduct(p);
		purchaseLineRepository.save(pl);
		
		Payament py = new Payament();
		py.setTipo("asdasda");
		payamentRepository.save(py);
		
		Purchase pur = new Purchase();
		pur.setClient(client);
		pur.setTotal(new BigDecimal(2222));
		ArrayList<PurchaseLine> list = new ArrayList<PurchaseLine>();
		list.add(pl);
		pur.setPurchaseLines(list);
		pur.setPayament(py);
		purchaseRepository.save(pur);
		
	}
}
