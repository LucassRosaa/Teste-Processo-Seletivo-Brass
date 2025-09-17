 README – Análise de Dutos

Este projeto foi desenvolvido como parte de um processo seletivo de estágio.
Ele lê um arquivo CSV (TesteEstagio.csv) contendo dados de operação de dutos e realiza análises básicas, como:

Tempo total de operação (com base em valores acima de 1000);

Quantidade de operações detectadas;

Valor máximo registrado;

Primeiro horário em que a vazão ultrapassou 1500.

 Estrutura do Projeto

O projeto contém os seguintes arquivos .java:

Main.java → Classe principal que executa o programa.

Registro.java → Representa uma linha do CSV, armazenando valores por coluna.

LeitorCSV.java → Responsável por carregar e interpretar o arquivo CSV.

AnalisadorDuto.java → Contém a lógica de análise dos dados.

Além disso, é necessário um arquivo TesteEstagio.csv, que deve estar na mesma pasta dos .java.

 Pré-requisitos

Java JDK 8 ou superior instalado

Variável de ambiente JAVA_HOME configurada (opcional, mas recomendado)

Terminal / Prompt de comando

Para verificar se o Java está instalado corretamente:

java -version
javac -version

Como Compilar e Executar

As instruções abaixo assumem que você está no terminal (Linux) ou no Prompt de Comando / PowerShell (Windows), dentro da pasta raiz do projeto.

Instruções para Linux

Abra o Terminal.

Navegue até a pasta do projeto:

cd /home/usuario/Documentos/TesteBrass


Compile todos os arquivos .java:

javac *.java


Isso vai gerar os arquivos .class na mesma pasta.

Execute o programa:

java Main

Instruções para Windows

Abra o Prompt de Comando (CMD) ou PowerShell.

Navegue até a pasta do projeto:

cd "C:\Users\lucas\OneDrive\Área de Trabalho\TesteBrass"


Compile todos os arquivos .java:

javac *.java


Execute o programa:

java Main

Exemplo de saída
Coluna: Vazão, descarga da EB
Horas de operação: 19
Qtd de operações: 9
Valor máximo: 1250898.588
Primeiro horário > 1500: 00:03:36
