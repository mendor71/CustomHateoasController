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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class City implements Serializable {

	private static final long serialVersionUID = 1L;

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

	@OneToMany(targetEntity = Hotel.class, mappedBy = "city")
	public List<Hotel> hotels = new ArrayList<Hotel>();

	protected City() {
	}

	public City(long id, String name, String country, String state, String map) {
		this.id = id;
		this.name = name;
		this.country = country;
		this.map = map;
		this.state = state;
	}

	public void addHotel(Hotel hotel) {
		this.hotels.add(hotel);
	}

	public String toString() {
		return "City(name=" + this.name + ", state=" + this.state + ", country=" + this.country + ", map=" + this.map + ")";
	}


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

	public String getName() {
		return this.name;
	}

	public String getState() {
		return this.state;
	}

	public String getCountry() {
		return this.country;
	}

	public String getMap() {
		return this.map;
	}
}
