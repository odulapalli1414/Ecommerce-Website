package com.ecommerce.ecommerce_website.service.interf;


import com.ecommerce.ecommerce_website.dto.AddressDto;
import com.ecommerce.ecommerce_website.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
