package com.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in); 
        String response = " ";
        
        
        ListasContas array = new ListasContas(0 , 0); 
        

        int position = 0; 
        String nome = " "; 
        boolean res = true;


        boolean ligar = true; 

        Conta conta = new Conta();  

        while (ligar == true){
            

            System.out.println("1 - Criar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Sair");

            System.out.print("Ola! O que gostaria de fazer?: ");
            response = scanner.nextLine(); 
            switch (response) {
                case "1":
                System.out.print( "Digite seu nome: " );
              

                ListasContas newArray = new ListasContas(0, 1); 
                array = newArray;
                System.out.println(array);

                

                nome = scanner.nextLine();
                
                
                


                
                


               

                

                conta.setNome(nome);
                
                
                
                break;

                case "2":
                break;

                case "3":
                break;

                case "4":
                break;

                case "5":
                ligar = false;
                break;
            
                
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
        saldo = saldo + valor;

    }

    public void transfere(String destino, double valor){


        
    }
    

}


class ListasContas{
    private Object[][] ListaConta;

    public ListasContas(int linhas, int colunas){
        this.ListaConta = new Object[linhas][colunas]; 
    }

    public Object[][] getListaConta() {
        return ListaConta;
    }

    public void setListaConta(Object[][] listaConta) {
        ListaConta = listaConta;
    } 

    
}