package com.fullstack.customerSignbackend.Service;

import com.fullstack.customerSignbackend.Repository.CustomerRepository;
import com.fullstack.customerSignbackend.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private  final CustomerRepository customerRepository;
    public Customer signUp(Customer customer){
        return customerRepository.save(customer);
    }

    public boolean signIn(String custEmailId, String custPassword){

        boolean flag = false;
        Customer customer = customerRepository.findByCustEmailIdAndCustPassword(custEmailId, custPassword);
        if(customer!=null){
            flag = true;
        }
        return flag;
    }

    public List<Customer> findAll(){

        return customerRepository.findAll();
    }

    public void deleteById(Integer custID) {
        customerRepository.deleteById(custID);
    }

}
