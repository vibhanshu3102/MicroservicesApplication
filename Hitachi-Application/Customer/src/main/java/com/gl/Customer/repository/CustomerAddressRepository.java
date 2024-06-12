package com.gl.Customer.repository;
import com.gl.Customer.entity.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Integer> {
    @Modifying
    @Query("UPDATE CustomerAddress c SET c.address = :customerAddres , c.city = :customerCity , c.pinCode = :pincode , c.state = :customerState WHERE c.addresId = :addressId")
    public int updateAdress(@Param("customerAddres") String customerAddres , @Param("addressId") Integer addresId , @Param("customerCity") String customerCity , @Param("pincode") int pincode , @Param("customerState") String customerState);
}
