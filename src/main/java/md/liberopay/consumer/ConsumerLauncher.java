package md.liberopay.consumer;

import md.liberopay.consumer.service.SOAPConnector;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumerLauncher {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerLauncher.class);
    }

    @Bean
    CommandLineRunner lookup(SOAPConnector soapConnector) {
        return args -> {
            String id = "1";//Default id

            if(args.length>0){
                id = args[0];
            }
            UserDetailsRequest request = new UserDetailsRequest();
            request.setId(1L);
            UserDetailsResponse response = (UserDetailsResponse)
                    soapConnector.callWebService("http://localhost:8888/service", request);
            System.out.println("Got Response As below ========= : ");
            System.out.println("First name : "+response.getUser().getFirstName());
            System.out.println("Last name : "+response.getUser().getLastName());
            System.out.println("Address : "+response.getUser().getAddress());
            System.out.println("Age : "+response.getUser().getAge());
        };
    }
}
