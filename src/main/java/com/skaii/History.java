package com.skaii;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * History.
 *
 * @author Igor_Zolov
 */
@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode
@ToString
public class History {

    private Number revisionId;

    private String author;

    /**
     * Is a moment of the change.
     */
    private Date date;

    private String systemName;

    private String baseStatusClient;

    private String extendedStatusClient;

    private String actionClient;

    private String baseStatusBank;

    private String extendedStatusBank;

    private String actionBank;

    private String group;

}
