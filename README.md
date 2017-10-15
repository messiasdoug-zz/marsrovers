# marsrovers

O design que pensei foi o mais simples possível, como venho fazendo a transição do mundo .NET para Java, ainda me pego em dificuldade com algumas peculiaridades da linguagem. Mas também me surpreendendo com algumas features.

Como o problema se desenha sobre um plano cartesiano, pensei em representar a bussola e as direções nos quadrantes do plano.

N (0, 1)
W (-1, 0)
S (0, -1)
E (1, 0)

Cada comando R,L,M implementa uma interface ICommand que possui um método para executar os comandos.

Tive dificuldade de aplicar o TDD. Como ainda não tenho prática foi difícil saber quando parar, e o que teria valor para testar.

Talvez a aplicação do TDD tenha sido minha maior dúvida e dificuldade, também andei pesquisando a respeito do assunto e percebi que várias pessoas que estão aprendendo TDD tem dificuldade por que os materiais disponíveis tem muita teoria e pouca prática e as práticas que ensinam não representam o mundo real.
