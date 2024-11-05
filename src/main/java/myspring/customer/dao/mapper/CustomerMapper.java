package myspring.customer.dao.mapper;

import java.util.List;

import myspring.customer.vo.CustomerVO;

public interface CustomerMapper {
	
	List<CustomerVO> selectAllCustomer();
	CustomerVO selectCustomerById(int id);
	CustomerVO selectCustomerByEmail(String email);
	void insertCustomer(CustomerVO customer);
}
