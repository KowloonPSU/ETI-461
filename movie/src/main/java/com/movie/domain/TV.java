package com.movie.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Tv对象 TV
 * 
 * @author movie
 * @date 2023-04-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TV implements Serializable
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String tvName;

    /** $column.columnComment */
    private String tvGenre;

    /** $column.columnComment */
    private String tvLength;

    /** $column.columnComment */
    private String tvDirector;

    /** $column.columnComment */
    private Long tvYear;

    /** $column.columnComment */
    private String tvLanguage;

    /** $column.columnComment */
    private String tvCc;

    public void setTvName(String tvName) 
    {
        this.tvName = tvName;
    }

    public String getTvName() 
    {
        return tvName;
    }
    public void setTvGenre(String tvGenre) 
    {
        this.tvGenre = tvGenre;
    }

    public String getTvGenre() 
    {
        return tvGenre;
    }
    public void setTvLength(String tvLength) 
    {
        this.tvLength = tvLength;
    }

    public String getTvLength() 
    {
        return tvLength;
    }
    public void setTvDirector(String tvDirector) 
    {
        this.tvDirector = tvDirector;
    }

    public String getTvDirector() 
    {
        return tvDirector;
    }
    public void setTvYear(Long tvYear) 
    {
        this.tvYear = tvYear;
    }

    public Long getTvYear() 
    {
        return tvYear;
    }
    public void setTvLanguage(String tvLanguage) 
    {
        this.tvLanguage = tvLanguage;
    }

    public String getTvLanguage() 
    {
        return tvLanguage;
    }
    public void setTvCc(String tvCc) 
    {
        this.tvCc = tvCc;
    }

    public String getTvCc() 
    {
        return tvCc;
    }

}
