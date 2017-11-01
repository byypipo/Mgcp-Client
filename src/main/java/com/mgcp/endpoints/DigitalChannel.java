package com.mgcp.endpoints;

/**
 * Dijital kanallar 64 Kbps'lik bir hizmet sunmaktad�r. Bu t�r kanallar
 * bulunmu�tur ��� g�vde ve ISDN aray�zlerinde. Genellikle dijitalin bir
 * par�as�d�rlar. ��� T1, E1, T3 veya E3 aray�zleri gibi �oklay�c�lar. Medya a�
 * ge�itleri ��� Bu t�r kanallar�n desteklenmesi dijital ��� Kanal �zerinde
 * al�nan sinyaller, ki bu sinyaller ��� A-kanunu veya mu-kanunu, �rnek ba��na 8
 * bitten olu�an komple set ��� veya sadece bu bitlerin 7'sini ses paketlerine
 * d�n��t�r�r. Medya a� ge�idi ��� ayr�ca bir A� Eri�im Sunucusu (NAS)
 * hizmetini, a� ge�idi ��� sesli olarak kodlanm�� verileri (modem ��� ba�lant�)
 * veya ikili veri (ISDN ba�lant�s�) ��� veri paketleri.
 * 
 * Medya a� ge�itleri birka� ba�lant� kurabilmelidir ���u� nokta ve paket a�lar�
 * aras�nda veya u� nokta ���ve di�er u� noktalar� ayn� a� ge�idinde.
 * Kaynaklanan sinyaller ���bu ba�lant�lardan ba�lant�ya g�re kar��t�r�lacakt�r
 * ���"mod", daha sonra bu belgede belirtildi�i gibi. Kesin say� ���Bir u�
 * noktan�n destekledi�i ba�lant�lar, ���a� ge�idi ve asl�nda tahsise g�re
 * de�i�ebilir ���A� ge�idi i�indeki kaynaklar�.
 * 
 * ���Baz� durumlarda, dijital kanallar sinyal g�ndermek i�in kullan�l�r. Bu
 * ����rne�in SS7 "F" ba�lant�lar� veya ISDN "D" kanallar� i�in durum. medya
 * ���bu sinyalizasyon i�levlerini destekleyen a� ge�itleri, ���ve �a�r�
 * arac�s�na gelen ve g�nderen sinyal paketlerini ���SIGTRAN �al��ma grubu
 * taraf�ndan tan�mlanan "backhaul" prosed�rleri. ���IETF. Dijital kanallar
 * bazen ���kanal ili�kili sinyalizasyon, �rne�in "MF R2". Medya a� ge�itleri
 * ���bu sinyalizasyon fonksiyonlar�n� destekleyerek ����rne�in "k�rpma" veya
 * "A" gibi ilgili sinyaller, ���i�inde tan�mlanan olay i�aretleme ve raporlama
 * usullerine g�re ���MGCP.
 * 
 * =DS0
 * 
 * @author orhan
 *
 */
public class DigitalChannel implements BaseEndpoint {
}
