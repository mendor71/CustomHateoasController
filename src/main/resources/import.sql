--
-- Sample dataset containing a number of Hotels in various Cities across the world.
-- =================================================================================================
-- AUSTRALIA
insert into user (id, name, login, password) values (1, 'Roy', 'roy', 'spring')
insert into user (id, name, login, password) values (2, 'Craig', 'craig', 'spring')
insert into user (id, name, login, password) values (3, 'Gregoy', 'gregoy', 'spring')

insert into role (id, name) values (1, 'ROLE_USER')
insert into role (id, name) values (2, 'ROLE_ADMIN')
insert into role (id, name) values (3, 'ROLE_GUEST')

insert into user_role (user_id, role_id) values (1, 1)
insert into user_role (user_id, role_id) values (1, 2)
insert into user_role (user_id, role_id) values (2, 1)
insert into user_role (user_id, role_id) values (3, 1)

-- Brisbane
insert into city(id, country, name, state, map, index) values (1, 'Australia', 'Brisbane', 'Queensland', '-27.470933, 153.023502', 620041)
insert into hotel(id, city, name, address, zip) values (1, 1, 'Conrad Treasury Place', 'William & George Streets', '4001')
insert into attractions(id, name, description) values (1, 'AustralianTheatre', 'AustralianTheatreDesc')

-- Melbourne
insert into city(id, country, name, state, map, index) values (2, 'Australia', 'Melbourne', 'Victoria', '-37.813187, 144.96298', 620115)
insert into hotel(id, city, name, address, zip) values (2, 2, 'The Langham', '1 Southgate Ave, Southbank', '3006')

-- Sydney
insert into city(id, country, name, state, map, index) values (3, 'Australia', 'Sydney', 'New South Wales', '-33.868901, 151.207091', 635861)
insert into hotel(id, city, name, address, zip) values (3, 3, 'Swissotel', '68 Market Street', '2000')


-- =================================================================================================
-- CANADA

-- Montreal
insert into city(id, country, name, state, map, index) values (4, 'Canada', 'Montreal', 'Quebec', '45.508889, -73.554167', 685041)
insert into hotel(id, city, name, address, zip) values (4, 4, 'Ritz Carlton', '1228 Sherbrooke St', 'H3G1H6')
insert into attractions(id, name, description) values (4, 'Bridge', 'BridgeDesc')


-- =================================================================================================
-- ISRAEL

-- Tel Aviv
insert into city(id, country, name, state, map, index) values (5, 'Israel', 'Tel Aviv', 'none', '32.066157, 34.777821', 650041)
insert into hotel(id, city, name, address, zip) values (5, 5, 'Hilton Tel Aviv', 'Independence Park', '63405')


-- =================================================================================================
-- JAPAN

-- Tokyo
insert into city(id, country, name, state, map, index) values (6, 'Japan', 'Tokyo', 'none', '35.689488, 139.691706', 622541)
insert into hotel(id, city, name, address, zip) values (6, 6, 'InterContinental Tokyo Bay', 'Takeshiba Pier', '105')


-- =================================================================================================
-- SPAIN

-- Barcelona
insert into city(id, country, name, state, map, index) values (7, 'Spain', 'Barcelona', 'Catalunya', '41.387917, 2.169919', 620381)
insert into hotel(id, city, name, address, zip) values (7, 7, 'Hilton Diagonal Mar', 'Passeig del Taulat 262-264', '08019')

-- =================================================================================================
-- SWITZERLAND

-- Neuchatel
insert into city(id, country, name, state, map, index) values (8, 'Switzerland', 'Neuchatel', 'none', '46.992979, 6.931933', 698321)
insert into hotel(id, city, name, address, zip) values (8, 8, 'Hotel Beaulac', ' Esplanade Leopold-Robert 2', '2000')


-- =================================================================================================
-- UNITED KINGDOM

-- Bath
insert into city(id, country, name, state, map, index) values (9, 'UK', 'Bath', 'Somerset', '51.381428, -2.357454', 620042)
insert into hotel(id, city, name, address, zip) values (9, 9, 'The Bath Priory Hotel', 'Weston Road', 'BA1 2XT')
insert into hotel(id, city, name, address, zip) values (24, 9, 'Bath Travelodge', 'Rossiter Road, Widcombe Basin', 'BA2 4JP')

