Projeto Processamento de Produtos CSV
Descrição
Este projeto tem como objetivo ler um arquivo CSV contendo informações de produtos (nome, preço e quantidade), processá-los para calcular o total de cada produto (preço * quantidade) e gerar um novo arquivo CSV com um resumo dos dados. O projeto foi desenvolvido em Java e faz uso de classes de entrada/saída (I/O) para manipulação de arquivos.

Funcionalidades
Leitura do arquivo CSV: O programa solicita o caminho do arquivo e lê seus dados.
Processamento dos dados: Cada linha do arquivo é processada para extrair o nome, preço e quantidade dos produtos. Em seguida, o total é calculado.
Geração de arquivo resumo: Cria um diretório de saída e grava um arquivo summary.csv contendo o nome do produto e seu total calculado.
Validação dos dados: São implementadas verificações para evitar erros na leitura e conversão dos dados, garantindo que o arquivo possua o formato correto.

O Que Aprendi
Durante o desenvolvimento deste projeto, pude aprofundar e consolidar conhecimentos em diversas áreas:

Manipulação de Arquivos em Java:
Aprendi a utilizar as classes BufferedReader, BufferedWriter, FileReader e FileWriter para leitura e gravação de arquivos, bem como a criação de diretórios usando a classe File.

Tratamento de Exceções:
Entendi a importância de tratar exceções de I/O para evitar falhas durante a execução e fornecer mensagens de erro significativas ao usuário.

Validação e Tratamento de Dados:
Desenvolvi técnicas para validar e sanitizar os dados lidos de arquivos, evitando erros como IndexOutOfBoundsException e NullPointerException e garantindo a integridade dos dados processados.

Uso de Coleções:
Trabalhei com a interface List e a classe ArrayList para armazenar e manipular objetos de forma dinâmica, demonstrando a eficiência do uso de coleções em Java.

Programação Orientada a Objetos:
O projeto reforçou conceitos de encapsulamento e modularidade, ao separar a lógica de negócio (classe Product) da lógica de aplicação (classe Main).

Considerações Finais
Este projeto serviu como uma excelente oportunidade para aplicar e consolidar conceitos fundamentais de Java, principalmente no que tange à manipulação de arquivos e tratamento de exceções. Continuarei a explorar e aprimorar essas técnicas em projetos futuros, visando sempre a melhoria na qualidade do código e na robustez das aplicações.

