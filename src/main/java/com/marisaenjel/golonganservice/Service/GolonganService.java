/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marisaenjel.golonganservice.Service;

import com.marisaenjel.golonganservice.Entity.Golongan;
import com.marisaenjel.golonganservice.Repository.GolonganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service

public class GolonganService {
    @Autowired
    private GolonganRepository golonganRepository;
    
       public Golongan saveGolongan(Golongan golongan) {
        if (golongan.getGolonganGajiPokok() == 1) {
            long gajipokok = 9000000;
            golongan.setGolonganGajiPokok(gajipokok);
        } else if (golongan.getGolonganGajiPokok() == 2){
            long gajipokok = 7000000;
            golongan.setGolonganGajiPokok(gajipokok);
        } else if (golongan.getGolonganGajiPokok() == 3){
            long gajipokok = 5000000;
            golongan.setGolonganGajiPokok(gajipokok);
        } 
        return golonganRepository.save(golongan);
    }
    
    public Golongan findGolonganById(Long golonganId){
        return golonganRepository.findByGolonganId(golonganId);
    }
}
