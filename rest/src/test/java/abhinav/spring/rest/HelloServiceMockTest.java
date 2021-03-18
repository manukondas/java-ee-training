package abhinav.spring.rest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import abhinav.spring.rest.repository.User;
import abhinav.spring.rest.repository.UserRepository;
import abhinav.spring.rest.service.UserService;

//@ExtendWith(MockitoExtension.class) , need this? still able to run.
@SpringBootTest
public class HelloServiceMockTest {
	
	

    @Mock
    private UserRepository userRepository;

    //@Spy
    @InjectMocks // auto inject helloRepository
    private UserService userService = new UserService();

    @BeforeEach
    void setMockOutput() {
    	
    	List<User> users = new ArrayList<User>();
    	User user = new User("Siva", "Password") ;
    	users.add(user);
        //when(helloService.get()).thenReturn("Hello Mockito");
        when(userRepository.getUsers()).thenReturn(users);
        when(userRepository.getUser(Mockito.anyString())).thenReturn(user);
    }

    @DisplayName("Test Mock helloService + helloRepository")
    @Test
    void testGet() {
        assertEquals(1, userService.getUsers().size());
    }
    
    @DisplayName("Test Mock helloService + helloRepository")
    @Test
    void testLogin() {
        assertTrue(userService.isValidLogin("Siva","password"));
    }

}