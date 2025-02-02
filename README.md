﻿# challenge_conversor_de_moedas

Projeto em Java para converter moedas usando a API ExchangeRate-API.

## Descrição

Conversor de Moedas que oferece interação textual com os usuários, proporcionando 6 opções distintas de conversões de moedas em um menu.

## Funcionalidades

- Conversão entre diferentes moedas:
  - Dólar (USD) => Peso argentino (ARS)
  - Peso argentino (ARS) => Dólar (USD)
  - Dólar (USD) => Real brasileiro (BRL)
  - Real brasileiro (BRL) => Dólar (USD)
  - Dólar (USD) => Peso colombiano (COP)
  - Peso colombiano (COP) => Dólar (USD)

## Pré-requisitos

Para executar o projeto localmente, é necessário ter instalado:
- Java Development Kit (JDK) 8 ou superior
- Gson (biblioteca para parsing JSON)

## Como Executar

1. Clone o repositório para sua máquina local:

   ```bash
   git clone https://github.com/gabrieljuan045/challenge_conversor_de_moedas

2. Navegue até o diretório do projeto:

   ```bash
   cd challenge_conversor_de_moedas
   
3. Compile o projeto:

   ```bash
   javac -cp "src;lib/gson-2.10.1.jar" src/br/com/conversorMoedas/main/Principal.java -d out/production/Conversor_de_Moedas

4. Execute o programa:

   ```bash
   java -cp "out/production/Conversor_de_Moedas;lib/gson-2.10.1.jar" br.com.conversorMoedas.main.Principal
