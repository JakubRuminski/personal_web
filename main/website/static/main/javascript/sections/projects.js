
function changeFileVisibility( button_id ) {
    file = document.querySelector( "#"+button_id+" + button + code pre" );
    if (file == null) {
        file = document.querySelector( "#"+button_id+" + button + code + pre" );
    }
    if (file == null) {
        file = document.querySelector( "#"+button_id+" + iframe" );
    }
    if (file.style.display == "none") {
        file.style.display = "block";
    }
    else {
        file.style.display = "none";
    }
}

function changeFileBackground( button_id ) {
    button = document.querySelector( "#"+button_id);
    file = document.querySelector( "#"+button_id+"+ code pre" );
    if (file == null) {
        file = document.querySelector( "#"+button_id+" + code + pre" );
    }
    if (file.style.background == "none" || file.style.background == "white") {
        file.style.background = "black";
        file.style.color = "white"
        button.innerHTML = '&#127770';
    }
    else {
        file.style.background = "white";
        file.style.color = "black";
        button.innerHTML = '&#127774';
    }
}