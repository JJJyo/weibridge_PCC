package com.atguigu.springboot.controller;
import com.atguigu.springboot.bean.Carnumber;
import com.atguigu.springboot.bean.PInfo;
import com.atguigu.springboot.service.CarNumberService;
import com.atguigu.springboot.service.PInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class CarCodeController {

    @Autowired
    PInfoService pInfoService;
    @Autowired
    CarNumberService carNumberService;
    @GetMapping("/cars")
    public String list(){
        return "car_code/list";
    }

    @PostMapping("/carNumber")
    public String uplaod(HttpServletRequest req, @RequestParam("file") String number, Model m){

        ArrayList<String> successList = new ArrayList<>();
        List<PInfo> pInfos = pInfoService.getAll();//找出所有人
        List<Carnumber> carnumbers = carNumberService.getByNumber(number);//找出所有对应的车牌的纪录
        //循环输出每条纪录
        for (  Carnumber carnumber:carnumbers
             ) {
            System.out.println(carnumber.getCarnumber());
            System.out.println(carnumber.getLocation());
            System.out.println(carnumber.getTime());

            for (PInfo p: pInfos
                 ) {
                Calendar c1 = Calendar.getInstance();
                Calendar c2 = Calendar.getInstance();
                Calendar c3 = Calendar.getInstance();

                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                ParsePosition pos = new ParsePosition(0);
                SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                ParsePosition pos2 = new ParsePosition(0);
                String strDate = p.getpTime();
                String tuTime = carnumber.getTime();
                Date strtodate = formatter.parse(strDate, pos);
                Date strtodate2 = formatter2.parse(tuTime, pos2);
                c1.setTime(strtodate);//要判断的日期
                c2.setTime(strtodate2);//初始日期
                c3.setTime(strtodate2);//也给初始日期 把分钟加五
                c3.add(Calendar.MINUTE, 5);
                c2.add(Calendar.MINUTE, -5);//减去五分钟

                if (c1.after(c2) && c1.before(c3)) {
                        successList.add(p.getpPicturelocal().replace("C:\\picturebase\\","http://localhost:8083/image/"));
                } else {

                }
            }

        }


        m.addAttribute("success",successList);
        m.addAttribute("cars",carnumbers);
        return "car_code/list";
    }
}
