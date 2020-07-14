
package com.mcc.crud.repositories;

import com.mcc.crud.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JESSI
 */
@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {
    
}
