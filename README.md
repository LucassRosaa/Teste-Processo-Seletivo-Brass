# Projeto de Análise de Dados de Vazão

Este projeto foi desenvolvido como parte de um processo seletivo de estágio.  
Ele lê um arquivo CSV (`TesteEstagio.csv`) contendo dados de operação de dutos e realiza análises básicas, como:

- Tempo total de operação (com base em valores acima de 1000);
- Quantidade de operações detectadas;
- Valor máximo registrado;
- Primeiro horário em que a vazão ultrapassou 1500.

---

## Estrutura do Projeto

O projeto contém os seguintes arquivos `.java`:

- **Main.java** → Classe principal que executa o programa.  
- **Registro.java** → Representa uma linha do CSV, armazenando valores por coluna.  
- **LeitorCSV.java** → Responsável por carregar e interpretar o arquivo CSV.  
- **AnaliseDuto.java** → Contém a lógica de análise dos dados.

Além disso, é necessário um arquivo **TesteEstagio.csv**, que deve estar na mesma pasta dos `.java`.

---

## Pré-requisitos

- Java JDK 8 ou superior instalado  
- Variável de ambiente `JAVA_HOME` configurada (opcional, mas recomendado)  
- Terminal / Prompt de comando

Para verificar se o Java está instalado corretamente:

```bash
java -version
javac -version
Como compilar
Abra o terminal na pasta onde estão os arquivos .java e rode:

bash
Copiar código
javac *.java
Isso irá compilar todos os arquivos e gerar os .class.

Como executar
Após a compilação, execute o programa com:

bash
Copiar código
java Main
O programa irá:

Ler o arquivo TesteEstagio.csv

Extrair os dados da coluna Vazao, descarga da EB

Exibir no console os resultados da análise

Exemplo de saída
yaml
Copiar código
Coluna: Vazao, descarga da EB
Horas de operação: 5
Qtd de operações: 3
Valor máximo: 1870.5
Primeiro horário > 1500: 12:30
