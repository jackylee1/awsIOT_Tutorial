package awsIoT;

import com.amazonaws.services.iot.client.AWSIotMqttClient;

import awsIoT.SampleUtil.KeyStorePasswordPair;

public class AWSClientProvider {
	static String clientEndpoint = "a217pvd3yxgpn8.iot.us-west-2.amazonaws.com";
	static String certificateFile = "2b184ba926-certificate.pem.crt";
	static String privateKeyFile = "2b184ba926-private.pem.key";

	public static AWSIotMqttClient getAwsClient(String clientId) {
		KeyStorePasswordPair pair = SampleUtil.getKeyStorePasswordPair(certificateFile, privateKeyFile);

		AWSIotMqttClient client = new AWSIotMqttClient(clientEndpoint, clientId, pair.keyStore, pair.keyPassword);
		return client;
	}

}
