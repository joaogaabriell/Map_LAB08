# Lab 08 — Montagem de Sanduíches (Padrão Factory Method)

Atividade de laboratório da disciplina de **Métodos Avançados de Programação (MAP)**.

## Sobre o projeto

Implementação do padrão de projeto **Factory Method** combinado com **Template Method**:

- A classe abstrata `Sanduiche` define o algoritmo de montagem (`montarSanduiche()`) e declara os métodos-fábrica abstratos: `criarPao()`, `criarQueijo()`, `criarPresunto()` e `criarOvo()`.
- Cada subclasse decide quais ingredientes concretos usar:

| Sanduíche | Pão | Queijo | Presunto | Ovo |
|---|---|---|---|---|
| `SanduicheBolaComPeru` | Bola | Cheddar | Peru | Granja |
| `SanduicheFrancesComPeru` | Francês | Prato | Peru | Capoeira |
| `SanduicheIntegralComFrango` | Integral | Mussarela | Frango | Granja |

Os ingredientes são famílias de produtos definidas pelas interfaces `Pao`, `Queijo`, `Presunto` e `Ovo`, cada uma com suas variações concretas.

## Tecnologias

- Java
- Maven
- JUnit 5

## Como executar

Abra o projeto em uma IDE (IntelliJ, Eclipse) e execute a montagem instanciando um dos sanduíches:

```java
new SanduicheBolaComPeru().montarSanduiche();
```
