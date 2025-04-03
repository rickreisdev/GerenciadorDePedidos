# 🍣 Sistema de Gerenciamento de Pedidos - Restaurante Delivery

## 📌 Sobre o Projeto
Este é um sistema de gerenciamento de pedidos para complementar um site fictício de restaurante delivery de comida japonesa, JapaCasa!
O objetivo é criar uma aplicação independente capaz de receber pedidos do carrinho do site existente, gerenciar atualizações de status e controlar entregas.

🚧 **O sistema está atualmente em desenvolvimento.**

Confira o projeto do site do JapaCasa! [aqui](https://github.com/rickreisdev/JapaCasa)

## 🚀 Tecnologias Utilizadas
### **Frontend**
- [Next.js](https://nextjs.org/) + React
- TypeScript
- Tailwind CSS ou Styled-Components
- React Query
- Jest + React Testing Library (para testes)

### **Backend**
- [Spring Boot](https://spring.io/projects/spring-boot)
- PostgreSQL
- Spring Data JPA
- WebSockets (para notificações em tempo real)
- JUnit (para testes)

### **Banco de Dados**
- PostgreSQL

## 🔗 Funcionalidades Previstas
✅ Receber pedidos do site externo via API REST
✅ Atualizar status dos pedidos e entregas
✅ Painel administrativo para gerenciar pedidos
✅ Notificações em tempo real via WebSockets
✅ Integração desacoplada com o site do restaurante
✅ UI/UX responsivo e intuitivo

## 🛠️ Estrutura do Projeto
```
📂 gerenciador-de-pedidos
 ├── 📂 frontend (Next.js)
 ├── 📂 backend (Spring Boot)
 ├── 📜 README.md
```

## 🎯 Como Executar o Projeto
### **1. Clonar o Repositório**
```bash
git clone https://github.com/rickreisdev/GerenciadorDePedidos.git
cd GerenciadorDePedidos
```

### **2. Configurar e Rodar o Backend**
```bash
cd backend
# Configurar .env com os dados do PostgreSQL
./mvnw spring-boot:run
```

### **3. Configurar e Rodar o Frontend**
```bash
cd frontend
npm install
npm run dev
```

## 👥 Desenvolvedores
- **Rickson Reis** - [GitHub](https://github.com/rickreisdev)
- **João Henrique** - [GitHub](https://github.com/Ja1zinh0)

---
📌 O sistema ainda está em desenvolvimento. Novas atualizações serão disponibilizadas em breve!
