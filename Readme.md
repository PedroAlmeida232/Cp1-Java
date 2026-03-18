# Auto Escola — CP1 de Design e Desenvolvimento de Domínio (DDD) Java

---

**Aluno:** Pedro Rodrigues Almeida  
**RM:** 564711  
**Disciplina:** Design e Desenvolvimento de Domínio (DDD) — Java  
**Atividade:** CP1 — Checkpoint 1

---

## Descrição do Projeto

Este projeto simula o sistema de uma **Auto Escola**, desenvolvido como parte do CP1 da disciplina de DDD Java. O objetivo é aplicar conceitos de **Orientação a Objetos** em Java, como criação de classes, atributos, métodos, instâncias e relacionamentos entre objetos.

O sistema permite:
- Cadastrar alunos com suas informações e tipo de veículo
- Agendar e cancelar aulas teóricas e práticas
- Realizar o exame de habilitação com validação de pré-requisitos
- Exibir um resumo completo de todos os alunos da auto escola

---

## Estrutura do Projeto

```
AutoEscola
 ┣ Aluno.java
 ┣ Instrutor.java
 ┣ Veiculo.java
 ┣ AutoEscola.java
 ┗ Main.java
```

---

## Diagrama de Classes UML

O diagrama abaixo representa a estrutura das classes do sistema, seus atributos, métodos e os relacionamentos entre elas:

![Diagrama de Classe UML](DigramaDeClasseUML_drawio.png)

---

## Classes e Responsabilidades

### `Aluno.java`

Representa um aluno matriculado na auto escola.

**Atributos:**
| Atributo | Tipo | Descrição |
|---|---|---|
| `nome` | `String` | Nome completo do aluno |
| `idade` | `int` | Idade do aluno |
| `tipoVeiculo` | `String` | Tipo de veículo (Carro ou Moto) |
| `aulasTeoricas` | `int` | Contador de aulas teóricas realizadas |
| `aulasPraticas` | `int` | Contador de aulas práticas realizadas |
| `aprovado` | `boolean` | Status de aprovação no exame |

**Métodos:**
| Método | Descrição |
|---|---|
| `agendarAulaTeorica()` | Incrementa o contador de aulas teóricas |
| `agendarAulaPratica()` | Incrementa o contador de aulas práticas |
| `cancelarAulaTeorica()` | Decrementa o contador de aulas teóricas |
| `cancelarAulaPratica()` | Decrementa o contador de aulas práticas |
| `realizarExame()` | Verifica se o aluno tem o mínimo de 5 aulas teóricas e 5 práticas para realizar o exame. Se sim, aprova o aluno; caso contrário, exibe mensagem de erro |

---

### `Instrutor.java`

Representa um instrutor da auto escola.

**Atributos:**
| Atributo | Tipo | Descrição |
|---|---|---|
| `nome` | `String` | Nome do instrutor |
| `experiencia` | `int` | Anos de experiência |
| `categoria` | `String` | Categoria de veículo que leciona |

---

### `Veiculo.java`

Representa um veículo disponível na auto escola.

**Atributos:**
| Atributo | Tipo | Descrição |
|---|---|---|
| `tipo` | `String` | Tipo do veículo (Carro ou Moto) |
| `modelo` | `String` | Modelo do veículo |
| `placa` | `String` | Placa do veículo |

---

### `AutoEscola.java`

Representa a auto escola em si, agregando os alunos cadastrados.

**Atributos:**
| Atributo | Tipo | Descrição |
|---|---|---|
| `aluno1` | `Aluno` | Referência ao objeto do Aluno 1 |
| `aluno2` | `Aluno` | Referência ao objeto do Aluno 2 |
| `aluno3` | `Aluno` | Referência ao objeto do Aluno 3 |
| `aluno4` | `Aluno` | Referência ao objeto do Aluno 4 |

**Métodos:**
| Método | Descrição |
|---|---|
| `exibirResumo()` | Exibe no console as informações completas de todos os alunos cadastrados |

---

### `Main.java`

Classe principal que inicializa e executa o sistema. Responsável por:

1. **Criar e configurar 4 alunos** com seus respectivos dados (nome, idade, tipo de veículo, quantidade de aulas)
2. **Criar um instrutor** com nome, experiência e categoria
3. **Criar um veículo** com tipo, modelo e placa
4. **Simular o agendamento e cancelamento** de aulas para o Aluno 1
5. **Realizar o exame** para todos os 4 alunos
6. **Instanciar a AutoEscola**, associar os alunos e exibir o resumo completo

---

## Fluxo de Execução

```
Main
 ├── Cria Aluno 1 (Pedro, 19 anos, Carro) → 4 aulas teóricas, 5 práticas
 ├── Cria Aluno 2 (Sergio, 25 anos, Moto) → 5 aulas teóricas, 6 práticas
 ├── Cria Aluno 3 (Guilherme, 20 anos, Carro) → 5 aulas teóricas, 4 práticas
 ├── Cria Aluno 4 (Gustavo, 45 anos, Moto) → 7 aulas teóricas, 5 práticas
 ├── Cria Instrutor (Julia, 3 anos exp., Carro)
 ├── Cria Veículo (Carro, Picape, 232A-232)
 │
 ├── Aluno 1: agendarAulaPratica() → aulasPraticas = 6
 ├── Aluno 1: agendarAulaTeorica() → aulasTeoricas = 5
 ├── Aluno 1: cancelarAulaPratica() → aulasPraticas = 5
 ├── Aluno 1: cancelarAulaTeorica() → aulasTeoricas = 4
 │
 ├── realizarExame() para todos os alunos
 │    ├── Aluno 1 (Pedro): 4 teóricas, 5 práticas → Nao aprovado
 │    ├── Aluno 2 (Sergio): 5 teóricas, 6 práticas → Aprovado
 │    ├── Aluno 3 (Guilherme): 5 teóricas, 4 práticas → Nao aprovado
 │    └── Aluno 4 (Gustavo): 7 teóricas, 5 práticas → Aprovado
 │
 └── AutoEscola.exibirResumo() → Exibe informações de todos os alunos
```

---

## Regra de Negócio — Realização do Exame

Para que um aluno possa realizar o exame de habilitação, é obrigatório ter:

- No mínimo **5 aulas teóricas**
- No mínimo **5 aulas práticas**

Caso qualquer um dos requisitos não seja atendido, o sistema exibe a mensagem:

```
Nao foi possivel realizar o exame , voce deve ter no minimo 5 aulas teoricas e 5 aulas praticas
```

---

## Conceitos de POO Aplicados

| Conceito | Aplicação no Projeto |
|---|---|
| **Classes** | `Aluno`, `Instrutor`, `Veiculo`, `AutoEscola` |
| **Objetos** | Instâncias criadas no `Main.java` |
| **Atributos** | Dados que descrevem cada entidade |
| **Métodos** | Comportamentos como `agendarAulaTeorica()`, `realizarExame()` |
| **Encapsulamento** | Atributos e métodos agrupados dentro de suas classes |
| **Composição** | `AutoEscola` contém referências a objetos do tipo `Aluno` |

---

## Como Executar

1. Certifique-se de ter o **JDK** instalado (versão 8 ou superior)
2. Compile todos os arquivos `.java`:
```bash
javac Aluno.java Instrutor.java Veiculo.java AutoEscola.java Main.java
```
3. Execute a classe principal:
```bash
java Main
```

---

*Projeto desenvolvido para fins acadêmicos — FIAP*