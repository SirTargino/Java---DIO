public class App {
    public static void main(String[] args) 
    throws Exception {

        //Caso você declare uma variável dentro de um métodfo, o escopo dela está limitado apenas ao corpo desse método

        //Se a variável é de classe, pode ser usada em toda a classe.

        //Ainda existem as variáveis que se encontram dentro de condicionais e controle de fluxo, as quais só estão disponíveis dentro dessas estrututras.

        //Por exemplo, na aula 5, todos os atributos da TV são acessíveis em todas as classes. Porém, o parâmetro novoCanal só está disponível dentro do método mudarCanal.
        System.out.println("Hello, World!");
    }
}
