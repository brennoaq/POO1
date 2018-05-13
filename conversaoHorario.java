package brenno;

import java.util.Scanner;

public class conversaoHorario {

	public static void main(String[] args) {
		  Scanner horario = new Scanner (System.in);
	        
	        System.out.println("por favor digite o horario completo hh:mm:ssAM/PM ");
	        String hora = horario.next();
	        
	        if (hora.length() < 11){
	            int hh = Integer.parseInt(hora.substring(0,2));
	            int mm = Integer.parseInt(hora.substring(4,5));
	            int ss = Integer.parseInt(hora.substring(7,8));
	            
	            int hhNovo = hh + 12;
	            int hhMNoite = hhNovo - 24;
	            
	            String hh1 = Integer.toString(Integer.parseInt(hora.substring(0,2)));
	            String hh1Novo = Integer.toString(hhNovo);
	            String hh1Novo1 = Integer.toString(hhMNoite)+0;
	            
	            if ( hh <= 12 && mm <= 59 && ss <= 59 ){
	                if (hora.charAt(9) == 'a' ){
	                    System.out.println("Seu horario e " + hh1.concat(hora.substring(2, 8)));
	                } else
	                    if(hhNovo == 24){
	                       System.out.println("Seu horario e " + hh1Novo1.concat(hora.substring(2, 8))); 
	                        
	                    }else{
	                        System.out.println("Seu horario e " + hh1Novo.concat(hora.substring(2, 8)));
	                    }
	            }else{
	                System.out.println("valor de horario invalido ");
	            }   
	        }else{
	            System.out.println("formato invalido do horario invalido:\n digite no formato HH:mm:ssAM/PM ");
	        }      
	    }

	}


