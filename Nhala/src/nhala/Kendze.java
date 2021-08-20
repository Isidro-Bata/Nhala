package nhala;

import java.io.*;

public class Kendze {
    public static void main(String []args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        byte op, op1;
        
        
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
                    System.out.println("Opcao: ");
                    do {
                        op1 = Byte.parseByte(ler.readLine());

                        if(op1 < 0 || op1 > 3)
                            System.out.println("Informe correctamente a opcao.");
                    }while(op1 < 0 || op1 > 3);
                    
                    switch(op1) {
                        case 1:
                            
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
