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
            // Limpa o banco antes de inserir os produtos
            produtoRepository.deleteAll();

            List<Produto> produtos = List.of(
                new Produto(null, "Teclado Mecânico", 250.0),
                new Produto(null, "Mouse Gamer", 150.0),
                new Produto(null, "Monitor Full HD", 1200.0),
                new Produto(null, "Notebook Dell", 4500.0),
                new Produto(null, "Cadeira Gamer", 750.0),
                new Produto(null, "Fone de Ouvido Bluetooth", 300.0),
                new Produto(null, "Webcam Full HD", 180.0),
                new Produto(null, "Microfone Condensador", 500.0),
                new Produto(null, "SSD 1TB NVMe", 800.0),
                new Produto(null, "HD Externo 2TB", 450.0),
                new Produto(null, "Placa de Vídeo RTX 3060", 2500.0),
                new Produto(null, "Fonte 750W 80 Plus Gold", 600.0),
                new Produto(null, "Memória RAM 16GB DDR4", 320.0),
                new Produto(null, "Processador Ryzen 7", 1800.0),
                new Produto(null, "Gabinete Gamer RGB", 400.0),
                new Produto(null, "Mousepad XXL", 100.0),
                new Produto(null, "Switch HDMI 4 portas", 90.0),
                new Produto(null, "Cabo DisplayPort 1.4", 70.0),
                new Produto(null, "Carregador Turbo USB-C", 120.0),
                new Produto(null, "Hub USB 3.0", 80.0),
                new Produto(null, "Tablet Samsung", 1100.0),
                new Produto(null, "Smartphone Android", 2500.0),
                new Produto(null, "Smartwatch Xiaomi", 600.0),
                new Produto(null, "Câmera de Segurança Wi-Fi", 350.0),
                new Produto(null, "Teclado Bluetooth Compacto", 200.0),
                new Produto(null, "Controle Xbox Series X", 400.0),
                new Produto(null, "Headset Gamer com RGB", 550.0),
                new Produto(null, "Estabilizador de Energia", 280.0),
                new Produto(null, "Impressora Multifuncional", 900.0),
                new Produto(null, "Mouse Ergonômico Sem Fio", 220.0),
                new Produto(null, "Roteador Wi-Fi 6", 650.0),
                new Produto(null, "Fire TV Stick 4K", 350.0),
                new Produto(null, "Echo Dot Alexa", 380.0),
                new Produto(null, "Balança Digital Inteligente", 210.0),
                new Produto(null, "Monitor Curvo Ultrawide", 2300.0),
                new Produto(null, "Cabo USB-C para Lightning", 100.0),
                new Produto(null, "Fita LED RGB Wi-Fi", 180.0),
                new Produto(null, "SSD Externo 512GB", 420.0),
                new Produto(null, "Cooler para Processador", 270.0),
                new Produto(null, "Dock Station para Notebook", 550.0),
                new Produto(null, "Filtro de Linha Inteligente", 160.0),
                new Produto(null, "Estação de Solda Digital", 300.0),
                new Produto(null, "Placa de Captura HDMI", 700.0),
                new Produto(null, "Suporte Articulado para Monitor", 250.0),
                new Produto(null, "Controle Remoto Universal", 90.0),
                new Produto(null, "Ventilador USB Portátil", 50.0),
                new Produto(null, "Cabo de Rede Cat6 10m", 80.0),
                new Produto(null, "Carregador por Indução", 150.0)
            );

            produtoRepository.saveAll(produtos);

            // Confirmação no console
            long total = produtoRepository.count();
            System.out.println("Total de produtos no banco: " + total);
        };
    }
}
