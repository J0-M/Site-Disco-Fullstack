## Contribuidores
### Back-end 
[João Marcos Avancini](https://github.com/J0-M)

### Front-end
[Raquel Real Haagsma](https://github.com/rhaagsma)  
[Alan Kageyama Nakamura](https://github.com/Numseinemmeunome) 

# Site Disco – Spring Boot + React
## Sobre o Projeto

Este projeto foi desenvolvido como um estudo prático de backend e frontend full stack, simulando um sistema de gerenciamento de bandas, categorias e endereços.
A aplicação possui:
- Backend em Spring Boot com autenticação JWT e CRUDs.
- Frontend em React, consumindo a API do backend.

## Tecnologias Utilizadas
### Backend
- Java 17+
- Spring Boot
- Spring Security (JWT)
- Spring Data JPA
- PostgreSQL
- Maven

### Frontend
- React
- JavaScript (ES6+)
- Axios (requisições HTTP)
- React Router
- CSS / TailWind

## Funcionalidades 
- Registro e autenticação de usuários (JWT)
- Perfis de usuário (ADMIN / CLIENT)
- CRUD de Bandas, Categorias e Endereços
- Frontend em React para consumir a API
- Controle de acesso no frontend com base no token

## Estrutura do Projeto
<pre markdown="1">
  siteDisco-main
 ├── README.md
 ├── backend/          → API Spring Boot
 │   ├── pom.xml
 │   └── src/...
 └── frontend/         → Aplicação React
     ├── package.json
     ├── public/
     └── src/
         ├── components/
         ├── pages/
         ├── services/ → Configuração de API com Axios
         └── App.js
</pre>

## Como Executar?

1. Clone o repositório:
`
git clone https://github.com/J0-M/Site-Disco-Fullstack.git
`

### 2. Backend (Spring Boot)
2.1 Entre na pasta `backend`:
`cd backend`

2.2 Configure o banco em `src/main/resources/application.properties`:
`
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
`

2.3 Rode a aplicação Backend:
`mvn spring-boot:run`

2.4 A API estará disponível na porta:
`http://localhost:8080`

### 3. Frontend (React)
3.1 Entre na pasta frontend:
`cd frontend`

3.2 Instale as dependências:
`npm install`

3.3 Rode o projeto:
`npm start`

3.4 Acesse no navegador:
`http://localhost:3000`

AVISO: O frontend está configurado para consumir a API do backend em `http://localhost:8080`, se mudar a porta/URL do backend, ajuste o baseURL no arquivo `frontend/src/services/api.js`.

# Aprendizados
- Desenvolvimento full stack (Java + React)
- Criação de API REST com autenticação JWT
- Integração do frontend React com o backend via Axios
- Proteção de rotas no React com base em autenticação
- Organização de código em camadas (backend) e componentes (frontend)

# Próximos Passos
- Melhorar layout do frontend.
- Adicionar paginação e busca no frontend.
- Criar carrinho de compras com bandas/produtos.
- Implementar documentação da API (Swagger).
