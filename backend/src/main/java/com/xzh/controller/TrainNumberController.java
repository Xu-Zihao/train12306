package com.xzh.controller;

import com.xzh.common.JsonData;
import com.xzh.model.TrainNumber;
import com.xzh.model.TrainStation;
import com.xzh.param.TrainNumberParam;
import com.xzh.service.TrainNumberService;
import com.xzh.service.TrainStationService;
import dto.TrainNumberDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/admin/train/number")
public class TrainNumberController {

    @Resource
    private TrainNumberService trainNumberService;
    @Resource
    private TrainStationService trainStationService;

    @RequestMapping("/list.page")
    public ModelAndView page(){
        return new ModelAndView("trainNumber");
    }

    @RequestMapping("/list.json")
    @ResponseBody
    public JsonData list(){
        List<TrainStation> stationList = trainStationService.getAll();
        List<TrainNumber> trainNumberList = trainNumberService.getAll();
        Map<Integer, String> stationMap = stationList.stream().collect(Collectors.toMap(TrainStation::getId, TrainStation::getName));
        List<TrainNumberDto> dtoList = trainNumberList.stream().map(trainNumber -> {
            TrainNumberDto trainNumberDto = new TrainNumberDto();
            trainNumberDto.setId(trainNumber.getId());
            trainNumberDto.setName(trainNumber.getName());
            trainNumberDto.setFromStationId(trainNumber.getFromStationId());
            trainNumberDto.setFromStation(stationMap.get(trainNumber.getFromStationId()));
            trainNumberDto.setToStationId(trainNumber.getToStationId());
            trainNumberDto.setToStation(stationMap.get(trainNumber.getToStationId()));
            trainNumberDto.setFromCityId(trainNumber.getFromCityId());
            trainNumberDto.setToCityId(trainNumber.getToCityId());
            trainNumberDto.setTrainType(trainNumber.getTrainType());
            trainNumberDto.setType(trainNumber.getType());
            trainNumberDto.setSeatNum(trainNumber.getSeatNum());
            return trainNumberDto;
        }).collect(Collectors.toList());
        return JsonData.success(dtoList);
    }

    @RequestMapping("/save.json")
    @ResponseBody
    public JsonData save(TrainNumberParam param){
        trainNumberService.save(param);
        return JsonData.success();
    }

    @RequestMapping("/update.json")
    @ResponseBody
    public JsonData update(TrainNumberParam param){
        trainNumberService.update(param);
        return JsonData.success();
    }
}
