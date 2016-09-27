var xhr = new XMLHttpRequest();
xhr.open('GET', '/cities', false);
xhr.onload = function (e) {
    if (xhr.readyState === 4) {
        if (xhr.status === 200) {
            resp = JSON.parse(xhr.responseText);
            
            for (var i = 0; i < resp._embedded.citys.length; i++) {
                var country = resp._embedded.citys[i].country;
                var name = resp._embedded.citys[i].name;
                var tr = document.createElement("tr");
                var Tcountry = document.createTextNode(country);
                var Tname = document.createTextNode(name);
                
                var td = document.createElement("td");
                td.appendChild(Tcountry);
                tr.appendChild(td);               
                td = document.createElement("td");
                td.appendChild(Tname);
                tr.appendChild(td);               
                document.getElementById("citytable").appendChild(tr);
            }

        } else {
            console.error(xhr.statusText);
        }
    }
};
xhr.onerror = function (e) {
    console.error(xhr.statusText);
};
xhr.send(null);
