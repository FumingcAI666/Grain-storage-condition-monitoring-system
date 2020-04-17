package com.administrator.system;

import com.adminsterator.system.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author macfmc
 * @date 2020/4/17-13:37
 */
@RestController
@RequestMapping(produces = "application/json;charset=UTF-8")
public class AdministratorContorller {
    @Autowired
    AdministratorService administratorService;

    @RequestMapping
    public void addAdministrator(){

    }
}
