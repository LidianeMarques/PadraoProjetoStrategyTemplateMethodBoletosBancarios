# <h1 align="center"> Padrões de Projeto </h1>
<hr/>

## <h2 align="center">Padrão Strategy com Template Method </h2>

<div align="justify">
 <p> Exemplo de Boletos Bancários com padrão Strategy e Template Method </p>
 <p> Para implementar o Template Method ao projeto, foi necessário modificar 3 classes, foram elas: ProcessarBoletos que firou uma classe abstrata e, LeituraRetornoBancoBrasil e LeituraRetornoBancoBradesco que voltaram a ser herança da classe ProcessarBoletos. Isso porque o método pede que a classe que implementará o Template Method realmente deve ser uma classe abstrata ou uma interface do Java 8+ com um método default (que possui implementação). Dessa forma, a <b>classe abstrata ProcessarBoletos</b> possui o Template Method <b>processar</b> definindo a estrutura do código e o método abstrato <b>processarLinhaArquivo</b> definindo uma parte da implementação do algoritmo do templateMethod() (profº.: Manoel Campos). </p>
 
 <p>Para entender melhor o conceito do projeto basta clicar nos links abaixo:</p>
  
 [Padrões de Projetos Comportamentais](https://github.com/manoelcampos/padroes-projetos/tree/master/comportamentais/template-method)
 
 [#4 Padrão de Projetos TEMPLATE METHOD: quase TUDO que PRECISA SABER](https://www.youtube.com/watch?v=rg8_0f6bWWo&t=42s)
 
 
 <p></p>
 

</div>
 
