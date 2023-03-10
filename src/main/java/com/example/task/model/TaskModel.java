package com.example.task.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@ToString
@Entity
@Table(name = "task")

public class TaskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "task_title", nullable = false)
    String taskTitle;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name = "task_date", nullable = false)
    LocalDate taskDate;

    // @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "task_start_time", nullable = false)
    String startTime;

    // @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "task_end_time", nullable = false)
    String endTime;

    @Column(name = "total_time", nullable = false)
    String totalTime;

    @Column(name = "status", nullable = false)
    String status;

}
