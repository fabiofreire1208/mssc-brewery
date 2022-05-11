package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().customerId(UUID.randomUUID())
                .CustomerName("Fabio")
                .build();
    }
}
