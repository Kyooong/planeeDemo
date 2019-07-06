//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class DemoController {
//    @Autowired
//    DemoRepository demoRepository;
//
//    @GetMapping("/")
//    public String home(Model model) {
//        System.out.println(demoRepository.findById("1").get());
//        Demo demo = demoRepository.findById("1").get();
//        model.addAttribute("demo", demo);
//        return "home";
//    }
//
//}