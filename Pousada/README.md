# Projeto  01:  
`Desenvolver  um  site  utilizando  apenas  HTML5/CSS para  uma POUSADA em  algum  ponto  turístico  do Brasil.`

`Deve conter:`

`a)` Página inicial falando sobre a pousada, contendo imagens e informações sobre a localização, apresentação da pousada e os serviços disponibilizados. Sistema de navegação para as demais páginas.

`b)`Página contendo   as   acomodações   da   pousada   (`quartos –apartamentos   ou   chalés`),   mostrar   suas características, fotos, o que cada quarto possui. Dividir em três tipos de categorias com diferentes tamanhos e preços. Sistema de navegação para as demais páginas.

`c)`Página exibindo os serviços da pousada. `Exemplos:` Massagem –Spa –Animação Infantil –Cozinha –Guia turístico, etc.  Sistema de navegação para as demais páginas.

`d)`Página com 15 imagens da pousada e/ou local onde ela está localizada. Sistema de navegação para as demais páginas.

`e)`Formulário de contato. Sistema de navegação para as demais páginas.

## Integrantes do grupo Gh3

```
Alexandre Pacheco do Couto (85657)
Allan Phyllyp Reis (85619)
Dihogo Cassimiro Teixeira (84082)
Fernando Borgatto Bouman (85833)
Ingrid Pinheiro (83579)
Juan Carlos Benvive Serrano (85468)
```

# Build do projeto no Docker:

Para criar a imagem do projeto certifique-se que esteja na pasta raiz dele e execute a sequencia de comandos: 

```
$ docker image build . -t pousada:latest

$ docker run -dti --name pousada-teste -p 8081:80 pousada
```
Conferindo se o container está em execução:

```
$ docker ps

CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                  NAMES
692d807ff1d2        pousada             "/usr/sbin/httpd -D …"   3 minutes ago       Up 3 minutes        0.0.0.0:8081->80/tcp   pousada-teste

```

Apos finalizado a subida do container acesse o endereço local da sua maquina indicando a porta exposta no host local:

`Exemplo:` http://127.0.0.1:8081

# Baixando imagem do dockerhub:

```
$ docker pull dihogoteixeira/gh3-pousada:latest

$ docker run -dti --name pousada-teste -p 8081:80 gh3-pousada:latest
```