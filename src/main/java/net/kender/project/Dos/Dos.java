package net.kender.project.Dos;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.kender.logger.log5k.Logger;
import net.kender.logger.log5k.conf.CustomLogger;
import net.kender.logger.log5k.conf.log5kConf;
import net.kender.project.App;

public class Dos {
	private static final CustomLogger input = new CustomLogger("\u001B[35;1m","INPUT",true,false,true,false,false);
	private static final Logger log = new Logger(Dos.class);
	public static void main(String[] args) throws IOException {
		log5kConf config = new log5kConf(App.class.getResourceAsStream("/net/kender/project/conf.properties"));
		log.setConfig(config);
		
		
		
		Scanner scan = new Scanner(System.in);
		Map<Integer,Cuenta> map = Cuenta.load(new File(Dos.class.getResource("cuentas.json").getFile()));
		do {
			log.debug("suma total de los saldos " + Estado.Acreedor + " " + Cuenta.TotalAcreedor);
			log.log("introduce la id de la cuenta: ", input);
			int cn = scan.nextInt();
			if(cn < 0) {
				break;
			}
			Cuenta select = map.get(cn);
			select.print(log,new CustomLogger("\u001B[36;1m","TABLE",true,false,true,false,false));
		} while(true);
		scan.close();
	}
}
class Cuenta{
	@JsonProperty("id") public Integer NumeroDeCuenta;
	@JsonIgnore public Estado estado;
	public Integer saldo;
	
	public static Integer TotalAcreedor = 0;
	
	public static Map<Integer,Cuenta> load(File s) throws IOException{
		i i = new ObjectMapper().readValue(s,i.class);
		Map<Integer,Cuenta> map = new HashMap<Integer,Cuenta>();
		for(Cuenta l : i.Cuentas) {
			if(l.saldo < 0) {
				l.setEstado(Estado.Deudor);
			} else if ( l.saldo == 0) {
				l.setEstado(Estado.Nulo);
			} else if (l.saldo > 0) {
				TotalAcreedor += l.saldo;
				l.setEstado(Estado.Acreedor);
			}
			map.put(l.NumeroDeCuenta, l);
		}
		return map;
	}
	
	public void print(Logger log,CustomLogger lof) {
		log.log("----------------",lof);
		log.log("ID: " + NumeroDeCuenta,lof);
		log.log("SALDO: " + saldo,lof);
		log.log("Esatdo: " + estado,lof);
		log.log("----------------",lof);
	}
	public void print() {
		System.out.println("----------------");
		System.out.println("ID: " + NumeroDeCuenta);
		System.out.println("SALDO: " + saldo);
		System.out.println("Estado: " + estado);
		System.out.println("----------------");
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
class i{
	public List<Cuenta> Cuentas;
}
enum Estado{
	Acreedor,
	Deudor,
	Nulo
}
