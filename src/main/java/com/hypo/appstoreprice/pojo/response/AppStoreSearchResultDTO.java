package com.hypo.appstoreprice.pojo.response;

import lombok.Data;

import java.math.BigDecimal;

/**
 * app store search result dto
 *
 * @author hypo
 * @date 2025-10-20
 */
@Data
public class AppStoreSearchResultDTO {

    /**
     * track id
     */
    private String trackId;

    /**
     * track name
     */
    private String trackName;

    /**
     * artwork url100
     */
    private String artworkUrl100;

    /**
     * description
     */
    private String description;

    /**
     * average user rating
     */
    private BigDecimal averageUserRating;

}
