<div align="center">

# 🍃 Plataforma de Post e Comentários com MongoDB e Queries Avançados

[![Java](https://img.shields.io/badge/Java-25_Latest_Features-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.2-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MongoDB](https://img.shields.io/badge/MongoDB-7.0-47A248?style=for-the-badge&logo=mongodb&logoColor=white)](https://www.mongodb.com/)
[![Railway](https://img.shields.io/badge/Railway-Deployed-0B0D0E?style=for-the-badge&logo=railway&logoColor=white)](https://railway.app/)
[![Swagger](https://img.shields.io/badge/OpenAPI-3.0-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)](https://swagger.io/)
[![MIT License](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)](https://choosealicense.com/licenses/mit/)

<br>

[![Live Demo](https://img.shields.io/badge/🚀_ACESSE_O_DEMO_AO_VIVO-Experimente_Agora-00C7B7?style=for-the-badge&labelColor=000000)](https://social-data-api-production.up.railway.app/swagger-ui/index.html)

<br>

_API RESTful social com MongoDB, demonstrando o poder do NoSQL: documentos aninhados, queries com regex, busca full-text e relacionamentos com DBRef._

</div>

---

## 📢 Sobre o Projeto

Este projeto é uma **demonstração prática do ecossistema NoSQL com MongoDB**, explorando recursos únicos de bancos de dados orientados a documentos que não existem em SQL tradicional. Desenvolvido com **Java 25 + Spring Boot 4.0.2 + Spring Data MongoDB**, este não é apenas um CRUD — é uma **plataforma social completa** que mostra **quando e por que usar NoSQL**.

### 🎯 Por Que MongoDB? Diferenciais NoSQL

**Problemas que SQL não resolve bem:**
- ❌ Relacionamentos complexos exigem múltiplos JOINs caros
- ❌ Schemas rígidos dificultam evolução do modelo
- ❌ Busca full-text em múltiplos campos é lenta
- ❌ Arrays e objetos aninhados requerem tabelas separadas
- ❌ Escalabilidade horizontal é complexa

**Soluções com MongoDB:**
- ✅ **Documentos Aninhados**: Comentários dentro de posts (sem JOIN!)
- ✅ **Schema Flexível**: Adicione campos sem migrations
- ✅ **Regex Nativo**: Busca com expressões regulares no banco
- ✅ **Arrays Poderosos**: Lista de comentários diretamente no documento
- ✅ **DBRef**: Referências entre documentos com lazy loading
- ✅ **Queries Avançadas**: `$and`, `$or`, `$regex`, `$gte`, `$lte` em uma query
- ✅ **Sharding Nativo**: Escala horizontalmente com facilidade

---

## 🚀 Stack Tecnológica NoSQL

<table>
<thead>
<tr>
<th><b>Tecnologia</b></th>
<th><b>Versão</b></th>
<th><b>Função no Projeto</b></th>
</tr>
</thead>
<tbody>
<tr>
<td><img src="https://img.shields.io/badge/Java-25-ED8B00?logo=openjdk&logoColor=white" /></td>
<td><b>25 (Latest)</b></td>
<td>Linguagem base com Virtual Threads, Sequenced Collections e Structured Concurrency para operações assíncronas no MongoDB</td>
</tr>
<tr>
<td><img src="https://img.shields.io/badge/Spring_Boot-4.0.2-6DB33F?logo=spring-boot&logoColor=white" /></td>
<td><b>4.0.2</b></td>
<td>Framework moderno com suporte otimizado ao Java 25 e integração nativa com Spring Data MongoDB</td>
</tr>
<tr>
<td><img src="https://img.shields.io/badge/Spring_Data_MongoDB-4.0-6DB33F?logo=spring&logoColor=white" /></td>
<td>4.0.x</td>
<td><b>Abstração NoSQL</b> com repositórios, queries derivadas, @Query com MongoDB Query Language e suporte a aggregations</td>
</tr>
<tr>
<td><img src="https://img.shields.io/badge/MongoDB-7.0-47A248?logo=mongodb&logoColor=white" /></td>
<td>7.0</td>
<td>Banco NoSQL orientado a documentos com <b>BSON</b>, indexes, sharding, replication sets e queries avançadas com operators</td>
</tr>
<tr>
<td><img src="https://img.shields.io/badge/SpringDoc_OpenAPI-2.8.5-85EA2D?logo=swagger&logoColor=black" /></td>
<td>2.8.5</td>
<td>Documentação interativa Swagger/OpenAPI 3.0 com exemplos de queries MongoDB</td>
</tr>
<tr>
<td><img src="https://img.shields.io/badge/Maven-3.9-C71A36?logo=apache-maven&logoColor=white" /></td>
<td>3.9.12</td>
<td>Build automation e gerenciamento de dependências</td>
</tr>
<tr>
<td><img src="https://img.shields.io/badge/Railway-Cloud-0B0D0E?logo=railway&logoColor=white" /></td>
<td>Latest</td>
<td>Plataforma PaaS com MongoDB gerenciado e CI/CD automático</td>
</tr>
</tbody>
</table>

> 💡 **MongoDB vs SQL**: MongoDB armazena dados em documentos BSON (Binary JSON) em vez de linhas e colunas. Isso permite:
> - **Desnormalização estratégica** (comentários dentro de posts)
> - **Queries complexas em um único documento** (sem JOINs)
> - **Schema evolution** sem downtime (adicione campos sem migrations)
> - **Horizontal scaling** nativo (sharding automático)

---

## 🧩 Arquitetura NoSQL - Document-Oriented

### Diagrama de Fluxo com MongoDB

```mermaid
graph TD
    A[Cliente HTTP/REST] -->|JSON Request| B[Resources Layer]
    B -->|Validação| C[Services Layer]
    C -->|MongoDB Query| D[Spring Data MongoDB]
    D -->|BSON Documents| E[MongoDB 7.0 - Railway]
    
    B -->|Exception| F[ExceptionHandler]
    F -->|StandardError JSON| A
    
    D -->|Regex $options i| E
    D -->|DBRef Lazy Loading| E
    D -->|And Or Operators| E
    
    style A fill:#e1f5ff,stroke:#0077cc,stroke-width:3px
    style B fill:#ffe1e1,stroke:#cc0000,stroke-width:3px
    style C fill:#fff4e1,stroke:#cc8800,stroke-width:3px
    style D fill:#e1ffe1,stroke:#00cc00,stroke-width:3px
    style E fill:#47A248,stroke:#00684A,stroke-width:4px,color:#fff
    style F fill:#ffe1f5,stroke:#cc0077,stroke-width:3px
```

### Camadas da Aplicação

| Camada | Responsabilidade | Anotações MongoDB |
|--------|------------------|-------------------|
| **Resources** | Receber requisições REST, parsear query params (regex, datas) | `@RestController`, `@RequestParam` |
| **Services** | Processar buscas full-text, converter datas, aplicar regex | `@Service`, query builders |
| **Repositories** | Queries MongoDB com `@Query`, Spring Data derivadas | `@Repository`, `MongoRepository`, `@Query` |
| **Domain** | Documentos MongoDB com arrays e subdocumentos | `@Document`, `@Id`, `@DBRef`, `@JsonFormat` |
| **DTOs** | Desnormalização estratégica (AuthorDTO em vez de User completo) | `Serializable`, construtores de entidade |

---

## 🔗 Modelo de Dados NoSQL - Documentos BSON

### Diagrama de Documentos MongoDB

```mermaid
graph LR
    A[User Document] -->|DBRef lazy| B[Post Document]
    B -->|Embedded Array| C[CommentDTO]
    B -->|Embedded Object| D[AuthorDTO]
    C -->|Embedded Object| E[AuthorDTO]
    
    style A fill:#FFE082,stroke:#F57C00,stroke-width:3px
    style B fill:#81C784,stroke:#388E3C,stroke-width:3px
    style C fill:#64B5F6,stroke:#1976D2,stroke-width:3px
    style D fill:#FFB74D,stroke:#F57C00,stroke-width:2px
    style E fill:#FFB74D,stroke:#F57C00,stroke-width:2px
```

### 📄 Estrutura dos Documentos BSON

#### **User Document** (Collection: `user`)
```javascript
{
  "_id": ObjectId("507f1f77bcf86cd799439011"),
  "name": "Maria Brown",
  "email": "maria@gmail.com",
  "posts": [
    DBRef("post", ObjectId("507f191e810c19729de860ea")),
    DBRef("post", ObjectId("507f191e810c19729de860eb"))
  ]
}
```
- `_id`: ObjectId gerado automaticamente (12 bytes)
- `posts`: Array de **DBRef** (lazy loading) - carrega sob demanda

#### **Post Document** (Collection: `post`)
```javascript
{
  "_id": ObjectId("507f191e810c19729de860ea"),
  "date": ISODate("2018-03-21T00:00:00.000Z"),
  "title": "Partiu viagem",
  "body": "Vou viajar para São Paulo. Abraços!",
  "author": {                          // Embedded AuthorDTO
    "id": "507f1f77bcf86cd799439011",
    "name": "Maria Brown"
  },
  "comments": [                        // Embedded Array of CommentDTO
    {
      "text": "Boa viagem mano!",
      "date": ISODate("2018-03-21T00:00:00.000Z"),
      "author": {
        "id": "507f1f77bcf86cd799439012",
        "name": "Alex Green"
      }
    },
    {
      "text": "Aproveite",
      "date": ISODate("2018-03-22T00:00:00.000Z"),
      "author": {
        "id": "507f1f77bcf86cd799439013",
        "name": "Bob Grey"
      }
    }
  ]
}
```

### 🔄 Relacionamentos NoSQL Implementados

#### **1. User → Post (DBRef com Lazy Loading)**
```java
// User.java
@DBRef(lazy = true)  // Lazy loading: carrega posts sob demanda
private List posts = new ArrayList<>();
```
- **DBRef**: Referência entre documentos (similar a Foreign Key, mas NoSQL)
- **Lazy Loading**: Posts só são carregados quando acessados (otimização)
- **Trade-off**: Requer query adicional vs Embedding que traz tudo

#### **2. Post → Comments (Documentos Aninhados)**
```java
// Post.java
@Document  // Documento MongoDB
private List comments = new ArrayList<>();
```
- **Embedded Documents**: Comentários ficam DENTRO do post (sem JOIN!)
- **Vantagem**: Uma query traz post + comentários
- **Trade-off**: Documento cresce (limite de 16MB no MongoDB)

#### **3. Post → Author (Desnormalização Estratégica)**
```java
// Post.java
private AuthorDTO author;  // Não é @DBRef, é objeto embutido

// AuthorDTO.java - apenas id e name
public class AuthorDTO {
    private String id;
    private String name;
}
```
- **Desnormalização**: Duplica dados do autor no post (NoSQL pattern)
- **Vantagem**: Exibe autor sem query adicional
- **Trade-off**: Se nome do User mudar, posts antigos mantêm nome antigo

> 💡 **Desnormalização vs Normalização**: Em NoSQL, duplicar dados estrategicamente é CORRETO! Priorizamos velocidade de leitura sobre consistência absoluta.

---

## 🔌 Endpoints da API - Queries NoSQL

### 👤 Gerenciamento de Usuários (`/users`)

| Método | Endpoint | Descrição | Status Code |
|--------|----------|-----------|-------------|
| `GET` | `/users` | Lista todos os usuários (DTOs sem posts) | 200 OK |
| `GET` | `/users/{id}` | Busca usuário específico por ObjectId | 200 OK / 404 Not Found |
| `POST` | `/users` | Cria novo usuário (gera ObjectId automaticamente) | 201 Created |
| `PUT` | `/users/{id}` | Atualiza nome e email do usuário | 204 No Content |
| `DELETE` | `/users/{id}` | Remove usuário do MongoDB | 204 No Content |
| `GET` | `/users/{id}/posts` | Lista posts do usuário (via DBRef lazy) | 200 OK |

### 📝 Gerenciamento de Posts (`/posts`)

| Método | Endpoint | Descrição | Query MongoDB |
|--------|----------|-----------|---------------|
| `GET` | `/posts/{id}` | Busca post por ObjectId com comentários embutidos | `db.post.findOne({_id: ObjectId})` |
| `GET` | `/posts/titlesearch?text=viagem` | Busca posts por título (case-insensitive regex) | `{'title': {$regex: 'viagem', $options: 'i'}}` |
| `GET` | `/posts/fullsearch?text=...&minDate=...&maxDate=...` | Busca avançada em título, body E comentários com filtro de data | `{$and: [{date: {$gte, $lte}}, {$or: [title, body, comments.text]}]}` |

---

## 📄 Exemplos de Queries MongoDB Avançadas

### Busca Simples por Título (Regex Case-Insensitive)

<details>
<summary><b>GET /posts/titlesearch?text=viagem</b></summary>

**Query MongoDB Gerada:**
```javascript
db.post.find({
  'title': {
    $regex: 'viagem',
    $options: 'i'  // case-insensitive
  }
})
```

**Implementação Java:**
```java
@Query("{'title': { $regex: ?0, $options: 'i' }}")
List searchTitle(String text);
```

**Request:**
```
GET /posts/titlesearch?text=viagem
```

**Response (200 OK):**
```json
[
  {
    "id": "507f191e810c19729de860ea",
    "date": "2018-03-21T00:00:00.000Z",
    "title": "Partiu viagem",
    "body": "Vou viajar para São Paulo. Abraços!",
    "author": {
      "id": "507f1f77bcf86cd799439011",
      "name": "Maria Brown"
    },
    "comments": [
      {
        "text": "Boa viagem mano!",
        "date": "2018-03-21T00:00:00.000Z",
        "author": {
          "id": "507f1f77bcf86cd799439012",
          "name": "Alex Green"
        }
      }
    ]
  }
]
```

</details>

### Busca Full-Text Avançada (Múltiplos Campos + Filtro de Data)

<details>
<summary><b>GET /posts/fullsearch?text=feliz&minDate=2018-03-01&maxDate=2018-03-31</b></summary>

**Query MongoDB Complexa:**
```javascript
db.post.find({
  $and: [
    // Filtro de data
    { date: { $gte: ISODate("2018-03-01") } },
    { date: { $lte: ISODate("2018-03-31") } },
    // Busca em múltiplos campos com OR
    {
      $or: [
        { 'title': { $regex: 'feliz', $options: 'i' } },
        { 'body': { $regex: 'feliz', $options: 'i' } },
        { 'comments.text': { $regex: 'feliz', $options: 'i' } }  // Busca dentro do array!
      ]
    }
  ]
})
```

**Implementação Java:**
```java
@Query("{ $and: [ " +
       "{ date: {$gte: ?1} }, " +
       "{ date: { $lte: ?2} }, " +
       "{ $or: [ " +
       "  { 'title': { $regex: ?0, $options: 'i' } }, " +
       "  { 'body': { $regex: ?0, $options: 'i' } }, " +
       "  { 'comments.text': { $regex: ?0, $options: 'i' } } " +
       "] } " +
       "] }")
List fullSearch(String text, Date minDate, Date maxDate);
```

**Request:**
```
GET /posts/fullsearch?text=feliz&minDate=2018-03-01&maxDate=2018-03-31
```

**Response (200 OK):**
```json
[
  {
    "id": "507f191e810c19729de860eb",
    "date": "2018-03-23T00:00:00.000Z",
    "title": "Bom dia",
    "body": "Acordei feliz hoje!",  // Match aqui!
    "author": {
      "id": "507f1f77bcf86cd799439011",
      "name": "Maria Brown"
    },
    "comments": [
      {
        "text": "Tenha um ótimo dia!",
        "date": "2018-03-23T00:00:00.000Z",
        "author": {
          "id": "507f1f77bcf86cd799439012",
          "name": "Alex Green"
        }
      }
    ]
  }
]
```

> **Explicação da Query:**
> 1. `$and`: Combina múltiplas condições (todas devem ser verdadeiras)
> 2. `$gte` / `$lte`: Filtro de data (maior/menor ou igual)
> 3. `$or`: Busca em title OU body OU comments.text
> 4. `$regex`: Expressão regular case-insensitive
> 5. `comments.text`: Busca dentro de array aninhado (poder do NoSQL!)

</details>

### Listar Posts do Usuário (DBRef Lazy Loading)

<details>
<summary><b>GET /users/{id}/posts</b></summary>

**Como Funciona o DBRef:**
```java
// 1. Busca o User
User user = userRepository.findById(id);

// 2. Acessa user.getPosts() - TRIGGER lazy loading
List posts = user.getPosts();  
// MongoDB executa: db.post.find({_id: {$in: [ObjectIds...]}})
```

**Request:**
```
GET /users/507f1f77bcf86cd799439011/posts
```

**Response (200 OK):**
```json
[
  {
    "id": "507f191e810c19729de860ea",
    "date": "2018-03-21T00:00:00.000Z",
    "title": "Partiu viagem",
    "body": "Vou viajar para São Paulo. Abraços!",
    "author": {
      "id": "507f1f77bcf86cd799439011",
      "name": "Maria Brown"
    },
    "comments": [...]
  },
  {
    "id": "507f191e810c19729de860eb",
    "date": "2018-03-23T00:00:00.000Z",
    "title": "Bom dia",
    "body": "Acordei feliz hoje!",
    "author": {
      "id": "507f1f77bcf86cd799439011",
      "name": "Maria Brown"
    },
    "comments": [...]
  }
]
```

</details>

### Criar Novo Usuário (ObjectId Gerado Automaticamente)

<details>
<summary><b>POST /users</b></summary>

**Request Body:**
```json
{
  "name": "Carlos Silva",
  "email": "carlos@email.com"
}
```

**Response (201 Created):**
```json
{
  "id": "507f1f77bcf86cd799439014",  // ObjectId gerado pelo MongoDB
  "name": "Carlos Silva",
  "email": "carlos@email.com"
}
```

**Response Header:**
```
Location: /users/507f1f77bcf86cd799439014
```

**Documento MongoDB Criado:**
```javascript
{
  "_id": ObjectId("507f1f77bcf86cd799439014"),
  "name": "Carlos Silva",
  "email": "carlos@email.com",
  "posts": []
}
```

</details>

---

## 📦 Como Rodar o Projeto

### Pré-requisitos

- ☕ **Java 25** ou superior ([Download OpenJDK](https://openjdk.org/projects/jdk/25/))
- 📦 **Maven 3.9+** (ou use o wrapper: `./mvnw`)
- 🍃 **MongoDB 7.0+** ([Download Community Server](https://www.mongodb.com/try/download/community))
- 🐳 **Docker** (opcional, para MongoDB containerizado)

---

### 🍃 Opção 1: MongoDB Local (Standalone)

#### Instalação do MongoDB

**Windows:**
```bash
# Instale via MongoDB Installer ou Chocolatey
choco install mongodb

# Inicie o serviço
net start MongoDB
```

**macOS:**
```bash
# Instale via Homebrew
brew tap mongodb/brew
brew install mongodb-community@7.0

# Inicie o serviço
brew services start mongodb-community@7.0
```

**Linux (Ubuntu/Debian):**
```bash
# Instale MongoDB
wget -qO - https://www.mongodb.org/static/pgp/server-7.0.asc | sudo apt-key add -
echo "deb [ arch=amd64,arm64 ] https://repo.mongodb.org/apt/ubuntu jammy/mongodb-org/7.0 multiverse" | sudo tee /etc/apt/sources.list.d/mongodb-org-7.0.list
sudo apt-get update
sudo apt-get install -y mongodb-org

# Inicie o serviço
sudo systemctl start mongod
sudo systemctl enable mongod
```

#### Verificar Instalação
```bash
# Conectar ao MongoDB Shell
mongosh

# Verificar bancos de dados
show dbs

# Sair
exit
```

#### Rodar Aplicação
```bash
# Clone o repositório
git clone https://github.com/JoaoGuilhermmy/workshopmongo.git
cd workshopmongo

# Execute a aplicação
./mvnw spring-boot:run

# Acesse:
# 🌐 API: http://localhost:8080
# 📚 Swagger: http://localhost:8080/swagger-ui/index.html
```

---

### 🐳 Opção 2: MongoDB com Docker (Recomendado)

```bash
# Inicie MongoDB via Docker
docker run -d \
  --name mongodb \
  -p 27017:27017 \
  -e MONGO_INITDB_DATABASE=workshop_mongo \
  mongo:7.0

# Verificar se está rodando
docker ps

# Conectar via MongoDB Shell
docker exec -it mongodb mongosh

# Rodar a aplicação Spring Boot
./mvnw spring-boot:run
```

---

### 🔧 Configuração da Aplicação

**application.properties:**
```properties
spring.application.name=workshopmongo
spring.data.mongodb.uri=mongodb://localhost:27017/workshop_mongo
```

**Para MongoDB remoto (Railway/Atlas):**
```properties
spring.data.mongodb.uri=mongodb+srv://username:password@cluster.mongodb.net/workshop_mongo
```

---

## ☁️ Deploy em Produção (Railway com MongoDB)

A aplicação está hospedada na **Railway** com MongoDB gerenciado:

### ✨ Features da Railway

- ✅ **MongoDB Gerenciado**: Provisionado automaticamente
- ✅ **CI/CD Automático**: Deploy a cada push
- ✅ **Backups Automáticos**: Snapshots diários
- ✅ **Replica Sets**: Alta disponibilidade
- ✅ **HTTPS Nativo**: Certificados SSL/TLS

### 🌐 Acessar Aplicação em Produção

**URL Base:** [https://workshopmongodb-api-production.up.railway.app](https://workshopmongodb-api-production.up.railway.app/swagger-ui/index.html)  
**Swagger UI:** [https://workshopmongodb-api-production.up.railway.app/swagger-ui/index.html](https://workshopmongodb-api-production.up.railway.app/swagger-ui/index.html)

### ⚙️ Configurações do Deploy

| Configuração | Valor |
|--------------|-------|
| **Runtime** | Java 25 (OpenJDK) |
| **Build Command** | `mvn clean package -DskipTests` |
| **Start Command** | `java -jar target/workshopmongo-0.0.1-SNAPSHOT.jar` |
| **Port** | 8080 (auto-detect) |
| **Database** | MongoDB 7.0 (gerenciado pela Railway) |
| **Region** | US West |

---

## 📚 Documentação Interativa (Swagger/OpenAPI)

Acesse a interface interativa:

- **🌐 Produção**: [https://workshopmongodb-api-production.up.railway.app/swagger-ui/index.html](https://workshopmongodb-api-production.up.railway.app/swagger-ui/index.html)
- **💻 Local**: `http://localhost:8080/swagger-ui/index.html`

### 🎯 Recursos do Swagger UI

- ✅ Testar queries MongoDB com regex
- ✅ Filtros de data para busca avançada
- ✅ Visualizar documentos BSON formatados
- ✅ Exemplos de payloads JSON/BSON

---

## 🛠️ Conceitos NoSQL Aplicados

### MongoDB Query Language (MQL)

**Operadores Utilizados:**
```javascript
// Comparação
$gte   // Greater Than or Equal (maior ou igual)
$lte   // Less Than or Equal (menor ou igual)

// Lógicos
$and   // E lógico (todas condições verdadeiras)
$or    // OU lógico (pelo menos uma condição verdadeira)

// Strings
$regex    // Expressão regular
$options  // Opções do regex (i = case-insensitive)

// Arrays
$in    // Valor está no array
```

### Embedded Documents vs References

**Quando usar Embedded (Aninhado)?**
- ✅ Dados sempre acessados juntos (post + comentários)
- ✅ Relacionamento 1:N pequeno (poucos comentários por post)
- ✅ Dados não mudam frequentemente

**Quando usar DBRef (Referência)?**
- ✅ Relacionamento M:N
- ✅ Documento cresce indefinidamente
- ✅ Dados compartilhados entre documentos

### Desnormalização Estratégica

```java
// ❌ Ruim em NoSQL: Normalização excessiva
{
  "post": {
    "authorId": "507f...",  // Requer JOIN
    "title": "..."
  }
}

// ✅ Bom em NoSQL: Desnormalização
{
  "post": {
    "author": {           // Dados duplicados
      "id": "507f...",
      "name": "Maria"
    },
    "title": "..."
  }
}
```

---

## 📁 Estrutura do Projeto

```
workshopmongo/
│
├── src/
│   ├── main/
│   │   ├── java/com/joaoguilhermmy/workshopmongo/
│   │   │   ├── config/
│   │   │   │   ├── Instantiation.java       # Seed de dados inicial
│   │   │   │   ├── MongoConfig.java         # Configuração MongoDB
│   │   │   │   └── OpenApiConfig.java       # Swagger customizado
│   │   │   │
│   │   │   ├── domain/                      # Documentos MongoDB
│   │   │   │   ├── User.java                # @Document com @DBRef
│   │   │   │   └── Post.java                # @Document com array aninhado
│   │   │   │
│   │   │   ├── dto/                         # DTOs para desnormalização
│   │   │   │   ├── UserDTO.java             # User sem posts
│   │   │   │   ├── AuthorDTO.java           # Author embutido em Post
│   │   │   │   └── CommentDTO.java          # Comment aninhado em Post
│   │   │   │
│   │   │   ├── repository/                  # Repositórios MongoDB
│   │   │   │   ├── UserRepository.java      # CRUD básico
│   │   │   │   └── PostRepository.java      # Queries com @Query MQL
│   │   │   │
│   │   │   ├── service/                     # Lógica de negócio
│   │   │   │   ├── UserService.java         # CRUD + DTOs
│   │   │   │   └── PostService.java         # Buscas com regex
│   │   │   │
│   │   │   ├── resources/                   # Controllers REST
│   │   │   │   ├── UserResources.java       # Endpoints /users
│   │   │   │   ├── PostResources.java       # Endpoints /posts (queries)
│   │   │   │   ├── exception/               # Exception handlers
│   │   │   │   └── util/
│   │   │   │       └── URL.java             # Decodificação e parsing
│   │   │   │
│   │   │   ├── expection/                   # Exceções customizadas
│   │   │   │   ├── ResourcesNotFoundException.java
│   │   │   │   └── DatabaseException.java
│   │   │   │
│   │   │   └── WorkshopmongoApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties        # Configuração MongoDB URI
│   │
│   └── test/
│
├── pom.xml                                  # Dependências Maven
├── .gitignore
├── LICENSE                                  # MIT License
└── README.md
```

---

## 🤝 Autor & Contato

<div align="center">
  <img src="https://github.com/JoaoGuilhermmy.png" width="150px" style="border-radius: 50%;" alt="João Guilhermmy"/>
  
  ### João Guilhermmy
  
  💼 **Backend Developer | Java**
  
  [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/joão-guilhermmy-93661b29b)
  [![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:joaoguilhermmy2@gmail.com)
  [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/JoaoGuilhermmy)
  
  📧 **Email:** joaoguilhermmy2@gmail.com  
  🔗 **LinkedIn:** [linkedin.com/in/joão-guilhermmy-93661b29b](https://www.linkedin.com/in/joão-guilhermmy-93661b29b)  
  💻 **GitHub:** [github.com/JoaoGuilhermmy](https://github.com/JoaoGuilhermmy)
  
</div>

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

<div align="center">

**⭐ Se este projeto foi útil para você, considere dar uma estrela no repositório!**

Desenvolvido com ☕ e ❤️ por **João Guilhermmy**

![Spring Boot](https://img.shields.io/badge/Made%20with-Spring%20Boot-6DB33F?style=flat-square&logo=spring-boot)
![MongoDB](https://img.shields.io/badge/Powered%20by-MongoDB-47A248?style=flat-square&logo=mongodb)

</div>
