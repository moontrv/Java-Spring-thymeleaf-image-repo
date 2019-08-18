package com.avatarlib.controller;

import com.avatarlib.data.ImageRepository;
import com.avatarlib.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ImageController {

    @Autowired
    private ImageRepository imageRepository;

    @RequestMapping(value = "/")
    public String listAvatar(ModelMap modelMap){
        List<Image> images = imageRepository.getAllImages();
        modelMap.put("images", images);
        return "home";
    }

    @RequestMapping("/image/{name}")
    public String imageDetails(@PathVariable String name, ModelMap modelMap){
        Image image = imageRepository.findByName(name);
        modelMap.put("image", image);
        return "image-details";
    }


}
