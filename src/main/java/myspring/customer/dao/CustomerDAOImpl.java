package myspring.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.customer.dao.mapper.CustomerMapper;
import myspring.customer.vo.CustomerVO;

@Repository("customerDAO")
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	CustomerMapper customerMapper;
	
	@Override
	public List<CustomerVO> selectAllCustomer() {
		return customerMapper.selectAllCustomer();
	}

	@Override
	public CustomerVO selectCustomer(int id) {
		return customerMapper.selectCustomerById(id);
	}
	
	public void insertCustomer(CustomerVO customer) {
		customerMapper.insertCustomer(customer);
		System.out.println("등록된 Customer Record UserId=" + customer.getEmail() + 
				" Name=" + customer.getName());
	}

}
