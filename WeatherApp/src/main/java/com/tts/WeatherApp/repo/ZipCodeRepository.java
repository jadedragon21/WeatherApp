package com.tts.WeatherApp.repo;

import com.tts.WeatherApp.model.ZipCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZipCodeRepository extends CrudRepository <ZipCode, Long> {
    //step 3
    List<ZipCode> findAll();
//    List<ZipCode> findByZipCode(String zipCode);
    List<ZipCode> deleteById(long id);
    List<ZipCode> findById(long id);
}
