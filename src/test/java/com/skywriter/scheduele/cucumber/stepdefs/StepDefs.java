package com.skywriter.scheduele.cucumber.stepdefs;

import com.skywriter.scheduele.ScheduleApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ScheduleApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
