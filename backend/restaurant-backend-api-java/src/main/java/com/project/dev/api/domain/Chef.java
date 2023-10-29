/*
 * @fileoverview    {Chef}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Definición de {@code Chef}.
 *
 * @author Dyson Parra
 * @since 11
 */
@Entity
@Table(name = "\"Chef\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Chef implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intChefId;
    @Column(length = 45)
    private String strChefName;
    @Column(precision = 12, scale = 0)
    private Float fltSalary;

}
