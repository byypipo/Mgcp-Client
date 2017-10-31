package com.mgcp.endpoints;

/**
 * �nteraktif Sesli Yan�t (IVR) u� nokta, ��� IVR hizmeti. �a�r� Arac�s�'ndan
 * gelen istekler do�rultusunda, IVR sunucusu ��� Duyurular� ve sesleri "oynat"
 * ve yan�tlar�n� "dinle" ��� kullan�c�dan DTMF giri�i veya sesli mesaj olarak.
 * Gelen talepler ��� �a�r� Temsilcisi olay sinyalizasyonunu ve raporlamay�
 * izleyecektir. ��� MGCP'de tan�mlanan prosed�rler.
 * 
 * Belirli bir IVR son noktas�n�n birden fazla desteklemesi beklenmiyor ��� bir
 * seferde ba�lant�. Birka� ba�lant� kurulmu�sa ��� Ayn� biti� noktas�nda, ayn�
 * tonlar ve duyurular oynan�r ��� t�m ba�lant�lar� ayn� anda.
 * 
 * @author orhan
 *
 */
public class IVRAccessPoint implements BaseEndpoint {

}
