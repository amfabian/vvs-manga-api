# Plano de Testes para vvs-manga-api

##  ResourceTest  
### Testa a API e seus Endpoints
1. testHome: Testa se o web service (ws) página **Home** (Página inicial de Projetos Quarkus) está funcionando, i.e., verifica se retorna 200 como status.
2. testErrorPath: Testa se o ws retorna erro, caso tente acessar um **path que não exite**. Resultado esperado é 404 como status code.
3. testSearch: Testa se o ws consegue fazer a busca acessando a api externa. Resultado esperado é 200 como status code.
4. testAPI: Testa se o ws consegue fazer a busca por "isekai" acessando a api externa e confere se o retorno faz sentido, i.e., verifica por um id de um mangá que atente ao termo pesquisado.
5. testAPIJSON: Testa o ws com a busca de um termo um pouco mais complexo e confere se retorna um id de um mangá que atendo ao termo pesquisado.


##  SistemaTest 
### Teste de Sistema, utilizando o Selenium

1. googleTest: Primeiro é feito um teste simples na página inicial do Google, pra verificar se o webDriver está funcionando, procurando pelo termo pesquisado "automation" no Titulo da página.  O Retorno esperado é *true*, para o caso que contenha o termo.
2. homeTest: Testa o carregamento da página Home e procura pela Palavra "Quarkus" no h1 da página. O Retorno esperado é *true*, para o caso que contenha o termo.
3. dataTestNotNull: Faz uma pesquisa por um termo no endpoint do ws e verifica se o retorno é diferente de Null. O Retorno esperado é *true*, para o caso do JSON não ser vazio.
4. dataTestTrue: Faz uma pesquisa por um termo no endpoint do ws e verifica se o JSON retornado contem a palavra-chave "myanimelist.net".  O Retorno esperado é *true*, para o caso que contenha o termo.
5. dataTestFalse:  Faz uma pesquisa por um termo no endpoint do ws e verifica se o JSON retornado contem uma palavra-chave invalida. O Retorno esperado é *false*, para o caso que não contenha o termo.