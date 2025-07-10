package com.fullstack.customerSignbackend.Repository;

import com.fullstack.customerSignbackend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findByCustEmailIdAndCustPassword(String custEmailId, String custPassword);
}
