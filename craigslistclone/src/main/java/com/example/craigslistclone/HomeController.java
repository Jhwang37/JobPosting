package com.example.craigslistclone;

import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    jobRespository jobRepository;


    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("jobs", jobRepository.findAll());
        model.addAttribute("datetime", new Date());
        return "index";
    }

    @GetMapping("/add")
    public String jobForm(Model model) {
        model.addAttribute("job", new Job());
        return "add";
    }

    @PostMapping("/process")
    public String processForm(@Valid Job job, BindingResult result) {
        LocalDate date = LocalDate.now();
        job.setDate(date);
        jobRepository.save(job);
        return "redirect:/";
    }
    @RequestMapping("/detail/{id}")
    public String showJob(@PathVariable("id") long id, Model model){
        model.addAttribute("job", jobRepository.findById(id).get());
        return "show";
    }
    @RequestMapping("/update/{id}")
    public String updateJob(@PathVariable("id") long id, Model model){
        model.addAttribute("job", jobRepository.findById(id).get());
        return "update";
    }
    @RequestMapping("/delete/{id}")
    public String delJob(@PathVariable("id") long id){
        jobRepository.deleteById(id);
        return "redirect:/";
    }
}
