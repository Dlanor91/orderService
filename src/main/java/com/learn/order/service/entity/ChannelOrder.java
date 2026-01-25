package com.learn.order.service.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.OffsetDateTime;
import java.util.Map;

@Entity
@Table(name = "channel_orders", schema = "order_hub",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_channel_external_order",
                        columnNames = {"channel", "external_order_id"}
                )
        }
)
public class ChannelOrder extends BaseEntity {

    @Column(name = "channel", nullable = false, length = 100)
    private String channel;

    @Column(name = "external_order_id", nullable = false, length = 100)
    private String externalOrderId;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "raw_payload", nullable = false, columnDefinition = "jsonb")
    private Map<String, Object> rawPayload;

    @Column(name = "received_at", nullable = false, updatable = false)
    private OffsetDateTime receivedAt;

    @Column(name = "processed", nullable = false)
    private boolean processed = false;

    @PrePersist
    void onCreate() {
        if (receivedAt == null)
            receivedAt = OffsetDateTime.now();
    }
}
