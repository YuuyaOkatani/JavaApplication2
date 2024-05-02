package com.example;

import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in); 
        String response = " ";
        
        
        
        

         
        String nome = " "; 
        Random random = new Random(); 



        ArrayList<Conta> data = new ArrayList<Conta>();
        
        
        


        boolean ligar = true; 

          

        while (ligar == true){

            System.out.println("        ");

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

                nome = scanner.nextLine();
                
         

         

                Conta conta = new Conta();

                int code = random.nextInt(10000000) + 1;

                for(int i = 0; i < data.size() ; i++){
                    if(data.get(i).getNumero() == code ){
                        code = random.nextInt(10000000) + 1;
                        i = 0;
                        
                    }
                    
                }

          

                conta.setNome(nome);
                conta.setNumero(code);
                conta.setSaldo(0);
                conta.setLimite(0);
                data.add(conta); 

               
                

                

            
                
                System.out.println(data);

                System.out.println(conta.getNumero());
                System.out.println(data.size());

   
              

                
                


                
                break;

                case "2":
                int res = 0;
               
                System.out.print("Digite o número da conta: ");
                int code2 = Integer.parseInt(scanner.nextLine());
           
                for(int i = 0; i < data.size(); i++){
                    Conta account = data.get(i);
                    if(account.getNumero() == code2){
                        res = i;
                
                

                    }
                    else{
                        

                    }
                    


                }
         
           
                

                if (res > 0 && res <= data.size()) {
                   
                    Conta account = data.get(res);



           
                    System.out.println(account.getNome()+ " , " + account.getNumero());

                
              

                    System.out.print("Digite o valor a ser sacado: ");
                    double valor = Double.parseDouble(scanner.nextLine());

              



                    System.out.println("Nome: " + account.getNome()); 
                    System.out.println("Número: " + account.getNumero());
                    System.out.println("Saldo atual: " + account.getSaldo());
                    System.out.println("Limite atual: " + account.getLimite());
                }
                else{
                    System.out.println("A conta não existe"); 
                }

               




                break;

                case "3":

                res = 0;
               
                System.out.print("Digite o número da conta: ");
                code2 = Integer.parseInt(scanner.nextLine());
           
                for(int i = 0; i < data.size(); i++){
                    Conta account = data.get(i);
                    if(account.getNumero() == code2){
                        res = i;
                
                

                    }
                    else{
                        

                    }
                    


                }
         
           
                

                if (res > 0 && res <= data.size()) {
                   
                    Conta account = data.get(res);



           
                    System.out.println(account.getNome()+ " , " + account.getNumero());

                
              

                    System.out.print("Digite o valor a ser depositado: ");
                    double valor = Double.parseDouble(scanner.nextLine());
                    account.depositar(valor);

              



                    System.out.println("Nome: " + account.getNome()); 
                    System.out.println("Número: " + account.getNumero());
                    System.out.println("Saldo atual: " + account.getSaldo());
                    System.out.println("Limite atual: " + account.getLimite());
                }
                else{
                    System.out.println("A conta não existe"); 
                }

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

    public void sacar(double valor){

        if(limite >= 0.0 && limite < valor && limite < saldo){
           
            setSaldo(saldo - limite - valor);

        }
        else
        {
      

        }

    }

    public void depositar(double valor){
        setSaldo(saldo + valor);

    }

    public void transferir(Conta destino, double valor){
        setSaldo(saldo - valor);
        destino.setSaldo(destino.getSaldo() + valor);


        
    }
    
    

}


