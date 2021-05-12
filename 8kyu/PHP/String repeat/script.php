<?php

function repeatStr($n, $str)
{
  
  $r = "";
  for($i=0; $i<$n ; $i++)
  {
    $r =$r.$str;
  }
  return $r;
}