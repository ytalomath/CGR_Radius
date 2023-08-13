# CGR - Centro de Gerenciamento Radius

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/ytalomath/radius/blob/main/LICENSE)

# Sobre o projeto

O "Centro de Gerenciamento Radius" é uma aplicação que surge com o objetivo de aprimorar a prática da programação em Java, incorporando a busca pelo conhecimento nas funcionalidades relacionadas ao serviço de autenticação Freeradius. Através deste projeto, minha intenção é adquirir um maior entendimento sobre a manipulação de tabelas e a gestão de dados em um ambiente real que utiliza o serviço Freeradius em conjunto com um banco de dados MYSQL para centralizar autenticações.

A aplicação engloba um conjunto de ações voltadas para os dados armazenados no banco de dados. Estas ações incluem a adição de novos usuários, a edição das regras atribuídas a esses usuários e até mesmo a visualização dos dados relacionados às autenticações dos logins.

É importante mencionar que essa experiência também se mostrou extremamente proveitosa para o aprimoramento do meu inglês, uma habilidade amplamente requisitada nos dias de hoje.

Neste contexto que apresento, estou realizando manipulações nos dados armazenados no banco de dados do serviço Freeradius, que está hospedado localmente por meio de máquinas virtuais. Nesse ambiente, criei um laboratório completo para explorar diversas ferramentas, tais como Zabbix, Grafana, Freeradius, MySql, ElasticSearch, Kibana, entre outras.

Com o intuito de aprofundar minha experiência prática com o Freeradius, configurei um servidor PPPOE na minha RouterBoard Hex Lite, que está instalada em minha residência. Por meio de roteadores secundários ou até mesmo dos próprios dispositivos, como computadores e notebooks, estou testando a autenticação dos usuários inseridos no banco de dados.


## Interface Inicial

![Screen1](https://github.com/ytalomath/radius/blob/main/assets/CGR.png)

Utilizando os botões da interface, tenho a capacidade de navegar pela aplicação e executar as ações indispensáveis para os logins desejados.


## Interface do historico de autenticações de um determinado login informado pelo usuário

![Screen2](https://github.com/ytalomath/radius/blob/main/assets/CGR1.png)

Ao realizar uma pesquisa por um usuário específico, o programa apresenta informações de grande valor relacionadas ao histórico de autenticação. Isso inclui detalhes como o IP associado a cada login e o período durante o qual a autenticação esteve ativa. Esses dados são de extrema importância para a avaliação de potenciais problemas de autenticação.

# Tecnologias utilizadas
## Back end
Java

## Front end
Java

Swing

## Implantação em produção
Banco de dados: MySql

# Como executar o projeto
Pré-requisitos: Java Runtime Environment (JRE)

# Autor

Ytalo Matheus Silva

https://github.com/ytalomath
