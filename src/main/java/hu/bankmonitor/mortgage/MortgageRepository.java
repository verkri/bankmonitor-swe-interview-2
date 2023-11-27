package hu.bankmonitor.mortgage;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "mortgages", path = "mortgages")
public interface MortgageRepository extends PagingAndSortingRepository<Mortgage, Long>, CrudRepository<Mortgage,Long> {

}