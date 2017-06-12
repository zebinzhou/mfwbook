package org.mfwbook.n;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface NPersonRepository extends JpaRepository<NPerson, Long> {
    
    List<NPerson> findByAddress(String name);
    
    NPerson findByNameAndAddress(String name, String address);
    
    @Query("select p from NPerson p where p.name= :name and p.address= :address")
    NPerson withNameAndAddressQuery(@Param("name")String name, @Param("address")String address);
    
    NPerson withNameAndAddressNamedQuery(String name, String address);
}
