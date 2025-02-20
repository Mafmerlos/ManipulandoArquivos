# 📌 Projeto: Processamento de Produtos CSV

## 📖 Descrição

Este projeto tem como objetivo ler um arquivo CSV contendo informações de produtos (nome, preço e quantidade), processá-los para calcular o total de cada produto (`preço * quantidade`) e gerar um novo arquivo CSV com um resumo dos dados. O projeto foi desenvolvido em **Java** e faz uso de classes de entrada/saída (**I/O**) para manipulação de arquivos.

---

## 🚀 Funcionalidades

✅ **Leitura do arquivo CSV**: O programa solicita o caminho do arquivo e lê seus dados.  
✅ **Processamento dos dados**: Cada linha do arquivo é processada para extrair o nome, preço e quantidade dos produtos. Em seguida, o total é calculado.  
✅ **Geração de arquivo resumo**: Cria um diretório de saída e grava um arquivo `summary.csv` contendo o nome do produto e seu total calculado.  
✅ **Validação dos dados**: Implementa verificações para evitar erros na leitura e conversão dos dados, garantindo que o arquivo possua o formato correto.

---

## 🎯 O Que Aprendi

📌 **Manipulação de Arquivos em Java**  
- Utilização das classes `BufferedReader`, `BufferedWriter`, `FileReader` e `FileWriter` para leitura e gravação de arquivos.
- Criação de diretórios usando a classe `File`.

📌 **Tratamento de Exceções**  
- Importância de capturar e tratar exceções para evitar falhas na execução e fornecer mensagens de erro mais claras ao usuário.

📌 **Validação e Tratamento de Dados**  
- Técnicas para validar e sanitizar os dados lidos dos arquivos.
- Como evitar erros como `IndexOutOfBoundsException` e `NullPointerException`.

📌 **Uso de Coleções**  
- Trabalhei com `List` e `ArrayList` para armazenar e manipular objetos de forma eficiente.

📌 **Programação Orientada a Objetos (POO)**  
- Aplicação de conceitos de encapsulamento e modularidade.
- Separação da lógica de negócio (`Product.java`) e lógica de aplicação (`Main.java`).

---

## 📌 Considerações Finais

Este projeto serviu como uma excelente oportunidade para aplicar e consolidar conceitos fundamentais de **Java**, principalmente no que tange à **manipulação de arquivos** e **tratamento de exceções**. Continuarei explorando e aprimorando essas técnicas em projetos futuros, sempre visando a melhoria da qualidade do código e a robustez das aplicações. 🚀

