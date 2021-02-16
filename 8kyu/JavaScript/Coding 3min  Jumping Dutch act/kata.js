function sc(floor){
  var res = "";
  
  if(floor > 1)
  {
  
    if(floor <= 6){
      
      for(var i=1 ; i<=(floor-1); i++){
        res = res + "Aa~ ";
      }
      res = res + "Pa! Aa!"
      
      return res;
    }
    
    
    for(var i = 1 ; i<=(floor-1);i++){
      res = res + "Aa~ ";
    }
      res = res + "Pa!";
      
    return res
  }
  
  
  return res;
}