package com.example.api.config;

import com.example.api.model.Produto;
import com.example.api.repository.ProdutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner carregarBanco(ProdutoRepository produtoRepository) {
        return args -> {
            if (produtoRepository.count() == 0) {
                List<Produto> produtos = List.of(
                    new Produto(null, "Teclado Mecânico", 250.0),
                    new Produto(null, "Mouse Gamer", 150.0),
                    new Produto(null, "Monitor Full HD", 1200.0),
                    new Produto(null, "Notebook Dell", 4500.0)
                );
                produtoRepository.saveAll(produtos);
                System.out.println("Banco de dados populado com produtos iniciais!");
            }
        };
    }
}
