package me.thstone.controller;

/**
 * Created by zhangshulei on 2017/8/22.
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import me.thstone.model.BookModel;
import me.thstone.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

  @Autowired
  private BookService bookService;

  @RequestMapping(value="/list",method=RequestMethod.GET)
   private String list(Model model){
      List<BookModel> list=bookService.getList();
      System.out.println("ok");
      model.addAttribute("list",list);
      return "list";
  }
  @RequestMapping(value="/index",method=RequestMethod.GET)
    private String index(){
       return "list";
  }
}
