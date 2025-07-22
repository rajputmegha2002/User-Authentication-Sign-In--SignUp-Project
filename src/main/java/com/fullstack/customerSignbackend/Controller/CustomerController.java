package com.fullstack.customerSignbackend.Controller;

import com.fullstack.customerSignbackend.Service.CustomerService;
import com.fullstack.customerSignbackend.entity.Customer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/signUp")
    public ResponseEntity<Customer> sign(@RequestBody Customer customer){
        return  ResponseEntity.ok(customerService.signUp(customer));
    }

    @GetMapping("/signIn/{custEmailId}/{custPassword}")
    public ResponseEntity<Boolean> signIn(@PathVariable String custEmailId, @PathVariable String custPassword){
        return  ResponseEntity.ok(customerService.signIn(custEmailId,custPassword));
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Customer>> findAll(){
        return ResponseEntity.ok(customerService.findAll());
    }

    @DeleteMapping("/delete/{custID}")
    public ResponseEntity<String> deleteCustomer(@PathVariable Integer custID) {
        customerService.deleteById(custID);
        return ResponseEntity.ok("Customer deleted successfully");
    }


}
