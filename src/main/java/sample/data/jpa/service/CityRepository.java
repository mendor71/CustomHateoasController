/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.data.jpa.service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sample.data.jpa.domain.City;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "citys", path = "cities")
public interface CityRepository extends PagingAndSortingRepository<City, Long> {

	// find city by its name and country
	@Query("select c from City c")
	List<City> findAllCities();

	@Query("select c from City c where c.name = :cityName")
	City findCityByName(@Param("cityName") String cityName);

	@Query("select c from City c where c.country = :countryName")
	List<City> findCitiesByCountryName(@Param("countryName") String countryName);

	@Query("select c from City c where c.country = :countryName and c.state = :stateName")
	List<City> findCitiesByCountryNameAndStateName(@Param("countryName") String countryName, @Param("stateName") String stateName);
}
