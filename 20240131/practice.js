function displayBody () {

    let body = 
    `
    <form>
    <label>ラジオボタン1</label>
    <input type="radio" name="radio" value="1" onchange="display()" checked>
    <label>ラジオボタン2</label>
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
                <button id="botton01" onclick="displayFruit('りんご')">ボタン1</button>
                <button id="botton02" onclick="displayFruit('みかん')">ボタン2</button>
                <button id="botton03" onclick="displayFruit('いちご')">ボタン3</button>
                <h1 id="fruit"></h1>
                `;
            } else if (radio.value == 2){
                html =
                `
                <h2 id=text>あいうえおかきくけこさしすせそ</h2>

                <input type="text" id="textbox" onchange="displayCharAt()">
                文字目の文字は"<span id="char">?</span>"です。
                `;
            }
        }
    }

    document.getElementById("displayArea").innerHTML = html
}

function displayFruit (fruit) {
    document.getElementById("fruit").innerText = fruit;
}

function displayCharAt () {

    let text = document.getElementById("text").innerText;
    let char = text.charAt(Number(document.getElementById("textbox").value) - 1);

    if(char.length == 0){
        char = "?";
    }

    document.getElementById("char").innerText = char;
}

window.onload = function () {
    displayBody();
};