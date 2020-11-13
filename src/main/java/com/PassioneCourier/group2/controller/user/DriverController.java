package com.PassioneCourier.group2.controller.user;

import com.PassioneCourier.group2.Entity.user.Driver;
import com.PassioneCourier.group2.Factory.user.DriverFactory;
import com.PassioneCourier.group2.service.user.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @PostMapping("/create")
    public Driver create(@RequestBody Driver driver) {
        Driver newDriver = DriverFactory.createDriver(driver.getName(), driver.getLicense(), driver.getEmail(), driver.getMobile(), driver.getAddress(),
                driver.getUserName(), driver.getPassword(), driver.getIncome(),driver.getDOB());
        return driverService.create(newDriver);

    }

    @PostMapping("/update")
    public Driver update(@RequestBody Driver driver){
        return driverService.update(driver);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Integer id){
        return driverService.delete(id);
    }

    @GetMapping("/read/id}")
    public Driver read(@PathVariable Integer id){
        return driverService.read(id);
    }


    @GetMapping("/all")
    public Set<Driver> getAll(){
        return driverService.getAll();
    }
}


