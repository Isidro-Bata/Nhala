package nhala;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class Kendze {
    public static void main(String []args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat mt = new DecimalFormat("###,###,###.00 MT");
        byte op, op1;
        
        char formal = 'F';
        short qtdFormal = 0;
        float rendaFormal = 0.0f;
        
        char informal = 'I';
        short qtdInformal = 0;
        float valorInformal = 0.0f;
        
        char semiInformal = 'S';
        short qtdSemiInformal = 0;
        float taxaSemiInformal = 0.0f;
        
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
                            
                            System.out.println("Informe a Qtd. de vendedores: ");
                            do {
                                qtdInformal = Short.parseShort(ler.readLine());
                                if(qtdInformal < 0 || qtdInformal > 32768)
                                    System.out.println("Informe correctamente a quantidade.");
                                
                            }while(qtdInformal < 0 || qtdInformal > 32768);
                        
                            System.out.println("Informe o valor a ser pago por cada vendedor: ");
                            do {
                                valorInformal = Float.parseFloat(ler.readLine());
                                if(valorInformal < 0.0f)
                                    System.out.println("Informe correctamente o valor a ser pago.");
                                
                            }while(valorInformal < 0.0f);
                            
                            
                        break;
                        case 3:
                            
                            
                            System.out.print("Informe a Qtd. bancas: ");
                            do {
                                qtdSemiInformal = Short.parseShort(ler.readLine());
                                
                                if(qtdSemiInformal < 0 || qtdSemiInformal > 32768)
                                    System.out.println("Informe correctamente a quantidade");
                            }while( qtdSemiInformal < 0 || qtdSemiInformal > 32768);
                            
                            
                            System.out.print("Informe a Taxa: ");
                            do {
                                taxaSemiInformal = Float.parseFloat(ler.readLine());
                                
                                if(taxaSemiInformal < 0)
                                    System.out.println("Informe correctamente a taxa");
                            }while(taxaSemiInformal < 0);
                            
                        break;
                    }
                    
                    
                break;
                
                case 2:

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

                        switch(op1){
                            case 1:
                                System.out.println("\t=== FORMAL ===");
                                System.out.printf("\n%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.printf("%-10s%-10s%-25s%-20s%-19s |\n", "| Mercado","| Qde","| Valor por Unidade","| Taxa de Lixo", "| Valor Total");
                                System.out.printf("%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.printf("|%5s%5s%5d%5s%14s%11s%17s%3s%17s  |\n", formal, " |", qtdFormal, " |", mt.format(rendaFormal),
                                                " |", mt.format(TAXALIXO), " |", mt.format(444));
                                System.out.printf("%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println("\t=== INFORMAL ===");
                                System.out.printf("\n%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.printf("%-10s%-10s%-25s%-20s%-19s |\n", "| Mercado","| Qde","| Valor por Unidade","| Taxa de Lixo", "| Valor Total");
                                System.out.printf("%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.printf("|%5s%5s%5d%5s%14s%11s%17s%3s%17s  |\n", informal, " |", qtdInformal, " |", mt.format(valorInformal),
                                                " |", mt.format(TAXALIXO), " |", mt.format(222));
                                System.out.printf("%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.println("\n");
                                break;
                            case 3:
                                System.out.println("\t=== SEMI-INFORMAL ===");
                                System.out.printf("\n%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.printf("%-10s%-10s%-25s%-20s%-19s |\n", "| Mercado","| Qde","| Valor por Unidade","| Taxa de Lixo", "| Valor Total");
                                System.out.printf("%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.printf("|%5s%5s%5d%5s%14s%11s%17s%3s%17s  |\n", semiInformal, " |", qtdSemiInformal, " |", mt.format(taxaSemiInformal),
                                                " |", mt.format(TAXALIXO), " |", mt.format(15));
                                System.out.printf("%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.println("\n");
                                break;
                        }
                break;
            }
               
        }while(op != 0);
    }
}
