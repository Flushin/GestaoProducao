# 🏭 Gestão de Produção Industrial

&#x20;&#x20;

---

## 🔹 Descrição

Sistema para gerenciamento da produção, estoque e logística industrial.\
Permite controlar todas as etapas da produção:

- **Pintura Virgem**
- **Corte**
- **Pintura Personalização**
- **Dobra**
- **Finalização**

Inclui funcionalidades administrativas e de manutenção, com visão completa para o ADM.

---

## 📂 Estrutura do Projeto

```
src/
└── br.com.suaempresa.gestaoproducao/
    ├── model/         → Entidades e enums
    ├── repository/    → Persistência de dados
    ├── service/       → Regras de negócio e cálculos
    ├── controller/    → Interface/menus/endpoints
    ├── dto/           → Objetos de transporte de dados
    └── util/          → Métodos auxiliares
```

---

## 🧱 Classes Principais

### Estoque

- `ItemEstoque` (base) → id, nome, quantidade, medida
- `Chapa` → cor, dimensões
- `Tinta` → cor, emUso, volumeTotal, volumeRestante

### Enumerações

- `UnidadeMedida` → LITRO, UNIDADE, ROLO, SUPORTE, CAIXA, CHAPA
- `StatusProcesso` → PLANEJADO, EM\_EXECUCAO, CONCLUIDO

### Processos

- `Processo` (classe abstrata) → id, nome, responsável, dataProgramacao, status
- Futuras subclasses: `PinturaVirgem`, `Corte`, `PinturaPersonalizacao`, `Dobra`, `Finalizacao`

---

## ⚙️ Funcionalidades Planejadas

- Controle de estoque de chapas, tintas, insumos, suportes, caixas e latas
- Registro de produção diária por etapa
- Programação semanal das atividades de cada unidade
- Administração/logística: visão completa de recursos, entregas, matérias-primas
- Manutenção: programação e controle de insumos
- Futuro: clientes poderão acompanhar pedidos e datas de entrega

---

## 💡 Boas Práticas Aplicadas

- Encapsulamento: atributos privados com getters/setters
- Herança: classes específicas de estoque e processos herdam classes base
- Enumerações para status e unidades de medida
- Arquitetura em camadas: modelo, serviço, repositório, controller
- Preparado para evolução: fácil integração com banco de dados e interface gráfica/API

---

## 🚀 Como usar

1. Abrir o projeto no IntelliJ
2. Criar subclasses de processos e implementar regras de negócio
3. Futuramente, integrar com banco de dados e interface de usuário

