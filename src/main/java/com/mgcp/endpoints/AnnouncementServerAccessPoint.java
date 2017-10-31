package com.mgcp.endpoints;

/**
 * Duyuru sunucusu bir duyuru sonuna, bir duyuruya eri�im sa�lar hizmet. �a�r�
 * Arac�s�'n�n iste�i �zerine, duyuru sunucusu Belli bir duyuru "oynayacak".
 * �a�r� talepleri Temsilci olay i�aretleme ve raporlama prosed�rlerini takip
 * edecektir. MGCP'de tan�mlanm��t�r.
 * 
 * Belli bir duyuru biti� noktas�ndan daha fazlas�n� desteklemesi
 * beklenmemektedir. ��� bir seferde bir ba�lant�. Birka� ba�lant� kurulmu�sa
 * ��� Ayn� son nokta, daha sonra ayn� duyurular oynan�r ��� t�m ba�lant�lar�
 * ayn� anda.
 * 
 * ��� Duyuru sunucusuna ba�lant�lar genellikle bir y�nden veya "yar� ���
 * dubleks "- duyuru sunucusunun ��� ses sinyallerini ba�lay�n.
 * 
 * @author orhan
 *
 */
public class AnnouncementServerAccessPoint implements BaseEndpoint {

}
