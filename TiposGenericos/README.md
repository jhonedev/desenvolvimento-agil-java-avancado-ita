# Projeto: Uso de Tipos Genéricos em Java

Este projeto demonstra o uso de tipos genéricos em Java através da implementação de uma classe `Cesta<E>`, onde `E` é um tipo genérico que pode ser substituído por qualquer tipo de objeto. A classe permite armazenar e manipular diferentes tipos de objetos de forma flexível e segura, garantindo o uso correto dos tipos em tempo de compilação.

## Quando Aceitamos Tipos Genéricos?

- **Adição de Elementos:** A classe `Cesta<E>` permite adicionar elementos de qualquer tipo que substitua `E`. Por exemplo, utilizamos `Cesta<Fruta>`, o que nos permite adicionar qualquer objeto da classe `Fruta` ou suas subclasses.
  - Método `adiciona(E elemento)`: Aceita qualquer elemento que seja uma instância de `E` ou de suas subclasses.
  - Método `adicionaTodos(Collection<? extends E>)`: Utilizamos o wildcard (`? extends E`) para aceitar coleções que contenham objetos de `E` ou de suas subclasses.

## Quando Não Aceitamos Tipos Genéricos?

- **Subtipos Incompatíveis:** Não é possível adicionar diretamente objetos de tipos incompatíveis ou não relacionados. Por exemplo, se uma `Cesta<Fruta>` é declarada, não é permitido adicionar objetos de uma classe que não herde de `Fruta`, pois isso geraria um erro em tempo de compilação.
  
- **Tipos Fixos em Tempo de Execução:** Em Java, os tipos genéricos são "apagados" (type erasure) em tempo de execução, o que significa que operações como verificar o tipo exato de `E` em tempo de execução não são permitidas.

## Exemplo de Uso

```java
Cesta<Fruta> frutas = new Cesta<>();
frutas.adiciona(new Fruta("Maçã"));
frutas.adiciona(new FrutaVermelha("Morango"));

List<FrutaVermelha> vermelhas = new ArrayList<>();
vermelhas.add(new FrutaVermelha("Amora"));
vermelhas.add(new FrutaVermelha("Cereja"));

frutas.adicionaTodos(vermelhas);
