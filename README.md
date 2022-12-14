# Java 
- Não faz herança multipla, as interfaces ajudam nessa questão, pois bem se sabe que uma classe pode ser herdada apenas uma vez, mas pode implementar inúmeras interfaces

## Herança
- Para aplicar a herança numa classe se usa a palavra reservada extends.
    - EX.: public class Gerente extends FuncionarioPrincipal{}
- Uma classe que herda outra tambem herda todas as caracteristica e comportamentos, mas não pode fazer uma instancia da classe que herdou.
- Você tem criar ou reescrever o construtor, ele não pode ser herdado.
- O construtor da classe mão pode ser chamado com super().

## @Override
- Ctrl + Espaço
- Indica ao compilador que a classe filha está sobrescrevendo aquele método da classe herdada e não criando um novo.

## Protected 
- O protected é um intermediário entre public e private.
- O modificador protected torna o membro acessível às classes do mesmo pacote ou através de herança, seus membros herdados não são acessíveis a outras classes fora do pacote em que foram declarados.
Permite acesso para as classes filhas, mas proíbe a qualquer outro acesso externo.

## Super
- O super() serve para chamar o construtor da superclasse. Ele sempre é chamado, mesmo quando não está explícito no código, quando for explicitado deve ser o primeiro item dentro do construtor.

## Classe Abstratas 
- Servem como “modelo” para outras classes que dela herdem, não podendo ser instanciada por si só. Para ter um objeto de uma classe abstrata é necessário criar uma classe mais especializada herdando dela e então instanciar essa nova classe. Os métodos da classe abstrata devem então serem sobrescritos nas classes filhas.
- Uma classe abstrata representa um conceito, algo abstrato, e o compilador não permite instanciar um objeto dessa classe. Para instanciar é preciso criar primeiro uma classe filha não abstrata.

## Métodos Abstratos
- Não tem um corpo

## Interface
- As interfaces são padrões definidos através de contratos ou especificações. Um contrato define um determinado conjunto de métodos que serão implementados nas classes que assinarem esse contrato.
- Uma interface é definida através da palavra reservada “interface”. Para uma classe implementar uma interface é usada a palavra “implements”,
- As classes que forem implementar uma interface terão de adicionar todos os métodos da interface ou se transformar em uma classe abstrata.

## Composição 
- É instanciar, ou usar, uma classe/objeto em outra(o). É como se elas se comunicassem, trocassem informações. Ou seja, serve para reutilizar dados, sem ter que criar mais código pra isso.
Simplesmente passamos a informação - na forma de Objeto - para outro Objeto, e este se encarrega de obter os dados e como trabalhar em cima dele.

<p align="center" >
    <img width="400" heigth="400" src="./imgReadMe/image.png">
</p>

# Artigo "POO: o que é programação orientada a objetos?"
- Como a maioria das atividades que fazemos no dia a dia, programar também possui modos diferentes de se fazer. Esses modos são chamados de paradigmas de programação e, entre eles, estão a programação orientada a objetos (POO) e a programação estruturada.

## Na programação estruturada, um programa é composto por três tipos básicos de estruturas:
* Sequências: são os comandos a serem executados
* Condições: sequências que só devem ser executadas se uma condição for satisfeita (exemplos: if-else, switch e comandos parecidos)
* Repetições: sequências que devem ser executadas repetidamente até uma condição for satisfeita (for, while, do-while etc)

- Essas estruturas são usadas para processar a entrada do programa, alterando os dados até que a saída esperada seja gerada.
- A diferença principal entre programação estruturada e POO é que na programação estruturada um programa é tipicamente escrito em uma única rotina (ou função) podendo ser quebrado em subrotinas. Mas o fluxo do programa continua o mesmo, como se pudéssemos copiar e colar o código das subrotinas diretamente nas rotinas que as chamam, de tal forma que, no final, só haja uma grande rotina que execute todo o programa.
- O acesso às variáveis não possuem muitas restrições na programação estruturada. Em linguagens fortemente baseadas nesse paradigma, restringir o acesso à uma variável se limita a dizer se ela é visível ou não dentro de uma função, mas não se consegue dizer de forma nativa que uma variável pode ser acessada por apenas algumas rotinas do programa.

