## Contribuidores
Back-end: https://github.com/J0-M
Front-end: https://github.com/rhaagsma , https://github.com/Numseinemmeunome

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
- PostgreSQL / H2
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

0. Clone o repositório:
`

`

### 1. Backend (Spring Boot)
1.1 Entre na pasta `backend`:
`
cd backend
`

