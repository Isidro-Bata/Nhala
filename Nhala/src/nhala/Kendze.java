package nhala;

import java.io.*;

public class Kendze {
    public static void main(String []args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        byte op, op1;
        
        char formal = 'F';
        short qtdFormal = 0;
        float rendaFormal = 0.0f;
        float totalFormal = 0.0f;
        float formalLixo = 0.0f;
        
        char informal = 'I';
        short qtdInformal = 0;
        float valorInformal = 0.0f;
        float totalInformal = 0.0f;
        float informalLixo = 0.0f;
        
        char semiInformal = 'S';
        short qtdSemiInformal = 0;
        float taxaSemiInformal = 0.0f;
        float totalSemiInformal = 0.0f;
        float semiInformalLixo = 0.0f;
        
        float total, totalLixo, totalVendedores, IVA;
        total = totalLixo = totalVendedores = IVA = 0.0f;
        
        final byte TAXALIXO = 20;
        
        do {
            System.out.println("1. Mercados");
            System.out.println("2. Visualizar Dados de Mercados.");
            System.out.println("3. Relatorio");
            System.out.println("0. Sair");
            System.out.println("Opcao: ");
            do {
                op = Byte.parseByte(ler.readLine());
                
                if(op < 0 || op > 3)
                    System.out.println("Informe correctamente a opcao.");
            }while(op < 0 || op > 3);
            
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
                            
                            formalLixo = qtdFormal*TAXALIXO;
                            totalFormal = qtdFormal*rendaFormal + formalLixo;
                        break;
                        case 2:
                            
                            System.out.println("Informe a Qtd. de vendedores: ");
                            do {
                                qtdInformal = Short.parseShort(ler.readLine());
                                if(qtdInformal < 0 || qtdInformal > 32768)
                                    System.out.println("Informe correctamente a opcao.");
                                
                            }while(qtdInformal < 0 || qtdInformal > 32768);
                        
                            System.out.print("Informe o valor a ser pago por cada vendedor: ");
                            do {
                                valorInformal = Float.parseFloat(ler.readLine());
                                if(valorInformal < 0.0f)
                                    System.out.println("Informe correctamente a opcao.");
                                
                            }while(valorInformal < 0.0f);
                            
                            informalLixo = qtdInformal*TAXALIXO;
                            totalInformal = qtdInformal*valorInformal + informalLixo;
                            
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
                            
                            semiInformalLixo = qtdSemiInformal*TAXALIXO;
                            totalSemiInformal = qtdSemiInformal*taxaSemiInformal + semiInformalLixo;
                        break;
                    }
                    
                    totalVendedores = qtdFormal + qtdInformal + qtdSemiInformal;
                    totalLixo = formalLixo + informalLixo + semiInformalLixo;
                    total = totalFormal + totalInformal + totalSemiInformal;
                    IVA = total*0.17f;
                    
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
                                System.out.printf("|%5s%5s%5d%5s%14.2f%11s%17d%3s%17.2f  |\n", formal, " |", qtdFormal, " |", rendaFormal,
                                                " |", TAXALIXO, " |", totalFormal);
                                System.out.printf("%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println("=== INFORMAL ===");
                                System.out.printf("\n%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.printf("%-10s%-10s%-25s%-20s%-19s |\n", "| Mercado","| Qde","| Valor por Unidade","| Taxa de Lixo", "| Valor Total");
                                System.out.printf("%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.printf("|%5s%5s%5d%5s%14.2f%11s%17d%3s%17.2f  |\n", informal, " |", qtdInformal, " |", valorInformal,
                                                " |", TAXALIXO, " |", totalInformal);
                                System.out.printf("%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.println("\n");
                                break;
                            case 3:
                                System.out.println("=== SEMI-INFORMAL ===");
                                System.out.printf("\n%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.printf("%-10s%-10s%-25s%-20s%-19s |\n", "| Mercado","| Qde","| Valor por Unidade","| Taxa de Lixo", "| Valor Total");
                                System.out.printf("%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.printf("|%5s%5s%5d%5s%14.2f%11s%17d%3s%17.2f  |\n", semiInformal, " |", qtdSemiInformal, " |", taxaSemiInformal,
                                                " |", TAXALIXO, " |", totalSemiInformal);
                                System.out.printf("%8s%10s%10s%s%s\n", "==============","===========","==========================",
                                        "======================", "=============");
                                System.out.println("\n");
                                break;
                        }
                break;
                case 3:
                    System.out.println("");
                    System.out.println("Relatorio\n");
                    System.out.println("Quantidade total de Vendedores: " + totalVendedores);
                    System.out.println("Total ganho por dia: " + total);
                    System.out.println("Total de Lixo obitdo: " + totalLixo);
                    System.out.println("IVA total: " + IVA);
                    if(total*30 > 100000){
                        System.out.println("A gestao encontra-se em Lucro");
                    }else {
                        System.out.println("A gestao encontra-se em Prejuizo");
                    }
                    
                    if(totalFormal > totalInformal && totalFormal > totalSemiInformal){
                        System.out.println("O mercado que mais facturou e o Formal");
                    }else {
                        if(totalInformal > totalFormal && totalInformal > totalSemiInformal){
                            System.out.println("O mercado que mais facturou e o Informal");
                        }else {
                            System.out.println("O mercado que mais facturou e o SemiInformal");
                        }
                    }
                    System.out.println();
                break;
            }
               
        }while(op != 0);
    }
}
