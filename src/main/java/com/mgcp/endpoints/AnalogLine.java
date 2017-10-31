package com.mgcp.endpoints;

/**
 * Analog hatlar "istemci" aray�z� olarak kullan�labilir; ��� servisini klasik
 * bir telefon �nitesine veya bir "servis" aray�z� olarak sunabilir, ��� a�
 * ge�idinin analog aramalar� g�nderip almas�n� sa�lar. Ne zaman ��� medya a�
 * ge�idi ayr�ca bir NAS servisini destekliyorsa, a� ge�idi ��� ses ile
 * kodlanm�� verileri (modem ba�lant�s�) alabilen ��� onlar� veri paketlerine
 * d�n��t�r.
 * 
 * Medya a� ge�itleri birka� ba�lant� kurabilmelidir ��� u� nokta ve paket
 * a�lar� aras�nda veya u� nokta ��� ve di�er u� noktalar� ayn� a� ge�idinde.
 * Ses sinyalleri ��� bu ba�lant�lardan kaynaklanan kar���mlar, ��� ba�lant�
 * "modu", daha sonra bu belgede belirtildi�i gibi. Hassas ��� bir biti�
 * noktas�n�n destekledi�i ba�lant� say�s� bir karakteristiktir ��� ve a�
 * ge�idinin ger�ekte da��l�m�na g�re de�i�ebilir ve asl�nda ��� A� ge�idi
 * i�indeki kaynaklar�. Bununla birlikte, tipik bir a� ge�idi olmal�d�r. ��� her
 * son nokta i�in iki veya �� ba�lant�y� destekleyebilen ��� "arama bekletme"
 * veya "�� y�nl� arama" gibi destek hizmetleri.
 * 
 * @author orhan
 *
 */
public class AnalogLine implements BaseEndpoint {

}
