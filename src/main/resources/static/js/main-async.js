var xhr = new XMLHttpRequest();
xhr.open('GET', '/customers', false);
xhr.onload = function (e) {
    if (xhr.readyState === 4) {
        if (xhr.status === 200) {
            resp = JSON.parse(xhr.responseText);
            var div = document.createElement("div");

            for (var i = 0; i < resp._embedded.customer.length; i++) {
                var fname = resp._embedded.customer[i].firstName;
                var lname = resp._embedded.customer[i].lastName;
                var links = document.createElement("li");
                var text = document.createTextNode(fname + " " + lname);
                links.appendChild(text);
                div.appendChild(links);
            }
            document.getElementById("microtest").appendChild(div);

        } else {
            console.error(xhr.statusText);
        }
    }
};
xhr.onerror = function (e) {
    console.error(xhr.statusText);
};
xhr.send(null);