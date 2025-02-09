const text = "Minee";
setInterval(() => {  
  if (document.title !== text) {
    document.title = text;
  }
}, 1000);