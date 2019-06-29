package com.retailstore.retaildiscount;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.retailstore.retaildiscount.bill.BillController;
import com.retailstore.retaildiscount.repository.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RetaildiscountApplicationTests {

	@Test
	public void contextLoads() {
	}

	@InjectMocks
    private BillController billController;

    @Mock
    private CustomerRepository customerRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDiscount() {

    }
    
}
