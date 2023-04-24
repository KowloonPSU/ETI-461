package com.movie.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * movie对象 Movie
 * 
 * @author movie
 * @date 2023-04-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Serializable
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String movieName;

    /** $column.columnComment */
    private String movieGenre;

    /** $column.columnComment */
    private String movieLength;

    /** $column.columnComment */
    private String movieDirector;

    /** $column.columnComment */
    private Long movieYear;

    /** $column.columnComment */
    private String movieLanguage;

    /** $column.columnComment */
    private String movieCc;

    public void setMovieName(String movieName) 
    {
        this.movieName = movieName;
    }

    public String getMovieName() 
    {
        return movieName;
    }
    public void setMovieGenre(String movieGenre) 
    {
        this.movieGenre = movieGenre;
    }

    public String getMovieGenre() 
    {
        return movieGenre;
    }
    public void setMovieLength(String movieLength) 
    {
        this.movieLength = movieLength;
    }

    public String getMovieLength() 
    {
        return movieLength;
    }
    public void setMovieDirector(String movieDirector) 
    {
        this.movieDirector = movieDirector;
    }

    public String getMovieDirector() 
    {
        return movieDirector;
    }
    public void setMovieYear(Long movieYear) 
    {
        this.movieYear = movieYear;
    }

    public Long getMovieYear() 
    {
        return movieYear;
    }
    public void setMovieLanguage(String movieLanguage) 
    {
        this.movieLanguage = movieLanguage;
    }

    public String getMovieLanguage() 
    {
        return movieLanguage;
    }
    public void setMovieCc(String movieCc) 
    {
        this.movieCc = movieCc;
    }

    public String getMovieCc() 
    {
        return movieCc;
    }
}
