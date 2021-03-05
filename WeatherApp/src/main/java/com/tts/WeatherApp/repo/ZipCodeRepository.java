package com.tts.WeatherApp.repo;

import com.tts.WeatherApp.model.ZipCode;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ZipCodeRepository extends PagingAndSortingRepository<ZipCode, Long> {

}
