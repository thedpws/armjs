alert("you too kys");

let data = {};

function sendArmCode() {

    const arm = document.getElementById("arm-code").value;
    const xhr = new XMLHttpRequest();
    xhr.onreadystatechange = () => {
        if (xhr.readyState !== 4) return;
        else {
            document.getElementById("results").innerText = xhr.responseText;
            const obj = JSON.parse(xhr.responseText);
        }
    };
    xhr.open("PUT", `/arm?code=${arm}`);
    xhr.send();

}