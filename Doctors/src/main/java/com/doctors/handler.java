/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doctors;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;
import com.intents.CancelandStopIntentHandler;
import com.intents.HelpIntentHandler;
import com.intents.LaunchRequestHandler;
import com.intents.SessionEndedRequestHandler;
import com.intents.Summary;
import com.intents.nextAvailable;
import com.intents.setUp;
/**
 *
 * @author aabdin02
 */
public class handler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new Summary(),
                        new nextAvailable(),
                        new setUp(),
                        new SessionEndedRequestHandler())
                .build();
    }

    public handler() {
        super(getSkill());
    }

}
    
