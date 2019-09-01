console.log('Witaj na konsoli.');

function isBiggerThan5(x) {
    if(x > 5) {
    return true;
    } else {
    return false;
    }
}

function choinka(x) {
    var line = '';
    for(var i = 1; i <= x; i++) {
        line += '*';
        console.log(line);
    }
}

function choinkaAdvanced(x) {
    var width = x * 2 - 1;

    for(var i = 1; i <= x; i++) {
        var starsCount = i * 2 - 1;
        var line = '';
        for(var j = 0; j < (width - starsCount) / 2; j++) {
            line += ' ';
        }
        for(var j = 0; j < starsCount; j++) {
            line += '*';
        }
        console.log(line);
    }
}

