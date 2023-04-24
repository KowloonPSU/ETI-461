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
public class Media implements Serializable
{
    private static final long serialVersionUID = 1L;

    // 0-tv, 1-movie
    private int type;

    /** $column.columnComment */
    private String name;

    /** $column.columnComment */
    private String genre;

    /** $column.columnComment */
    private String length;

    /** $column.columnComment */
    private String director;

    /** $column.columnComment */
    private Long year;

    /** $column.columnComment */
    private String language;

    /** $column.columnComment */
    private String cc;
}
