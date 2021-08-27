package tw.com.softleader.demoweb.tsample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.com.softleader.demoweb.tsample.entity.CoverageEntity;
import tw.com.softleader.demoweb.tsample.entity.CustomerAddressEntity;

public interface CustomerAddressDao extends JpaRepository<CustomerAddressEntity, Long> {
}
