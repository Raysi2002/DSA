// function first(){
//     const a = 116;
//     function second(){
//         function third(){
//             function fourth(){
//                 console.log(a);
//             }
//             fourth();
//         }
//         third();
//     }
//     second();
// }


function createGame(){
    let score = 0;

    function increaseScore(points){
        score += points;
        console.log(`+${points}pts`);
    }

    function decreaseScore(points){
        score -= points;
        console.log(`-${points}pts`);
    }

    function getScore(){
        return score;
    }

    return {increaseScore, decreaseScore, getScore};
}

score = 10000000000;

const game = createGame();
game.increaseScore(5);
game.increaseScore(6);
game.increaseScore(5);
game.decreaseScore(3);
console.log("Current Score: " + game.getScore() + "pts");