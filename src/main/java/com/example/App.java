package com.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in); 
        char response =' ';
        String[] Arraycontas = {}; 
        
        String nome = " "; 

        Conta conta = new Conta();  // erro aqu i

        System.out.print( "Ola! Gostaria de criar uma conta? ( y / n )"  );
        response = scanner.next().charAt(0); 
        if(response == 'y'){
             
            System.out.print( "Digite seu nome: " );



            nome = scanner.next(); 
           
            int numero = 0; 
            double saldo = 0 ;
            double limite = 0 ; 
            
            
            conta.setNome(nome);
            conta.setNumero(numero);
            conta.setSaldo(saldo);
            conta.setLimite(limite);

            System.out.println(conta.getNome());
            System.out.println(conta.getNumero());
            System.out.println(conta.getSaldo());
            System.out.println(conta.getLimite());






        }
        else{
      
            System.out.print( "Gostaria de entrar na sua conta? ( y / n )"  );
            response = scanner.next().charAt(0);
            if( response == 'y'){
                System.out.print("Digite o nome: ");
                nome = scanner.nextLine(); 

                System.out.print( "Digite o numero da sua conta: " );
                int numero = scanner.nextInt(); 

                
                

            }
            else{

            }
           
        }
        
    }

  


    

    
}

class Conta{

    private String nome; 
    private int numero; 
    private double saldo; 
    private  double limite;
    

    //----------------------------------------------------------------
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //----------------------------------------------------------------

    public boolean saca(double valor){

        return valor == 0 ? true: false; 

    }

    public void deposita(double valor){

    }

    public void transfere(String destino, double valor){

        
    }
    

}