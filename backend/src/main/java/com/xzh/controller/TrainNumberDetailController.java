package com.xzh.controller;

import com.xzh.common.JsonData;
import com.xzh.model.TrainNumber;
import com.xzh.model.TrainNumberDetail;
import com.xzh.model.TrainStation;
import com.xzh.param.TrainNumberDetailParam;
import com.xzh.service.TrainNumberDetailService;
import com.xzh.service.TrainNumberService;
import com.xzh.service.TrainStationService;
import dto.TrainNumberDetailDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/admin/train/numberDetail")
public class TrainNumberDetailController {

    @Resource
    private TrainStationService trainStationService;
    @Resource
    private TrainNumberDetailService trainNumberDetailService;
    @Resource
    private TrainNumberService trainNumberService;


    @RequestMapping("/list.page")
    public ModelAndView page(){
        return new ModelAndView("trainNumberDetail");
    }

    @RequestMapping("/list.json")
    @ResponseBody
    public JsonData list(){
        List<TrainStation> stationList = trainStationService.getAll();
        Map<Integer, String> stationMap = stationList.stream().collect(Collectors.toMap(TrainStation::getId, TrainStation::getName));

        List<TrainNumber> numberList = trainNumberService.getAll();
        Map<Integer, String> numberMap = numberList.stream().collect(Collectors.toMap(TrainNumber::getId, TrainNumber::getName));
        List<TrainNumberDetail> detailList = trainNumberDetailService.getAll();
        List<TrainNumberDetailDto> dtoList = detailList.stream().map(detail -> {
            TrainNumberDetailDto dto = new TrainNumberDetailDto();
            dto.setId(detail.getId());
            dto.setTrainNumberId(detail.getTrainNumberId());
            dto.setTrainNumber(numberMap.get(detail.getTrainNumberId()));
            dto.setFromStationId(detail.getFromStationId());
            dto.setFromStation(stationMap.get(detail.getFromStationId()));
            dto.setFromCityId(detail.getFromCityId());
            dto.setToStationId(detail.getToStationId());
            dto.setToStation(stationMap.get(detail.getToStationId()));
            dto.setToCityId(detail.getToCityId());
            dto.setStationIndex(detail.getStationIndex());
            dto.setRelativeMinute(detail.getRelativeMinute());
            dto.setWaitMinute(detail.getWaitMinute());
            dto.setMoney(detail.getMoney());
            return dto;
        }).collect(Collectors.toList());
        return JsonData.success(dtoList);
    }

    @RequestMapping("/save.json")
    @ResponseBody
    public JsonData save(TrainNumberDetailParam param){
        trainNumberDetailService.save(param);
        return JsonData.success();
    }

    @RequestMapping("/delete.json")
    @ResponseBody
    public JsonData delete(@RequestParam("id") Integer id){
        trainNumberDetailService.delete(id);
        return JsonData.success();
    }
}
