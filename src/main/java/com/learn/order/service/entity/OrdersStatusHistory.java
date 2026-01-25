package com.learn.order.service.entity;

import com.learn.order.service.model.Status;
import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "orders_status_history")
public class OrdersStatusHistory extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "previous_status", nullable = false, length = 50)
    private Status previousStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "new_status", nullable = false, length = 50)
    private Status newStatus;

    @Column(name = "changed_at", nullable = false)
    private OffsetDateTime changedAt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", nullable = false, foreignKey = @ForeignKey(name = "fk_orders_status_history_order"))
    private Order order;

    @PrePersist
    void onCreate() {
        if (changedAt == null) {
            changedAt = OffsetDateTime.now();
        }
    }
}
