package nhala;

import java.io.*;

public class Kendze {
    public static void main(String []args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        byte op, op1;
        
        char formal;
        short qtdFormal;
        float rendaFormal;
        
        char informal;
        short qtdInformal;
        float valorInformal;
        
        char semiInformal;
        short qtdSemiInformal;
        float taxaSemiInformal;
        
        final byte TAXALIXO = 20;
        
        do {
            System.out.println("1. Mercados");
            System.out.println("2. Visualizar Dados de Mercados.");
            System.out.println("0. Sair");
            System.out.println("Opcao: ");
            do {
                op = Byte.parseByte(ler.readLine());
                
                if(op < 0 || op > 2)
                    System.out.println("Informe correctamente a opcao.");
            }while(op < 0 || op > 2);
            
            switch(op) {
                case 1:
                    
                    System.out.println("1. Mercado Formal");
                    System.out.println("2. Mercado Informal");
                    System.out.println("3. Mercado Semi-Informal");
                    System.out.println("0. Sair");
                    System.out.println("Opcao: ");
                    do {
                        op1 = Byte.parseByte(ler.readLine());

                        if(op1 < 0 || op1 > 3)
                            System.out.println("Informe correctamente a opcao.");
                    }while(op1 < 0 || op1 > 3);
                    
                    switch(op1) {
                        case 1:
                            System.out.print("Informe a quantidade de vendedores: ");
                            do {
                                qtdFormal = Short.parseShort(ler.readLine());
                                
                                if(qtdFormal < 0 || qtdFormal > 32768)
                                    System.out.println("Informe correctamente a quantidade.");
                            }while(qtdFormal < 0 || qtdFormal > 32768);
                            
                            System.out.print("Informe a renda de de Aluguer: ");
                            do {
                                rendaFormal = Float.parseFloat(ler.readLine());
                            
                                if(rendaFormal < 0)
                                    System.out.println("Informe correctamente a  renda");
                            }while(rendaFormal < 0);
                        break;
                        case 2:
                            
                        break;
                        case 3:
                            
                        break;
                    }
                    
                    
                break;
                
                case 2:
                    
                break;
            }
            
        }while(op != 0);
    }
}
