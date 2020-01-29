const request = async () => {
    const response = await fetch('https://testapi.io/api/akash1106/getQuiz/web1');
    quizContent = await response.json();
    console.log(quizContent);
    return quizContent;
}

async function populateQuiz() {
    var quizContent;
    quizContent = await request();
    var renderQuiz = document.getElementById('quizBody').innerHTML;
    //console.log(renderQuiz);
    renderQuiz += '<div class="row"><h2>' + quizContent.name + '</h2></div>';
    //console.log(renderQuiz);
    //document.getElementById('quizBody').innerHTML = renderQuiz;
    renderQuiz += '<div class="row">';
    var n = quizContent.questions.length;
    for (i = 0; i < n; i++) {
        renderQuiz += '<div class="alert alert-info container-fluid ibox" role="alert"> <div class="row"> <div class="col-sm">' + quizContent.questions[i].number + '. ' + quizContent.questions[i].question + '</div></div>';
        if (quizContent.questions[i].type == "MCQ") {
            for (j = 0; j < quizContent.questions[i].options.length; j++) {
                renderQuiz += '<div class="row options"> <div class="custom-control custom-radio"> <input type="radio" class="custom-control-input" id="' + quizContent.questions[i].number + j + '" name="' + quizContent.questions[i].number + '"> <label class="custom-control-label" for="' + quizContent.questions[i].number + j + '">';
                renderQuiz += quizContent.questions[i].options[j];
                renderQuiz += '</label> </div> </div>'
            }
        }
        renderQuiz += '</div>';
    }
    renderQuiz += '</div> </div>';
    console.log(renderQuiz);
    document.getElementById('quizBody').innerHTML = renderQuiz;
}