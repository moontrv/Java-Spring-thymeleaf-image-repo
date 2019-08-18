package com.avatarlib.data;

import com.avatarlib.model.Image;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ImageRepository {
    private static final List<Image> ALL_IMAGES = Arrays.asList(
            new Image("cat", 1, LocalDate.of(2015,2,13), "cat", false),
            new Image("dog", 1, LocalDate.of(2015,10,30), "dog", true),
            new Image("simsons", 3, LocalDate.of(2015,9,15), "simsons", false),
            new Image("coding", 2, LocalDate.of(2015,2,13), "coder", true),
            new Image("cowboy", 1, LocalDate.of(2015,2,13), "cowboy", false),
            new Image("footballer", 1, LocalDate.of(2015,8,23), "footballer", true)
    );

    public Image findByName(String name){
        for(Image image: ALL_IMAGES){
            if(image.getName().equals(name)){
                return image;
            }
        }
        return null;
    }

    public List<Image> getAllImages(){
        return ALL_IMAGES;
    }

    public List<Image> findByCategoryId(int id){
        List<Image> images = new ArrayList<>();
        for(Image image: ALL_IMAGES){
            if(image.getCategoryId() == id){
                images.add(image);
            }
        }
        return images;
    }
}
