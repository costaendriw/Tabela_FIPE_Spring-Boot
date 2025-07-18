# 🚗 Tabela FIPE (Spring Boot)

Este projeto é uma API RESTful desenvolvida com Spring Boot que consome e disponibiliza dados da Tabela FIPE (Fundação Instituto de Pesquisas Econômicas). Ele permite consultar informações de veículos (marcas, modelos, anos e valores médios) de forma programática e estruturada. Ótimo para quem precisa integrar dados de veículos em suas aplicações!

## ✨ Funcionalidades

A API permite realizar consultas detalhadas sobre veículos baseadas na Tabela FIPE:

* **Listar Marcas:** Obtenha todas as marcas de veículos disponíveis na Tabela FIPE.
* **Listar Modelos por Marca:** Para uma marca específica, retorne todos os modelos de veículos associados.
* **Listar Anos por Modelo:** Para um modelo específico, obtenha os anos de fabricação/modelo disponíveis.
* **Consultar Valor de Veículo:** Obtenha o valor médio de mercado de um veículo específico, combinando marca, modelo e ano.

## 🛠️ Tecnologias Utilizadas

Este projeto foi construído utilizando as seguintes tecnologias:

* **Java:** A linguagem de programação principal.
* **Spring Boot:** Framework robusto para desenvolvimento de aplicações Java, facilitando a criação de APIs RESTful.
* **APIs RESTful:** Utilizado para consumir dados da API externa da Tabela FIPE.
* **JSON:** Formato de troca de dados entre a API e as respostas.

# 🚗 Tabela FIPE (Spring Boot)

Este projeto é uma API RESTful desenvolvida com Spring Boot que consome e disponibiliza dados da Tabela FIPE (Fundação Instituto de Pesquisas Econômicas). Ele permite consultar informações de veículos (marcas, modelos, anos e valores médios) de forma programática e estruturada. Ótimo para quem precisa integrar dados de veículos em suas aplicações!

## ✨ Funcionalidades

A API permite realizar consultas detalhadas sobre veículos baseadas na Tabela FIPE:

* **Listar Marcas:** Obtenha todas as marcas de veículos disponíveis na Tabela FIPE.
* **Listar Modelos por Marca:** Para uma marca específica, retorne todos os modelos de veículos associados.
* **Listar Anos por Modelo:** Para um modelo específico, obtenha os anos de fabricação/modelo disponíveis.
* **Consultar Valor de Veículo:** Obtenha o valor médio de mercado de um veículo específico, combinando marca, modelo e ano.

## 🛠️ Tecnologias Utilizadas

Este projeto foi construído utilizando as seguintes tecnologias:

* **Java:** A linguagem de programação principal.
* **Spring Boot:** Framework robusto para desenvolvimento de aplicações Java, facilitando a criação de APIs RESTful.
* **APIs RESTful:** Utilizado para consumir dados da API externa da Tabela FIPE.
* **JSON:** Formato de troca de dados entre a API e as respostas.

## ⚙️ Pré-requisitos para Execução

Para rodar esta API em sua máquina, você precisará de:

* [**Java Development Kit (JDK) 17 ou superior**](https://www.oracle.com/java/technologies/downloads/)
* Uma IDE Java como [**IntelliJ IDEA**](https://www.jetbrains.com/idea/download/) ou [**Eclipse**](https://www.eclipse.org/downloads/)
* [**Maven**](https://maven.apache.org/download.cgi) (gerenciador de dependências, geralmente já incluído nas IDEs)

## ▶️ Como Configurar e Executar o Projeto

Siga estes passos para ter a API rodando em seu ambiente:

1.  **Clone o Repositório:**
    Abra seu terminal ou Git Bash e execute o comando:
    ```bash
    git clone [https://github.com/costaendriw/tabela-fipe-spring.git](https://github.com/costaendriw/tabela-fipe-spring.git)
    ```

2.  **Navegue até o Diretório do Projeto:**
    ```bash
    cd tabela-fipe-spring
    ```

3.  **Importe o Projeto na sua IDE:**
    * Abra sua IDE (IntelliJ IDEA, Eclipse).
    * Selecione "Open" ou "Import Project" e navegue até a pasta `tabela-fipe-spring` que você clonou.
    * A IDE deve reconhecer o projeto Maven automaticamente e baixar as dependências.

4.  **Execute a Aplicação:**
    * Encontre o arquivo principal da aplicação (geralmente `TabelaFipeApplication.java` ou similar, dentro de `src/main/java/...`).
    * Clique com o botão direito nele e selecione "Run 'TabelaFipeApplication.main()'".

    A API será iniciada e estará disponível, por padrão, em `http://localhost:8080`.

## 🧪 Como Testar a API

Você pode usar seu navegador ou ferramentas como [Postman](https://www.postman.com/downloads/) ou [Insomnia](https://insomnia.rest/download) para testar os endpoints. Abaixo estão exemplos de URLs que a API pode expor:

* **Listar Marcas de Carros:**
    `http://localhost:8080/carros`
* **Listar Modelos de uma Marca Específica (ex: Ford):**
    `http://localhost:8080/carros/Ford/modelos`
* **Consultar o Valor de um Carro Específico (ex: Gol, 2015):**
    `http://localhost:8080/carros/Volkswagen/Gol/2015`

*(Nota: Os endpoints exatos podem variar ligeiramente dependendo da sua implementação no código, mas seguem essa lógica.)*

## 🤝 Contribuição

Contribuições são sempre bem-venidas! Se você tiver sugestões, melhorias ou encontrar algum bug, sinta-se à vontade para:

1.  Fazer um `fork` do projeto.
2.  Criar uma `branch` para sua funcionalidade (`git checkout -b feature/MinhaNovaFuncionalidade`).
3.  Fazer suas alterações.
4.  Comitar suas mudanças (`git commit -m 'Adiciona nova funcionalidade X'`).
5.  Enviar para sua `branch` (`git push origin feature/MinhaNovaFuncionalidade`).
6.  Abrir um `Pull Request`.

## 📄 Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
