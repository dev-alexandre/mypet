My Pet Challenger

Esse é um projeto fictício, aproveite demonstrar suas incríveis habilidades!

Regras:



É permitido criar quantas classes desejar


Não é permitido alterar as classes que já existem, como exceção das classes que estão dentro do package  br.com.mypet.controller ( onde você deve focar sua atenção )

Quando concluído, crie um repositório público e envie o link para o seu examinador.



# MY-PET

Somos a my-pet, uma ONG sem fins lucrativos que tem como missão unir pet e pessoas!

Precisamos da sua ajuda para construir o nosso projeto!
Temos o início de uma API, mas precisamos que você, nosso herói, para terminar esse trabalho.

Atualmente é possível listar todos os nosso pet usando:
/pet/all



















Salvando dados:



Queremos um método para salvar novos pets, nome e data de nascimento são campos obrigatórios.

se algum dado enviado por esse método possuir identificador devemos rejeitar a requisição


Listando dados:

Queremos listar nossos pets usando o nome como filtro.

Para a busca é exigido no mínimo 3 caracteres e no máximo 20, que podem aparecer em qualquer lugar do nome.


O resultado deve estar alfabeticamente ordenado por nome, e dentro dessa ordenação, deve se ordenar por idade, do mais velho para o mais jovem.

Caso algum campo de nome esteja nulo, esses dados deverão aparecer no final da ordem dos nomes.


Caso exista algum dado de idade nulo, esses dados deverão aparecer no final da ordem de idade.

Queremos listar nossos pets por id, nome ou data de nascimento.


Os três campos são opcionais, porém é exigido no mínimo um parâmetro de consulta.


para o parâmetro de nome, se mantém a regra 1.a



Atualizando dados:


Queremos um método para atualizar os dados dos pets, nesse caso todos os campos são obrigatórios.


Deletando dados:

Queremos um método para deletar os dados dos pets.






Exigências:

Nossos parceiros têm alguns problemas como dados nulos, assim, caso a resposta de consulta for nula, devolva um dado vazio.

Devemos respeitar as boas práticas, respeitando corretamente os métodos http.

Caso alguma operação seja rejeita devolva-se um código de erro e uma mensagem clara.

Crie uma documentação interativa com swagger-ui, ou outra ferramenta de sua preferência.


Outros Pontos:

Valorizamos boas práticas.

Teste unitários ganham pontos extras.

Sinta-se à vontade para fazer melhorias, caso ache necessário.