- A programação orientada a objetos surgiu como uma alternativa a essas características da programação estruturada. O intuito da sua criação também foi o de aproximar o manuseio das estruturas de um programa ao manuseio das coisas do mundo real, daí o nome "objeto" como uma algo genérico, que pode representar qualquer coisa tangível. Esse novo paradigma se baseia principalmente em dois conceitos chave: classes e objetos. 

## Classes VS Objetos
<p align="center" >
    <img width="400" heigth="400" src="https://www.alura.com.br/artigos/assets/poo-programacao-orientada-a-objetos/class-analogy.png">
</p>

## Principais características da POO
* Encapsulamento
    - Dizemos que a aceleração do carro está encapsulada, pois sabemos o que ele vai fazer ao executarmos esse método, mas não sabemos como - e na verdade, não importa para o programa como o objeto o faz, só que ele o faça.
    - Esse encapsulamento de atributos e métodos impede o chamado vazamento de escopo, onde um atributo ou método é visível por alguém que não deveria vê-lo. Isso evita a confusão do uso de variáveis globais, deixando mais fácil de identificar em qual estado cada variável vai estar a cada momento do programa.
    <p align="center" >
     <img width="400" heigth="400" src="https://www.alura.com.br/artigos/assets/poo-programacao-orientada-a-objetos/oop-car-methods-and-attributes.png">
    </p>

- Um atributo ou método que não é visível de fora do próprio objeto é chamado de "privado" e quando é visível, é chamado de "público".
<p align="center" >
    <img width="400" heigth="400" src="https://www.alura.com.br/artigos/assets/poo-programacao-orientada-a-objetos/encapsulation.png">
</p>

* Herança 
    - A ideia por trás da herança de classes em Java, é que você pode criar novas classes construídas sobre classes já existentes. Portanto, ao herdar de uma classe existente, você pode reutilizar métodos e atributos da classe pai, não sendo eles privados. Além disso, você também pode adicionar novos métodos e campos em sua classe atual.
        - Subclasse/classe filha: subclasse é uma classe que herda a outra classe. Ela também é chamada de classe derivada, ou seja, ela é uma classe estendida de uma classe pai.
        - Superclasse /classe pai: superclasse é a classe de onde uma subclasse herda os recursos, e também pode ser chamada de classe base ou classe pai, ou seja, uma classe filha estende a classe pai.

* Interface 
    - Quando duas (ou mais) classes possuem comportamentos comuns que podem ser separados em uma outra classe, dizemos que a "classe comum" é uma interface, que pode ser "herdada" pelas outras classes. Note que colocamos a interface como "classe comum", que pode ser "herdada" (com aspas), porque uma interface não é exatamente um classe, mas sim um conjunto de métodos que todas as classes que herdarem dela devem possuir (implementar) - portanto, uma interface não é "herdada" por uma classe, mas sim implementada. 
    - Um pequeno detalhe: uma interface não pode ser herdada por uma classe, mas sim implementada. No entanto, uma interface pode herdar de outra interface, criando uma hierarquia de interfaces.

- Nota: criar um erro do tipo NotImplementedError é apenas uma conveção para que, caso uma classe filha tente executar um método da classe mãe sem tê-la implementado, ocorra o erro. 

* Design Patterns 
    - Alguns problemas aparecem com tanta frequência em POO que suas soluções se tornaram padrões de design de sistemas e modelagem de código orientado a objeto, a fim de resolvê-los. Esses padrões de projeto, (ou design patterns) nada mais são do que formas padronizadas de resolver problemas comuns em linguagens orientadas a objetos.
