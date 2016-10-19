package awsIoT;

import java.util.Random;

import com.amazonaws.services.iot.client.AWSIotMqttClient;
import com.amazonaws.services.iot.client.AWSIotQos;

public class Main {

	public static void main(String[] args) {

//		AWSIotMqttClient pubClient = AWSClientProvider.getAwsClient(new Random().nextInt(5) + "");
		AWSIotMqttClient subClient = AWSClientProvider.getAwsClient(new Random().nextInt(5) + "");

		try {
//			pubClient.connect();
			subClient.connect();
			Subscriber sub = new Subscriber("#", AWSIotQos.QOS0);
			subClient.subscribe(sub);
		/*	Thread.sleep(5000);
			Publisher publisher = new Publisher("hello", AWSIotQos.QOS0, "Hello AWS");
			pubClient.publish(publisher, 10000);*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
