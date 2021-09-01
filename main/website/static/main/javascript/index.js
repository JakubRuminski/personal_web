

document.addEventListener( "DOMContentLoaded", init, false );

function init( ) {
    window.setInterval( scrollingTarget, 1, "#education > img" );
}

function scrollingTarget( container ) {
    /* while scrolling from start to end of 
       container it's opacity is increased. */
    let elm = document.querySelector(container);
    let html = document.querySelector("html");

    let bottom = html.scrollTop + elm.scrollHeight;
    let imgTop = elm.offsetTop;
    let imgBottom = elm.scrollHeight + elm.offsetTop;
    if ((imgBottom) >= bottom && bottom >= imgTop) {
        let accelarate_fade = 1.2;
        new_opacity_w_delay = ((bottom-imgTop)/(imgBottom - imgTop))*accelarate_fade;
        elm.style.opacity = new_opacity_w_delay;
    }
}
