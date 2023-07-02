package com.xzh.controller;

import com.xzh.common.JsonData;
import com.xzh.model.TrainCity;
import com.xzh.model.TrainStation;
import com.xzh.param.TrainStationParam;
import com.xzh.service.TrainCityService;
import com.xzh.service.TrainStationService;
import dto.TrainStationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/admin/train/station")
public class TrainStationController {

    @Resource
    private TrainCityService trainCityService;
    @Resource
    private TrainStationService trainStationService;

    @RequestMapping("/list.page")
    public ModelAndView page(){
        return new ModelAndView("trainStation");
    }

    @RequestMapping("/list.json")
    @ResponseBody
    public JsonData list(){

        List<TrainCity> cityList = trainCityService.getAll();
        List<TrainStation> stationList = trainStationService.getAll();
        Map<Integer, String> cityMap = cityList.stream().collect(Collectors.toMap(TrainCity::getId, TrainCity::getName));
        List<TrainStationDto> stationDtoList = stationList.stream().map(s -> {
            TrainStationDto trainStationDto = new TrainStationDto();
            trainStationDto.setId(s.getId());
            trainStationDto.setName(s.getName());
            trainStationDto.setCityId(s.getCityId());
            trainStationDto.setCityName(cityMap.get(s.getCityId()));
            return trainStationDto;
        }).collect(Collectors.toList());
        return JsonData.success(stationDtoList);
    }

    @RequestMapping("/save.json")
    @ResponseBody
    public JsonData save(TrainStationParam param){
        trainStationService.save(param);
        return JsonData.success();
    }

    @RequestMapping("/update.json")
    @ResponseBody
    public JsonData update(TrainStationParam param){
        trainStationService.update(param);
        return JsonData.success();
    }
}
