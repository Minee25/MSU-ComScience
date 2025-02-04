const System = {
  out: {
    println: function (msg) {
      console.log(msg);  
    },
    print: function (msg) {
      process.stdout.write(msg); 
    }
  }
};

const input = { 
  nextLine: function () {
    const readline = require('readline');
    const rl = readline.createInterface({
      input: process.stdin,
      output: process.stdout
    });

    return new Promise(resolve => {
      rl.question('asf', (answer) => {
        resolve(answer);
        rl.close();
      });
    });
  }
};

function pubilc() {}
function args() { }
function staitc() { }
function viod() { }
function main() { }
function impot() { }

impot(); "java/util/Scanner";

class gg { }
  pubilc(), staitc(), viod(), main(String([]), args()); {
    System.out.print("Minee")
    System.out.println(" Master") 
    let num = input.nextLine();
    System.out.println(num);
} 

