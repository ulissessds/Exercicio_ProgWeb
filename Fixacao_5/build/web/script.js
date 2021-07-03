function validarForm(id) {
    var username = document.getElementById(id);
    
    if (username === null) {
        alert("O elemento de busca não existe");
        return false;
    }
    if (username.value === null || username.value.length === 0 || (/^\s+$/.test(username.value))) {
        alert("Preencha o elemento de busca");
        return false;
    }
    return true;
}

function validarTamanhoTexto(id, minimo, maximo) {
    if (!validarForm(id)) {
        return false;
    }
    var elemento = document.getElementById(id);
    if ((elemento.value.length < minimo) || (elemento.value.length > maximo)) {
        alert("Não pode mais do que 10 caracteres!");
        return false;
    }
    return true;
}

function checarOpcao(id) {
    var comboBox = document.getElementById(id);
    if (comboBox === null) {
        alert("O elemento não existe");
        return false;
    }
    var indice = comboBox.selectedIndex;
    if (indice === null || indice <=0) {
        alert("OPÇÃO INVÁLIDA...");
        return false;
    }
    alert("OPÇÃO VÁLIDA!!!");
    return true;
}

function checarBox() {
    var box = document.getElementById("box");
    if (box === null) {
        alert("O elemento não existe");
        return false;
    }
    if (!box.checked) {
        alert("Caixa NÃO selecionada...");
        return false;
    }
    alert("Caixa marcada!");
    return true;
}

function contarBoxes(name) {
    var boxes = document.getElementsByName(name);
    if (boxes === null || boxes.length === 0) {
        alert("Não existem elementos");
        return false;
    }
    var cont = 0;
    for (var i = 0; i < boxes.length; i++) {
        if (boxes[i].checked) {
            cont = cont + 1;
        }
    }
    alert("Número de caixas marcadas = " + cont);
}

function checarRadio(name) {
    var radios = document.getElementsByName(name);
    if (radios === null || radios.length === 0) {
        alert("Não existem elementos");
        return false;
    }
    for (var i = 0; i < radios.length; i++) {
        if (radios[i].checked) {
            alert("Pelo menos um está marcado!");
            return true;
        }
    }
    return false;
}

//questão final
function validar() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    
    if(!checarNome(username) || !checarSenha(password)) {
        return false;
    }
    alert("Entrada efetuada com sucesso!");
    return true;
}

function checarNome(username) {
    if(username === null || username.length === 0 || (/^\s+$/.test(username))){
        alert("Digite um nome válido");
        return false;
    }
    return true;
}

function checarSenha(password) {
    var regex = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{4,})");
    if(regex.test(password)){
        return true;
    }
    alert("Senha deve conter no mínimo: \n1 número, 1 letra minúscula, 1 letra maiúscula e 1 caractere especial");
    return false;
}