-- London
insert into city(id, country, name, state, map, index) values (10, 'UK', 'London', 'none', '51.500152, -0.126236', 580041)
insert into hotel(id, city, name, address, zip) values (10, 10, 'Melia White House', 'Albany Street', 'NW1 3UP')
insert into attractions(id, name, description) values (10, 'BigBen','BigClock')

-- Southampton
insert into city(id, country, name, state, map, index) values (11, 'UK', 'Southampton', 'Hampshire', '50.902571, -1.397238', 620521)
insert into hotel(id, city, name, address, zip) values (11, 11, 'Chilworth Manor', 'The Cottage, Southampton Business Park', 'SO16 7JF')


-- =================================================================================================
-- USA

-- Atlanta
insert into city(id, country, name, state, map, index) values (12, 'USA', 'Atlanta', 'GA', '33.748995, -84.387982', 689431)
insert into hotel(id, city, name, address, zip) values (12, 12, 'Marriott Courtyard', 'Tower Place, Buckhead', '30305')
insert into hotel(id, city, name, address, zip) values (22, 12, 'Ritz Carlton', 'Peachtree Rd, Buckhead', '30326')
insert into hotel(id, city, name, address, zip) values (23, 12, 'Doubletree', 'Tower Place, Buckhead', '30305')

-- Chicago
insert into city(id, country, name, state, map, index) values (13, 'USA', 'Chicago', 'IL', '41.878114, -87.629798', 627441)
insert into hotel(id, city, name, address, zip) values (13, 13, 'Hotel Allegro', '171 West Randolph Street', '60601')

-- Eau Claire
insert into city(id, country, name, state, map, index) values (14, 'USA', 'Eau Claire', 'WI', '44.811349, -91.498494', 620698)
insert into hotel(id, city, name, address, zip) values (14, 14, 'Sea Horse Inn', '2106 N Clairemont Ave', '54703')
insert into hotel(id, city, name, address, zip) values (25, 14, 'Super 8 Eau Claire Campus Area', '1151 W Macarthur Ave', '54701')

-- Hollywood
insert into city(id, country, name, state, map, index) values (15, 'USA', 'Hollywood', 'FL', '26.011201, -80.14949', 624781)
insert into hotel(id, city, name, address, zip) values (15, 15, 'Westin Diplomat', '3555 S. Ocean Drive', '33019')

-- Miami
insert into city(id, country, name, state, map, index) values (16, 'USA', 'Miami', 'FL', '25.788969, -80.226439', 631478)
insert into hotel(id, city, name, address, zip) values (16, 16, 'Conrad Miami', '1395 Brickell Ave', '33131')

-- Melbourne
insert into city(id, country, name, state, map, index) values (17, 'USA', 'Melbourne', 'FL', '28.083627, -80.608109', 628541)
insert into hotel(id, city, name, address, zip) values (17, 17, 'Radisson Suite Hotel Oceanfront', '3101 North Hwy', '32903')

-- New York
insert into city(id, country, name, state, map, index) values (18, 'USA', 'New York', 'NY', '40.714353, -74.005973', 678210)
insert into hotel(id, city, name, address, zip) values (18, 18, 'W Union Hotel', 'Union Square, Manhattan', '10011')
insert into hotel(id, city, name, address, zip) values (26, 18, 'W Lexington Hotel', 'Lexington Ave, Manhattan', '10011')
insert into hotel(id, city, name, address, zip) values (27, 18, '70 Park Avenue Hotel', '70 Park Avenue', '10011')

-- Palm Bay
insert into city(id, country, name, state, map, index) values (19, 'USA', 'Palm Bay', 'FL', '28.034462, -80.588665', 620567)
insert into hotel(id, city, name, address, zip) values (19, 19, 'Jameson Inn', '890 Palm Bay Rd NE', '32905')

-- San Francisco
insert into city(id, country, name, state, map, index) values (20, 'USA', 'San Francisco', 'CA', '37.77493, -122.419415', 620065)
insert into hotel(id, city, name, address, zip) values (20, 20, 'Marriot Downtown', '55 Fourth Street', '94103')

-- Washington
insert into city(id, country, name, state, map, index) values (21, 'USA', 'Washington', 'DC', '38.895112, -77.036366', 620047)
insert into hotel(id, city, name, address, zip) values (21, 21, 'Hotel Rouge', '1315 16th Street NW', '20036')5