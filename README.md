📌 Passos para Criar o README
No terminal, dentro do diretório do projeto, execute:
sh
Copiar
Editar
echo "# API REST com Spring Boot" >> README.md
Abra o arquivo README.md e substitua o conteúdo pelo código abaixo.
📄 Código Completo do README.md
md
Copiar
Editar
# 🛠️ API REST com Spring Boot

Este projeto é uma API REST simples desenvolvida com **Spring Boot**, usada para demonstrar conceitos de **CRUD (Create, Read, Update, Delete)** durante as aulas da faculdade.

## 📌 **Tecnologias Utilizadas**
- Java 17+
- Spring Boot
- Spring Data JPA
- Banco de dados H2 (em memória)
- Maven
- Postman (para testes de API)

---

## 🚀 **Como Rodar o Projeto Localmente**
### **1️⃣ Clonar o Repositório**
```sh
git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio
2️⃣ Configurar o Ambiente
Garanta que você tem o Java 17+ e o Maven instalados.
Se precisar instalar o Maven, siga a documentação oficial.

3️⃣ Rodar o Projeto
Para iniciar o servidor, execute:

sh
Copiar
Editar
mvn spring-boot:run
A aplicação será iniciada em http://localhost:8080 🚀

🛠️ Endpoints da API
Aqui estão os principais endpoints da API e como testá-los no Postman ou cURL.

🔹 1. Listar Todos os Produtos
📌 GET /produtos

sh
Copiar
Editar
curl -X GET http://localhost:8080/produtos
🔹 2. Buscar Produto por ID
📌 GET /produtos/{id}

sh
Copiar
Editar
curl -X GET http://localhost:8080/produtos/1
🔹 3. Criar um Novo Produto
📌 POST /produtos
📌 Body (JSON):

json
Copiar
Editar
{
  "nome": "Teclado Gamer",
  "preco": 250.0
}
sh
Copiar
Editar
curl -X POST http://localhost:8080/produtos -H "Content-Type: application/json" -d '{"nome": "Teclado Gamer", "preco": 250.0}'
🔹 4. Atualizar um Produto
📌 PUT /produtos/{id} 📌 Body (JSON):

json
Copiar
Editar
{
  "nome": "Teclado Mecânico RGB",
  "preco": 300.0
}
sh
Copiar
Editar
curl -X PUT http://localhost:8080/produtos/1 -H "Content-Type: application/json" -d '{"nome": "Teclado Mecânico RGB", "preco": 300.0}'
🔹 5. Excluir um Produto
📌 DELETE /produtos/{id}

sh
Copiar
Editar
curl -X DELETE http://localhost:8080/produtos/1
🗄️ Acessar o Banco de Dados H2
O projeto usa H2 Database para armazenar os dados temporariamente.
Para acessar o banco:

Inicie a aplicação (mvn spring-boot:run).

Abra no navegador:

bash
Copiar
Editar
http://localhost:8080/h2-console
Configuração de Acesso:

JDBC URL: jdbc:h2:mem:testdb
Usuário: sa
Senha: (deixe em branco)
Execute a consulta para ver os produtos:

sql
Copiar
Editar
SELECT * FROM PRODUTOS;
👨‍🏫 Sobre o Projeto
Este projeto faz parte das aulas de SOA e Web Services da FIAP e tem como objetivo ensinar os alunos a criar e consumir APIs REST com Spring Boot.

📌 Dúvidas? Sugestões?
Entre em contato ou contribua no repositório! 🚀

📜 Licença
Este projeto está licenciado sob a MIT License. Você pode usá-lo e modificá-lo como quiser.

🎯 Próximos Passos
📌 Para os alunos:

🔍 Testar os endpoints no Postman