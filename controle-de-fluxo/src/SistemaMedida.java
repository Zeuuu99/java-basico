
public class SistemaMedida {
    public static void main(String[] args) {
     /*   String sigla = "J";

        if(sigla == "P")
        System.out.println("PEQUENO");
        else if (sigla =="M")
        System.out.println("MEDIO");
        else if (sigla == "G")
        System.out.println("GRANDE");
        else 
        System.out.println("INDEFINIDO");*/
        String sigla = "6";

        switch (sigla){
            case "P":{
                System.out.println("pequeno");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:{
                System.out.println("Indefinido");
            }
        }
    }
} 
