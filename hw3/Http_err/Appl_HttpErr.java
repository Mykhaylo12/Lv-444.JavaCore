package com.softserve.lukas4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl_HttpErr {

	public enum HttpErrors {
		BAD_REQUEST(400), GATEWAY_TIMEOUT(504),FORBIDDEN(403),UNKNOWN(1000);
		
		
		private final int iHttpErrCode;

		HttpErrors(int iHttpErrCode) {
		this.iHttpErrCode = iHttpErrCode;

		}

	    public static HttpErrors valueOf(int iHttpErrCode) {
	        for (HttpErrors httperrors : HttpErrors.values()) {
	            if (httperrors.iHttpErrCode == iHttpErrCode){ 
	            	return httperrors;
	            }
	            }
			return HttpErrors.UNKNOWN;
	        }   		
		
	    public int getHttpErr() {
		return iHttpErrCode;
		}

		}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Input HttpErr
		System.out.println("Input HTTP Error number:");		
		HttpErrors httperrors= HttpErrors.valueOf(Integer.parseInt(br.readLine()));
		switch (httperrors) {
		case BAD_REQUEST:
			System.out.println(httperrors.name()+": 400 Bad Request, see HTTP/1.1 documentation.");
			break;
		case GATEWAY_TIMEOUT:
			System.out.println(httperrors.name()+": 504 Gateway Timeout, see HTTP/1.1 documentation.");
			break;
		case FORBIDDEN:
			System.out.println(httperrors.name()+": 403 Forbidden, see HTTP/1.1 documentation.");			
			
			break;
		default:
			System.out.println("Unknown Error!!!");
			break;
		}
		

	}



}
