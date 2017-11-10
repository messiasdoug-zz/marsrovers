# marsrovers

A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This plateau, which is curiously rectangular, must be navigated by the rovers so that their on board cameras can get a complete view of the surrounding terrain to send back to Earth.

A rover's position and location is represented by a combination of x and y coordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.

In order to control a rover, NASA sends a simple string of letters. The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot. 'M' means move forward one grid point, and maintain the same heading.
Assume that the square directly North from (x, y) is (x, y+1).

Input:

The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0.

The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover's position, and the second line is a series of instructions telling the rover how to explore the plateau.

The position is made up of two integers and a letter separated by spaces, corresponding to the x and y coordinates and the rover's orientation.

Each rover will be finished sequentially, which means that the second rover won't start to move until the first one has finished moving.

Output:

The output for each rover should be its final coordinates and heading.
Input and Output
Test Input:
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM

Expected Output:
1 3 N
5 1 E

# solution

O design que pensei foi o mais simples possível, como venho fazendo a transição do mundo .NET para Java, ainda me pego em dificuldade com algumas peculiaridades da linguagem. Mas também me surpreendendo com algumas features.

Como o problema se desenha sobre um plano cartesiano, pensei em representar a bussola e as direções nos quadrantes do plano.

N (0, 1)
W (-1, 0)
S (0, -1)
E (1, 0)

Cada comando R,L,M implementa uma interface ICommand que possui um método para executar os comandos.

Tive dificuldade de aplicar o TDD. Como ainda não tenho prática foi difícil saber quando parar, e o que teria valor para testar.

Talvez a aplicação do TDD tenha sido minha maior dúvida e dificuldade, também andei pesquisando a respeito do assunto e percebi que várias pessoas que estão aprendendo TDD tem dificuldade por que os materiais disponíveis tem muita teoria e pouca prática e as práticas que ensinam não representam o mundo real.
