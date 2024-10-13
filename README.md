# Desenvolvimento Ágil com Java Avançado

Este repositório contém os projetos desenvolvidos durante o curso **Desenvolvimento Ágil com Java Avançado** da **Coursera/ITA**. O curso aborda práticas avançadas de desenvolvimento de software com Java, utilizando conceitos de agilidade no desenvolvimento e ferramentas relacionadas.

## Projetos

### 1. **Somar Parcelas**
Um projeto simples para somar dois valores informados por um usuário via formulário HTML. O backend utiliza `Servlets` para processar os dados e exibir o resultado da soma.

#### Tecnologias Utilizadas:
- Java (Servlets)
- HTML
- GlassFish
- Selenium (para testes automatizados)

#### Como Executar:
1. Certifique-se de que o servidor **GlassFish** está instalado e rodando.
2. Importe o projeto para uma IDE como NetBeans ou IntelliJ.
3. Acesse a página HTML localizada em `web/index.html`:
    ```bash
    http://localhost:8080/SomarParcelas/
    ```
4. Insira os valores das parcelas e clique em "Calcular".
5. O resultado da soma será exibido na página.

#### Como Executar os Testes:
Este projeto utiliza o Selenium para automação de testes de interface. Para executar os testes:
1. Configure o Selenium WebDriver (pode ser o ChromeDriver ou GeckoDriver).
2. Execute o teste automatizado na classe `TestePaginaSoma.java`.
3. Certifique-se de que o servidor está rodando na URL `http://localhost:8080/SomarParcelas/`.

---

### 2. **Cesta Genérica**
Um projeto que demonstra o uso de tipos genéricos em Java, utilizando uma classe `Cesta` que pode conter diferentes tipos de objetos, como `Fruta` e suas subclasses.

#### Tecnologias Utilizadas:
- Java (Generics)
- Coleções (ArrayList)
  
#### Descrição:
A classe `Cesta<E>` permite adicionar e remover elementos genéricos, onde `E` é o tipo genérico que será definido no momento da criação da cesta. Também demonstra o uso de métodos que aceitam coleções de tipos mais específicos (`? extends E`).

#### Como Executar:
1. Compile e execute a classe `Principal.java`, que faz uso da classe `Cesta` e das classes `Fruta` e `FrutaVermelha`.
2. O programa adiciona diferentes tipos de frutas à cesta e as remove de forma aleatória, imprimindo o resultado no console.

### Contato

Se você tiver dúvidas ou sugestões, sinta-se à vontade para entrar em contato:

- Nome: Jonathan
- LinkedIn: [linkedin.com/in/jhonedev](https://www.linkedin.com/in/jhonedev/)
