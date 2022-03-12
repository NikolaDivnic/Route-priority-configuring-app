package Main;

import java.io.IOException;
import com.ireasoning.protocol.snmp.*;


public class Nit extends Thread{
	private static String pretvaranje(SnmpPdu ulaz) {
		String s = ulaz.toString();
		String s2 = ""; 
		for ( int i = s.length()-1 ;s.charAt(i)!= ' '  ;i--) {
			s2=s.charAt(i) + s2;
		}
		return s2;
	
	}
	private String ip;
	private int broj;
	private Main m;
	public Nit(String ip , int broj ,Main m){
		this.ip = ip;
		this.m = m;
		this.broj = broj;
	}
	public void prekini() {
		interrupt();
	}
	@Override
	public void run() {
		try {
			
			      
			
			
			SnmpTarget target1 = new SnmpTarget(ip, 161,"si2019","si2019");
			SnmpSession session = new SnmpSession(target1);
			while(!interrupted()) {
				
				
				SnmpSession.loadMib2(); 
				
				SnmpPdu dolazniSnmp = session.snmpGetRequest(".1.3.6.1.2.1.11.1.0");
				String brDSnmp =pretvaranje(dolazniSnmp);
				SnmpPdu odlazniSnmp = session.snmpGetRequest(".1.3.6.1.2.1.11.2.0");
				String brOSnmp =pretvaranje(odlazniSnmp); 
				SnmpPdu table = session.snmpGetRequest(".1.3.6.1.2.1.11.15.0");
				String brDGet =pretvaranje(table);
				SnmpPdu odlaznihGet = session.snmpGetRequest(".1.3.6.1.2.1.11.25.0");
				String brOGet =pretvaranje(odlaznihGet); 
				SnmpPdu setZahtevaDolaznih = session.snmpGetRequest(".1.3.6.1.2.1.11.17.0");
				String brDSet =pretvaranje(setZahtevaDolaznih); 
				SnmpPdu setZahtevaOdlaznih = session.snmpGetRequest(".1.3.6.1.2.1.11.27.0");
				String brOSet =pretvaranje(setZahtevaOdlaznih); 
				SnmpPdu dolazniTrap = session.snmpGetRequest(".1.3.6.1.2.1.11.19.0");
				String brDTrap =pretvaranje(dolazniTrap); 
				SnmpPdu odlazniTrap = session.snmpGetRequest(".1.3.6.1.2.1.11.29.0");
				String brOTrap =pretvaranje(odlazniTrap); 
				SnmpPdu neispravniComm = session.snmpGetRequest(".1.3.6.1.2.1.11.4.0");
				String brNeispravniComm =pretvaranje(neispravniComm); 
				SnmpPdu dRes = session.snmpGetRequest(".1.3.6.1.2.1.11.18.0");
				String brDRes =pretvaranje(dRes);
				SnmpPdu oRes = session.snmpGetRequest(".1.3.6.1.2.1.11.28.0");
				String brORes =pretvaranje(oRes);
				if (broj ==1) {
					m.tf11.setText(brDSnmp);
					m.tf21.setText(brOSnmp);
					m.tf31.setText(brDGet);
					m.t1f31.setText(brDRes);
					m.tf41.setText(brOGet);
					m.t1f41.setText(brORes);
					m.tf51.setText(brDSet);
					m.tf61.setText(brOSet);
					m.tf71.setText(brDTrap);
					m.tf81.setText(brOTrap);
					m.tf91.setText(brNeispravniComm);
				}
				if (broj ==2) {
					m.tf12.setText(brDSnmp);
					m.tf22.setText(brOSnmp);
					m.tf32.setText(brDGet);
					m.t1f32.setText(brDRes);
					m.tf42.setText(brOGet);
					m.t1f42.setText(brORes);
					m.tf52.setText(brDSet);
					m.tf62.setText(brOSet);
					m.tf72.setText(brDTrap);
					m.tf82.setText(brOTrap);
					m.tf92.setText(brNeispravniComm);
				}
				if (broj ==3) {
					m.tf13.setText(brDSnmp);
					m.tf23.setText(brOSnmp);
					m.tf33.setText(brDGet);
					m.t1f33.setText(brDRes);
					m.tf43.setText(brOGet);
					m.t1f43.setText(brORes);
					m.tf53.setText(brDSet);
					m.tf63.setText(brOSet);
					m.tf73.setText(brDTrap);
					m.tf83.setText(brOTrap);
					m.tf93.setText(brNeispravniComm);
				}
				Thread.sleep(10000);
			}
			
		} catch (IOException e) {} 
		catch (InterruptedException e) {}
	}
}
