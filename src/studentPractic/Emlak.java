package studentPractic;

import java.util.Scanner;

public class Emlak {

	public int listeNo;
	public String evTipi;
	public String il;
	public int odaSayi;
	private double fiyat;
	public String stokDurumu;
	
	
	public int getListeNo() {
		return listeNo;
	}
	public void setListeNo(int listeNo) {
		this.listeNo = listeNo;
	}
	public String getEvTipi() {
		return evTipi;
	}
	public void setEvTipi(String evTipi) {
		this.evTipi = evTipi;
	}
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	public int getOdaSayi() {
		return odaSayi;
	}
	public void setOdaSayi(int odaSayi) {
		this.odaSayi = odaSayi;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public String getStokDurumu() {
		return stokDurumu;
	}
	public void setStokDurumu(String stokDurumu) {
		this.stokDurumu = stokDurumu;
	}
	
	Emlak(int listeNo, String evTipi, int odaSayisi, double fiyat, String stokDurumu){
		this.listeNo++;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ev Tipi");
		this.evTipi=scan.next();
		
		System.out.println("Il");
		this.il=scan.next();
		
		System.out.println("Oda sayisi");
		this.odaSayi=scan.nextInt();
		
		System.out.println("Fiyat");
		this.fiyat=scan.nextDouble();
		
		System.out.println("Stok Durumu");
		this.stokDurumu=scan.next();
	}
	
	public void ListeleEmlak() {
		System.out.println("\nListe No: " + listeNo + "\nEv Tipi: " + evTipi + "\nIL: " + 
	il + "\nOda Sayisi: " + odaSayi + "\nFiyat: " + fiyat + "\nStok Durumu: " + stokDurumu);
	}
}
