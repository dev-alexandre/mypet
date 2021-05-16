# My Pet Challenger

## _Esse é um projeto fictício, aproveite demonstrar suas incríveis habilidades!_

## Regras:

- Não é permitido alterar as classes que já existem, como exceção das classes que estão dentro do package  **br.com.mypet.controller** (onde você deve focar sua atenção)

- É permitido criar quantas classes desejar

- Quando concluído, crie um repositório público e envie o link para o seu examinador.

## **_MY-PET_**

Somos a my-pet, uma ONG sem fins lucrativos que tem como missão unir pets e pessoas!
Precisamos da sua ajuda para construir o nosso projeto!
Temos o início de uma API, mas precisamos que você, nosso herói, para terminar esse trabalho.
Atualmente é possível listar todos os nosso pet usando:

```sh
/pet/all
```

Queremos criar novas funcionalidades:

**Salvando dados:**

Queremos um método para salvar novos pets, nome e data de nascimento são campos obrigatórios.
se algum dado enviado por esse método possuir identificador devemos rejeitar a requisição

```sh 
/pet/name=example&birthDate=2001-01-01
```

**Listando dados:**

- Queremos listar nossos pets usando o nome como filtro.
    - Para a busca é exigido no mínimo 3 caracteres e no máximo 20, que podem aparecer em qualquer lugar do nome.
    - O resultado deve estar alfabeticamente ordenado por nome, e dentro dessa ordenação, deve se ordenar por idade, do mais velho para o mais jovem.
    - Caso algum campo de nome esteja nulo, esses dados deverão aparecer no final da ordem dos nomes.
    - Caso exista algum dado de idade nulo, esses dados deverão aparecer no final da ordem de idade.
    - Queremos listar nossos pets por id, nome ou data de nascimento.
    - Os três campos são opcionais, porém é exigido no mínimo um parâmetro de consulta.
    - para o parâmetro de nome, se mantém a regra 1.a

```sh
/pet/list/name=bichano
```
**Atualizando dados:**

- Queremos um método para atualizar os dados dos pets, nesse caso todos os campos são obrigatórios.

```sh
/pet/update/id=1&name=bichano&birthDate=2001-01-01
```

**Deletando dados:**

- Queremos um método para deletar os dados dos pets.


```sh
/pet/delete/id=1
```

**Exigências:**

- Nossos parceiros têm alguns problemas como dados nulos, assim, caso a resposta de consulta for nula, devolva um dado vazio.

- Devemos respeitar as boas práticas, respeitando corretamente os métodos http.

- Caso alguma operação seja rejeita devolva-se um código de erro e uma mensagem clara.

- Crie uma documentação interativa com swagger-ui, ou outra ferramenta de sua preferência.


**Outros Pontos:**

- Valorizamos boas práticas.

- Teste unitários ganham pontos extras.

- Sinta-se à vontade para fazer melhorias, caso ache necessário.
