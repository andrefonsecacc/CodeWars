Array.prototype.filter = function (func) {
  //nothing here, you will feel pretty awesome to write down by yourself
  //have fun :)
	const res = [];
  for(var i = 0; i< this.length ; i++){  
		  if(func(this[i])){res.push(this[i]);}
	}
	return res;
}
