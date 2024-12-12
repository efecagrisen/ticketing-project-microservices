package com.cydeo.entity;

import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "insert_date_time", nullable = true, updatable = false)
    private LocalDateTime insertDateTime;

    @Column(name = "insert_user_id", nullable = true, updatable = false)
    private Long insertUserId;

    @Column(name = "last_update_date_time", nullable = true)
    private LocalDateTime lastUpdateDateTime;

    @Column(name = "last_update_user_id", nullable = true, columnDefinition = "bigint")
    private Long lastUpdateUserId;

    @Column(name = "is_deleted", columnDefinition = "boolean default false")
    private Boolean isDeleted = false;
}