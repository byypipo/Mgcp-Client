package com.mgcp.endpoints;

/**
 * ATM "bagaj taraf�" u� noktalar� tipik olarak bir veya birka� ��� ATM s�rekli
 * sanal devreleri, ��� Anahtarlar� birbirine ba�layan klasik "TDM" g�vdeleri.
 * ATM / AAL2 kullan�ld���nda, ��� Birka� g�vde veya kanal, tek bir sanal ���
 * devre; Bu g�vdelerin her biri tek bir son noktaya kar��l�k gelir.
 * 
 * Media gateways should be able to establish several connections between the
 * endpoint and the packet networks, or between the endpoint and other endpoints
 * in the same gateway. The signals originating from these connections shall be
 * mixed according to the connection "mode", as specified later in this
 * document. The precise number of connections that an endpoint supports is a
 * characteristic of the gateway, and may in fact vary according to the
 * allocation of resources within the gateway.
 * 
 * @author orhan
 *
 */
public class ATMTrunkEndpoint implements BaseEndpoint {

}
