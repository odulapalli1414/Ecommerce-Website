package com.ecommerce.ecommerce_website.service.impl;

import com.ecommerce.ecommerce_website.dto.AddressDto;
import com.ecommerce.ecommerce_website.dto.Response;
import com.ecommerce.ecommerce_website.entity.Address;
import com.ecommerce.ecommerce_website.entity.User;
import com.ecommerce.ecommerce_website.repository.AddressRepo;
import com.ecommerce.ecommerce_website.service.interf.AddressService;
import com.ecommerce.ecommerce_website.service.interf.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    private final UserService userService;


    @Override
    public Response saveAndUpdateAddress(AddressDto addressDto) {
        User user = userService.getLoginUser();
        Address address = user.getAddress();

        if (address == null){
            address = new Address();
            address.setUser(user);
        }
        if (addressDto.getStreet() != null) address.setStreet(addressDto.getStreet());
        if (addressDto.getCity() != null) address.setCity(addressDto.getCity());
        if (addressDto.getState() != null) address.setState(addressDto.getState());
        if (addressDto.getZipCode() != null) address.setZipCode(addressDto.getZipCode());
        if (addressDto.getCountry() != null) address.setCountry(addressDto.getCountry());

        addressRepo.save(address);

        String message = (user.getAddress() == null) ? "Address successfully created" : "Address successfully updated";
        return Response.builder()
                .status(200)
                .message(message)
                .build();
    }
}

