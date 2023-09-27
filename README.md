# Árvore Binária de Busca

Uma árvore binária de busca é uma estrutura de dados hierárquica em que cada nó tem no máximo dois filhos, chamados de filho esquerdo e filho direito. 
A árvore é organizada de forma que, para cada nó, todos os valores menores que o valor do nó estão no subárvore esquerdo e todos os valores maiores estão no subárvore direito. 
Isso permite uma busca eficiente, pois a cada comparação é possível descartar metade dos valores restantes. Além disso, a árvore binária de busca pode ser usada para realizar operações de inserção, remoção e busca de forma eficiente

Definição: [Estruturas de Dados Abertas: Uma introdução em pseudocode](https://www.facom.ufu.br/~albertini/ods-python.pdf)

## O projeto

O projeto foi desenvolvido seguindo as boas práticas de Programação Orientada a Objetos.
Possui duas classes:
- A classe Nó refere-se ao dado e às relações entre os nós que são inseridos na árvore.
- A classe Árvore refere-se à própria Árvore, com o nó raiz e implementa métodos de inserção, busca e remoção de nós.

### Método Inserir

O método `inserir()` adiciona um novo dado (nesse caso, um número inteiro - int) na Árvore através da criação de um novo nó.
O Novo Nó será inserido após uma busca recursiva para encontrar sua "posição ideal" de acordo com as regras de inserção de uma Árvore Binária de Busca.

### Método Buscar

O método `buscar()` retorna um booleano, indicando se o dado foi encontrado na árvore (true) ou não (false).

### Método Remover

O método `remover()` realiza a busca do dado a ser removido e realiza a remoção do mesmo (caso encontrado) reajustando os nós filhos.
Ou seja, o método remover serve para removermos um nó quando:
1. O nó a ser removido é um nó folha (não possui filhos);
2. O nó a ser removido é um nó com apenas um filho;
3. O nó a ser removido possui 2 filhos;

### Método Imprimir
O método de `imprimir()` nada mais faz que imprimir a árvore de forma amigável para o entendimento do usuário;

