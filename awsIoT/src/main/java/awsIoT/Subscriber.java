package awsIoT;

import com.amazonaws.services.iot.client.AWSIotMessage;
import com.amazonaws.services.iot.client.AWSIotQos;
import com.amazonaws.services.iot.client.AWSIotTopic;

public class Subscriber extends AWSIotTopic {

	public Subscriber(String topic, AWSIotQos qos) {
		super(topic, qos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onMessage(AWSIotMessage message) {
		System.out.println("Message Received on Topic : " + topic + " Data : " + message.getStringPayload());
	}

	@Override
	public void onSuccess() {
		// TODO Auto-generated method stub
		System.out.println("success subscriber");
	}

	@Override
	public void onFailure() {
		// TODO Auto-generated method stub
		System.out.println(errorMessage);
	}

	@Override
	public void onTimeout() {
		// TODO Auto-generated method stub
		super.onTimeout();
	}

}
