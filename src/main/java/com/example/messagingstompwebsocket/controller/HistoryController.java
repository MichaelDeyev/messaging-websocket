package com.example.messagingstompwebsocket.controller;

import com.example.messagingstompwebsocket.model.OutputMessage;
import com.example.messagingstompwebsocket.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller
public class HistoryController {

    @Autowired
    private MessageRepo messageRepo;

    @GetMapping("/history")
    public String history(Model model) {
        Iterable<OutputMessage> allMessage = messageRepo.findAll();
        model.addAttribute("messages", allMessage);
        return "history";
    }

//    @GetMapping("/history")
//    public String history(Map<String, Object> model){
//        Iterable<OutputMessage> messages = messageRepo.findAll();
//
//        model.put("messages", messages);
//        return "templates/history";
//    }

//    @RequestMapping(method = RequestMethod.GET, value = "/history")
//    public ModelAndView history() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("history.html");
//        return modelAndView;
//    }

//    @GetMapping("/history")
//    public List<String> history(){
//        Iterable<OutputMessage> all = messageRepo.findAll();
//        List<String> stringList = new ArrayList<>();
//
//        for (OutputMessage message :
//                all) {
//            stringList.add(message.toString());
//        }
//        return stringList;
//    }
}

