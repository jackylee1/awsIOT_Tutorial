package awsIoT;

import com.amazonaws.services.iot.client.AWSIotMessage;
import com.amazonaws.services.iot.client.AWSIotQos;

public class Publisher extends AWSIotMessage {

	public Publisher(String topic, AWSIotQos qos, String payload) {
		super(topic, qos, payload);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onSuccess() {
		System.out.println("Message : " + getStringPayload() + " Published succesfully on topic : " + topic);
	}

	@Override
	public void onFailure() {
		System.out.println("Message : " + getStringPayload() + " Publish Failed on topic : " + topic);
		System.out.println("Error : " + errorMessage);

	}

	@Override
	public void onTimeout() {
		System.out.println("Message : " + getStringPayload() + " Publish timedout on topic : " + topic);

	}

}
