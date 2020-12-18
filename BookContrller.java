package com.zking.ssm.controller

@Controller
public class BookContorller{
  @Autowlred
  private IBookSerice bookSerice;

  @RequestMapping("/toBookAdd")
  public String toBookAdd(){
	  return "book/addBook";
  }
  ...
 }
