function findOdd(A) {
  //happy coding!
  var odd;
  var i;
  var j;
  var total;
  var valuetocheck;
  
  for(i=0; i<A.length;i++){
    //console.log(i);
    total=0;
    valuetocheck = A[i];
    
    for (j=0;j<A.length;j++){
      
      if (A[j]==valuetocheck){
          total++;
      }

    }
    
     if((total%2)!=0){
        odd=valuetocheck;
    }
    
  }
  
  
  return odd;
}