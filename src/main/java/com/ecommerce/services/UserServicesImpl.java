package com.ecommerce.services;

import com.ecommerce.data.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServicesImpl implements UserServices {
    @Autowired
    UserRepository userRepository;
    @Override
    public void addToCart() {

    }

    @Override
    public void removeFromCart() {

    }

    @Override
    public void EmptyCart() {

    }
}
