package relogio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timer extends Thread{
	
private Integer segundos = 0 ;
private Integer minutos = 0 ;
private Integer horas = 0 ;

	public Integer getSegundos() {
	return segundos;
	}
	
	public Integer getMinutos() {
		return minutos;
	}
	
	
	public Integer getHoras() {
		return horas;
	}

	public void run(){
		
		 try {  
				while(true){
				
					Date agora = new java.util.Date();  
					String hora = (new SimpleDateFormat("H")).format(agora);
					String minuto = (new SimpleDateFormat("m")).format(agora);
					String segundo = (new SimpleDateFormat("s")).format(agora);
					
					this.horas = Integer.parseInt(hora);
			        this.minutos = Integer.parseInt(minuto);
			        this.segundos = Integer.parseInt(segundo);
			        
					System.out.println(horas + ":" + minutos + ":" + segundos);
			        sleep(1000);
			        
				}
		        
		    } catch (Exception e) {  
		        
		 }  

	}
}
