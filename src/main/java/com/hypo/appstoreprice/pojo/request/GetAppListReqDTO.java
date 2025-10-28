package com.hypo.appstoreprice.pojo.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * get app list req dto
 *
 * @author hypo
 * @date 2025-09-17
 */
@Data
public class GetAppListReqDTO {

    /**
     * area code
     */
    @NotBlank(message = "areaCode can not be blank")
    private String areaCode;

    /**
     * app name
     */
    @NotBlank(message = "appName can not be blank")
    private String appName;

}
