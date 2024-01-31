function displayBody () {

    let body = 
    `
    <form>
    <input type="radio" name="radio" value="1" onchange="display()" checked>
    <input type="radio" name="radio" value="2" onchange="display()">
    </form>
    <div id="displayArea"></div>
    ` ;

    document.getElementById("bodyDiv").innerHTML = body;
    display();
}

function display(){

    let html;
    for(radio of document.getElementsByName("radio")){
        if(radio.checked){
            if(radio.value == 1){
                html = 
                `
                <button id="botton01" onclick="displayText('りんご')">ボタン1</button>
                <button id="botton02" onclick="displayText('みかん')">ボタン2</button>
                <button id="botton03" onclick="displayText('いちご')">ボタン3</button>
                <div id="fruit"></div>
                `;
            } else if (radio.value == 2){
                html = `<h1>AAA</h1>`
            }
        }
    }

    document.getElementById("displayArea").innerHTML = html
}

function displayText (fruit) {
    document.getElementById("fruit").innerText = fruit;
}


window.onload = function () {
    displayBody();
};