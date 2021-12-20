package studentPractic;

import java.util.ArrayList;
import java.util.Scanner;

public class EmlakRunner {

	static String patronId = "1";
	static String patronSifre = "1";

	static String calisanId = "2";
	static String calisanSifre = "2";

	static Scanner scan = new Scanner(System.in);

	static int listeNo = 99;
	static String evTipi;
	static String il;
	static int odaSayi;
	static double fiyat;
	static String stokDurumu;

	static ArrayList<Emlak> envanter = new ArrayList<>();
	static ArrayList<Emlak> satilanlar = new ArrayList<>();

	public static void main(String[] args) {

		String sifre = "";// scannerden gelenler atilacak
		String id = "";
		boolean giris = true;

		while (giris) {
			System.out.println("Sila Emlak iyi gunler diler ");
			System.out.println("ID: ");
			id = scan.next();

			System.out.println("Sifre: ");
			sifre = scan.next();

			if (id.equals(patronId) && sifre.equals(patronSifre)) {
				giris = false;
				patron();
			} else if (id.equals(calisanId) && sifre.equals(calisanSifre)) {
				giris = false;
				calisan();
			} else {
				giris = true;
				System.out.println("Giris basarisiz");
			}
		}

	}

	private static void calisan() {
		System.out.println("Gunaydin emekci");

		while (true) {
			System.out.println("\n1.Ekle \n2.Listele \n3.Cikis \nSecenek: ");
			int secenek = scan.nextInt();

			switch (secenek) {
			case 1:
				Emlak emlak1 = new Emlak(++listeNo, evTipi, odaSayi, fiyat, stokDurumu);
				envanter.add(emlak1);
				break;
			case 2:
				System.out.println("============");
				System.out.println("Envanter: ");
				for (int i = 0; i < envanter.size(); i++) {
					envanter.get(i).ListeleEmlak();
				}
				System.out.println("Toplam emlak sayiniz: " + envanter.size());
				break;
			case 3:
				System.out.println("Gule gule");
				break;

			default:
				System.out.println("Yalnis giris.");
				break;
			}
		}

	}

	public static void patron() {
		System.out.println("GUnaydin patron");
		while (true) {
			System.out.println("\n1.Ekle \n2.Listele \n3.Sil \n4.Duzenle \n5.Cik \nSecenek:");
			int secenek = scan.nextInt();

			switch (secenek) {
			case 1:
				Emlak emlak1 = new Emlak(++listeNo, evTipi, odaSayi, fiyat, stokDurumu);
				envanter.add(emlak1);
				break;
			case 2:
				System.out.println("============");
				System.out.println("Envanter: ");
				for (int i = 0; i < envanter.size(); i++) {
					envanter.get(i).ListeleEmlak();
				}
				System.out.println("Toplam emlak sayiniz: " + envanter.size());
				break;
			case 3:

				System.out.println("Liste no'yu gir: ");
				int silinen = scan.nextInt() - 100;
				satilanlar.add(envanter.get(silinen));
				envanter.remove(silinen);

				break;
			case 4:

				for (int i = 0; i < envanter.size(); i++) {
					envanter.get(i).ListeleEmlak();
					System.out.println("Hangi urunu duzenleyeceksin?");
					int duzenlencek = scan.nextInt() - 100;

					if (duzenlencek < envanter.size()) {
						System.out.println(
								"Neyi duzenleyeceksin? \n1.Ev Tipi \n2.Il \n3.Oda Sayisi \n4.Fiyat \n5.Stok Durumu");
						int neyi = scan.nextInt();

						switch (neyi) {
						case 1:
							System.out.println("Duzenlemeyi gir");
							envanter.get(duzenlencek).setEvTipi(scan.nextLine());
							break;
						case 2:
							System.out.println("Duzenlemeyi gir");
							envanter.get(duzenlencek).setIl(scan.next());
							break;

						case 3:
							System.out.println("Duzenlemeyi gir");
							envanter.get(duzenlencek).setOdaSayi(scan.nextInt());
							break;

						case 4:
							System.out.println("Duzenlemeyi gir");
							envanter.get(duzenlencek).setFiyat(scan.nextDouble());
							break;

						case 5:
							System.out.println("Duzenlemeyi gir");
							envanter.get(duzenlencek).setStokDurumu(scan.next());;
							break;

						default:
							System.out.println("Yalnis giris.");
							break;
						}

					} else {
						System.out.println("Fazla girdin. O kadar mal yok.");
					}
				}

				break;
			case 5:
System.out.println("Gule gule");
				break;

			default:
				System.out.println("Yalnis Giris.");
				break;
			}
		}

	}

}
