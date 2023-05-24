<html>
  
  <header>
     
  <p><strong>Projeto com Java - Realização de cadastro e passagem de uma viaja de barcos</strong></p> 
  <p>Equipe
  <p>Nome: Jonny Nunes</p>
  <p>Nome: Gabriel Lopes</p>
  </p> <br></br>
  
  </header>
  
  <section>
  <h1>Construindo a interface</h1>
  <img widht="200px" src="https://github.com/JonnyNunes/canoa123/blob/main/src/main/java/esbam/canoa123/img/TelaPrincipal.png" alt="TelaPrincipal" /> <br></br>
  
  <p>
  <small>
  A tela principal possue um menu de barra superior. Nele temos o "Registro" e a "Informações". Basicamente, o menu Registro será implementado as funcionalidades de registrar   os elementos que vão conterem as entidades existentes ao sistema de passagem, como barco, a rota (ponto de partida e destino) e as passagens de cada cliente (passageiros),     esses registro vai direto ao banco. 
    
  <p>No menu informações poderá conter tabelas dos elementos registrados, podendo ser visto os barcos disponíveis e as passagens em andamentos e os que foram finalizado no    dia, além de outras informações como a data e hora da passagens compradas e informações dos passageiros</p>
  </small>
  </p> <br></br>
  
  <img widht="200px" src="https://github.com/JonnyNunes/canoa123/blob/main/src/main/java/esbam/canoa123/img/SegundaTela.png" alt="ResgistrarElementos" /> <br></br>
  <p>
  <small>
  As telas estarão relacionadas, ou seja, é possível ir em uma outra tela com botão específico e da mesma forma conseguindo voltar pra tela anterios com botão "Voltar"
  (como é mostrado na setar vermelha). Essa tela pode ser mais interativa, nela foi colocado o evento de click na barra de itens (como mostra a seta azul) e esse evento, pelo o que foi selecionado, vai produzir a imagem representativa (como mostra a seta amarela) do item selecionado, ou seja, se for o item "Barcos" é mostrado então o icone de um barco.
    
  <p>Além disso, há um botão "Registrar" que vai levar o usuário a uma outra janela o qual terá as informações específicas do item selecionado</p>
  </small>
  </p> <br></br>
  
  <img widht="200px" src="https://github.com/JonnyNunes/canoa123/blob/main/src/main/java/esbam/canoa123/img/Terceira%20Tela.png" alt="Cadastrando" /> <br></br>
  
  <p>
  <small>
   Nesssa terceira tela, será exibido as informações específicos ao qual o item da tela de registro foi selecionado. Nela, podendo ser responsivo, terá componentes ocultados e alterados (depedendo do item selecionado), e esses componentes pode está em um painel ou outro componentes que é possivel ocultar os componentes. Na programção será definido pela condição do item selecionados, dessa forma pode ser definido a responsividades dos componentes. 
    
  <p>Ainda nessa janela, temos o botão "Cadastrar", o qual será passado por uma validação se todos os campos (principalmente os obrigatórios) estarem preenchidos, senão é exibido uma menssagem e o cadastro não será feito e nem enviado ao banco. Foram isso, se o banco estive conectado, os dados serão enviados ao banco e o cadastro pode ver vizualizado lá no menu "Informações"</p>
  </small>
  </p> <br></br>
  
  </section>
</html>
