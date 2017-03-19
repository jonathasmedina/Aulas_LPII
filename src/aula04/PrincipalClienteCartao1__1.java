
package aula04;

import java.util.Scanner;

/**
 *
 * @author 
 * Exemplo carro roda 1..n; --> associação, relacionamento entre classes
 */
public class PrincipalClienteCartao1__1 {
    public static void main (String[] args){
         
        Cliente cliente = new Cliente();
        CartaoCredito cartaoCredito = new CartaoCredito();               
        
        Scanner e = new Scanner(System.in);
        
        //cliente
        System.out.println("Digite o nome do cliente: ");
        cliente.setNome(e.next());
        
        System.out.println("Digite o id do cliente: ");
        cliente.setId(e.nextInt());
        
        //cartão
        System.out.println("Digite o numero do cartão de crédito: ");
        cartaoCredito.setNumero(e.nextInt());
        
        System.out.println("Digite o ano de vencimento do cartão: ");
        cartaoCredito.setValidadeAno(e.next());
        
        cartaoCredito.setCliente(cliente); //objeto cliente
        
        //verificando as informações:
        System.out.println("O cartão de crédito " + cartaoCredito.getNumero() + " está vinculado a " + 
                cartaoCredito.getCliente().getNome());
        
    }
}
