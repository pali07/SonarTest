package com.zeta.conditions;
import java.net.*;

import com.zeta.helper.help;
public class PasswordUsingMAC_IP_Host {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress in =  InetAddress.getLocalHost();
			String hostName = in.getHostName();
			help.getLog(PasswordUsingMAC_IP_Host.class).info(message);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
