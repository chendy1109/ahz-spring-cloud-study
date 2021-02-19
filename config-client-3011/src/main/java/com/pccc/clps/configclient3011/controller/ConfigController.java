package com.pccc.clps.configclient3011.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConfigController {

    @Value("${demo-config-profile-env}")
    public String profileEnv;

    @Value("${zuowenjun.site}")
    public String zwjSite;

    @Value("${zuowenjun.skills}")
    public String zwjSkills;

    @Value("${zuowenjun.motto}")
    public String zwjMotto;

    @RequestMapping("/getConfig4Remote")
    public Map<String,Object> getConfig4Remote() {
        Map<String,Object> retMap = new HashMap<>();
        retMap.put("profileEnv",profileEnv);
        retMap.put("zwjSite",zwjSite);
        retMap.put("zwjSkills",zwjSkills);
        retMap.put("zwjMotto",zwjMotto);
        return retMap;
    }
}
