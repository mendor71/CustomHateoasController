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

package sample.data.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//construct city @Entity
@Entity
public class City implements Serializable {

	@Id
	public Long id;

	@Column(nullable = false)
	public String name;

	@Column(nullable = false)
	public String state;

	@Column(nullable = false)
	public String country;

	@Column(nullable = false)
	public String map;

	@Column(nullable = false)
	public Long index;

	@OneToMany(targetEntity=Hotel.class, mappedBy="city")
	public List<Hotel> hotels = new ArrayList<>();

	protected City() {
	}

	public City(long id, String name, String country, String map, String state, Long index) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.map = map;
		this.state = state;
		this.index = index;
	}

/*	public String toString() {
		return "sample.data.jpa.domain.City(name=" + this.name + ", state=" + this.state + ", country=" + this.country + ", map=" + this.map + ", index=" + this.index + ")";
	}*/

	//setters city's fields
	public void setName(String name) {
		this.name = name;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setMap(String map) {
		this.map = map;
	}

	public void setIndex(Long index) {
		this.index = index;
	}

	//getters city's fields
	public String getName() {
		return this.name;
	}

	public String getState() {return this.state;}

	public String getCountry() {
		return this.country;
	}

	public String getMap() {
		return this.map;
	}

	public Long getIndex() {
		return this.index;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

	public void addHotel(Hotel hotel) {
		this.hotels.add(hotel);
	}
}
