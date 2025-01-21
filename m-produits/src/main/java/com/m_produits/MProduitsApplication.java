package com.m_produits;

import com.m_produits.models.Produit;
import com.m_produits.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties
public class MProduitsApplication implements CommandLineRunner {
	@Autowired
	private ProduitRepository produitRepository;

	public static void main(String[] args) {
		SpringApplication.run(MProduitsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Insert 10 sample products
		//produitRepository.save(new Produit(1, "Product 1", 10.99, 50));
//		produitRepository.save(new Produit(2, "Product 2", 15.49, 30));
//		produitRepository.save(new Produit(3, "Product 3", 25.00, 20));
//		produitRepository.save(new Produit(4, "Product 4", 8.75, 100));
//		produitRepository.save(new Produit(5, "Product 5", 12.30, 40));
//		produitRepository.save(new Produit(6, "Product 6", 45.99, 10));
//		produitRepository.save(new Produit(7, "Product 7", 3.99, 200));
//		produitRepository.save(new Produit(8, "Product 8", 19.99, 60));
//		produitRepository.save(new Produit(9, "Product 9", 5.50, 80));
//		produitRepository.save(new Produit(10, "Product 10", 100.00, 5));

		System.out.println("Products inserted successfully!");
	}
}
