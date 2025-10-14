package lvt.oop;

import javax.swing.JOptionPane;

public class BernuRitenis extends Velosipeds{
	private boolean paligriteni, zvanins;
	public BernuRitenis(boolean paligriteni, boolean zvanins,
			int ritenaD, int sedeklaPoz, double cena, String razotajs) {
		super(ritenaD, sedeklaPoz, cena, razotajs);
		this.paligriteni = paligriteni;
		this.zvanins = zvanins;
	}
	
	public void darbArPaligrit(boolean darbiba) {
		if(darbiba && paligriteni == false) {
			paligriteni = true;
			JOptionPane.showMessageDialog(null, "Palīgriteņi tika piesiprināti",
					"Paziņojums", JOptionPane.INFORMATION_MESSAGE);
		}else if (darbiba == false && paligriteni) {
			paligriteni = false;
			JOptionPane.showMessageDialog(null, 
					"Palīgriteņi tika noņemti", "Paziņojums",
					JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, 
					"Darbība nav iespējama", "Paziņojums",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
